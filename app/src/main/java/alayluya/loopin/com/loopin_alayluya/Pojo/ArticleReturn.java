package alayluya.loopin.com.loopin_alayluya.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by ranja_000 on 4/30/2017.
 */

public class ArticleReturn {

    @SerializedName("IsSuccess")
    @Expose
    private Boolean isSuccess;
    @SerializedName("Result")
    @Expose
    private ArrayList<Result> result = null;

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ArrayList<Result> getResult() {
        return result;
    }

    public void setResult(ArrayList<Result> result) {
        this.result = result;
    }


    public class Result{
        @SerializedName("Category")
        @Expose
        private Category category;
        @SerializedName("ArticlesList")
        @Expose
        private ArticleReturn articlesList;

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        public ArticleReturn getArticlesList() {
            return articlesList;
        }

        public void setArticlesList(ArticleReturn articlesList) {
            this.articlesList = articlesList;
        }

    public class Category {

        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("ArticleEntityEnumId")
        @Expose
        private Integer articleEntityEnumId;
        @SerializedName("ArticleEntityEnumName")
        @Expose
        private String articleEntityEnumName;
        @SerializedName("IsActive")
        @Expose
        private Boolean isActive;
        @SerializedName("LanguageId")
        @Expose
        private Integer languageId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getArticleEntityEnumId() {
            return articleEntityEnumId;
        }

        public void setArticleEntityEnumId(Integer articleEntityEnumId) {
            this.articleEntityEnumId = articleEntityEnumId;
        }

        public String getArticleEntityEnumName() {
            return articleEntityEnumName;
        }

        public void setArticleEntityEnumName(String articleEntityEnumName) {
            this.articleEntityEnumName = articleEntityEnumName;
        }

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public Integer getLanguageId() {
            return languageId;
        }

        public void setLanguageId(Integer languageId) {
            this.languageId = languageId;
        }
    }

        public class ArticlesList {

            @SerializedName("Contents")
            @Expose
            private ArrayList<Content> contents = null;
            @SerializedName("Paging")
            @Expose
            private Paging paging;

            public ArrayList<Content> getContents() {
                return contents;
            }

            public void setContents(ArrayList<Content> contents) {
                this.contents = contents;
            }

            public Paging getPaging() {
                return paging;
            }

            public void setPaging(Paging paging) {
                this.paging = paging;
            }

            public class Content {

                @SerializedName("Id")
                @Expose
                private Integer id;
                @SerializedName("Topic")
                @Expose
                private String topic;
                @SerializedName("Summary")
                @Expose
                private String summary;
                @SerializedName("Body")
                @Expose
                private Object body;
                @SerializedName("ShopId")
                @Expose
                private Object shopId;
                @SerializedName("HeaderPhotoId")
                @Expose
                private Integer headerPhotoId;
                @SerializedName("LanguageId")
                @Expose
                private Integer languageId;
                @SerializedName("AccountId")
                @Expose
                private Integer accountId;
                @SerializedName("IsOwnerUser")
                @Expose
                private Boolean isOwnerUser;
                @SerializedName("IsActive")
                @Expose
                private Boolean isActive;
                @SerializedName("IsPrivate")
                @Expose
                private Boolean isPrivate;
                @SerializedName("IsReported")
                @Expose
                private Boolean isReported;
                @SerializedName("IsFeatured")
                @Expose
                private Boolean isFeatured;
                @SerializedName("FeaturedBy")
                @Expose
                private Integer featuredBy;
                @SerializedName("FeaturedDate")
                @Expose
                private String featuredDate;
                @SerializedName("FeaturedDisplayOrder")
                @Expose
                private Integer featuredDisplayOrder;
                @SerializedName("CreatedDate")
                @Expose
                private String createdDate;
                @SerializedName("UpdatedDate")
                @Expose
                private String updatedDate;
                @SerializedName("PushedDate")
                @Expose
                private Object pushedDate;
                @SerializedName("ArticleType")
                @Expose
                private Integer articleType;
                @SerializedName("IsDisplayAllRegion")
                @Expose
                private Boolean isDisplayAllRegion;
                @SerializedName("IsAllCategory")
                @Expose
                private Boolean isAllCategory;

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getTopic() {
                    return topic;
                }

                public void setTopic(String topic) {
                    this.topic = topic;
                }

                public String getSummary() {
                    return summary;
                }

                public void setSummary(String summary) {
                    this.summary = summary;
                }

                public Object getBody() {
                    return body;
                }

                public void setBody(Object body) {
                    this.body = body;
                }

