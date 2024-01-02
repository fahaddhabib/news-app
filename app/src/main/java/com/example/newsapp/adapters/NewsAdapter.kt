package com.example.newsapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsapp.R
import com.example.newsapp.models.Article

class NewsAdapter: RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    lateinit var ArticleImage: ImageView
    lateinit var ArticleSource: TextView
    lateinit var ArticleTitle: TextView
    lateinit var ArticleDescription: TextView
    lateinit var ArticleDateTime: TextView


    private val differentCallBack= object : DiffUtil.ItemCallback<Article>(){
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        } }
    val differ = AsyncListDiffer(this, differentCallBack)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {

        return ArticleViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    private var onItemClickListener: ((Article) -> Unit)? = null

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = differ.currentList[position]
        ArticleImage = holder.itemView.findViewById(R.id.articleImage)
        ArticleSource = holder.itemView.findViewById(R.id.articleSource)
        ArticleTitle = holder.itemView.findViewById(R.id.articleTitle)
        ArticleDescription = holder.itemView.findViewById(R.id.articleDescription)
        ArticleDateTime = holder.itemView.findViewById(R.id.articleDateTime)

        holder.itemView.apply {
            Glide.with(this).load(article.urlToImage).into(ArticleImage)
            ArticleSource.text = article.source?.name
            ArticleTitle.text = article.title
            ArticleDescription.text = article.description
            ArticleDateTime.text = article.publishedAt

            setOnClickListener {
                onItemClickListener?. let {
                    it(article)
                }
            }
        }
    }
    fun setOnItemClickListener(listener: (Article) -> Unit){
        onItemClickListener = listener
    }
}