                public Object getShopId() {
                    return shopId;
                }

                public void setShopId(Object shopId) {
                    this.shopId = shopId;
                }

                public Integer getHeaderPhotoId() {
                    return headerPhotoId;
                }

                public void setHeaderPhotoId(Integer headerPhotoId) {
                    this.headerPhotoId = headerPhotoId;
                }

                public Integer getLanguageId() {
                    return languageId;
                }

                public void setLanguageId(Integer languageId) {
                    this.languageId = languageId;
                }

                public Integer getAccountId() {
                    return accountId;
                }

                public void setAccountId(Integer accountId) {
                    this.accountId = accountId;
                }

                public Boolean getIsOwnerUser() {
                    return isOwnerUser;
                }

                public void setIsOwnerUser(Boolean isOwnerUser) {
                    this.isOwnerUser = isOwnerUser;
                }

                public Boolean getIsActive() {
                    return isActive;
                }

                public void setIsActive(Boolean isActive) {
                    this.isActive = isActive;
                }

                public Boolean getIsPrivate() {
                    return isPrivate;
                }

                public void setIsPrivate(Boolean isPrivate) {
                    this.isPrivate = isPrivate;
                }

                public Boolean getIsReported() {
                    return isReported;
                }

                public void setIsReported(Boolean isReported) {
                    this.isReported = isReported;
                }

                public Boolean getIsFeatured() {
                    return isFeatured;
                }

                public void setIsFeatured(Boolean isFeatured) {
                    this.isFeatured = isFeatured;
                }

                public Integer getFeaturedBy() {
                    return featuredBy;
                }

                public void setFeaturedBy(Integer featuredBy) {
                    this.featuredBy = featuredBy;
                }

                public String getFeaturedDate() {
                    return featuredDate;
                }

                public void setFeaturedDate(String featuredDate) {
                    this.featuredDate = featuredDate;
                }

                public Integer getFeaturedDisplayOrder() {
                    return featuredDisplayOrder;
                }

                public void setFeaturedDisplayOrder(Integer featuredDisplayOrder) {
                    this.featuredDisplayOrder = featuredDisplayOrder;
                }

                public String getCreatedDate() {
                    return createdDate;
                }

                public void setCreatedDate(String createdDate) {
                    this.createdDate = createdDate;
                }

                public String getUpdatedDate() {
                    return updatedDate;
                }

                public void setUpdatedDate(String updatedDate) {
                    this.updatedDate = updatedDate;
                }

                public Object getPushedDate() {
                    return pushedDate;
                }

                public void setPushedDate(Object pushedDate) {
                    this.pushedDate = pushedDate;
                }

                public Integer getArticleType() {
                    return articleType;
                }

                public void setArticleType(Integer articleType) {
                    this.articleType = articleType;
                }

                public Boolean getIsDisplayAllRegion() {
                    return isDisplayAllRegion;
                }

                public void setIsDisplayAllRegion(Boolean isDisplayAllRegion) {
                    this.isDisplayAllRegion = isDisplayAllRegion;
                }

                public Boolean getIsAllCategory() {
                    return isAllCategory;
                }

                public void setIsAllCategory(Boolean isAllCategory) {
                    this.isAllCategory = isAllCategory;
                }
            }

                public class Paging {

                    @SerializedName("Page")
                    @Expose
                    private Integer page;
                    @SerializedName("Size")
                    @Expose
                    private Integer size;
                    @SerializedName("TotalCount")
                    @Expose
                    private Integer totalCount;
                    @SerializedName("TotalPages")
                    @Expose
                    private Integer totalPages;
                    @SerializedName("HasMorePages")
                    @Expose
                    private Boolean hasMorePages;

                    public Integer getPage() {
                        return page;
                    }

                    public void setPage(Integer page) {
                        this.page = page;
                    }

                    public Integer getSize() {
                        return size;
                    }

                    public void setSize(Integer size) {
                        this.size = size;
                    }

                    public Integer getTotalCount() {
                        return totalCount;
                    }

                    public void setTotalCount(Integer totalCount) {
                        this.totalCount = totalCount;
                    }

                    public Integer getTotalPages() {
                        return totalPages;
                    }

                    public void setTotalPages(Integer totalPages) {
                        this.totalPages = totalPages;
                    }

                    public Boolean getHasMorePages() {
                        return hasMorePages;
                    }

                    public void setHasMorePages(Boolean hasMorePages) {
                        this.hasMorePages = hasMorePages;
                    }


                }
             }
          }

    }
