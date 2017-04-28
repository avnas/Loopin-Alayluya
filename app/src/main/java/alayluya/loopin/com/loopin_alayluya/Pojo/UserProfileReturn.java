package alayluya.loopin.com.loopin_alayluya.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UserProfileReturn {

    @SerializedName("IsSuccess")
    @Expose
    private Boolean isSuccess;
    @SerializedName("Result")
    @Expose
    private Results Result;

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Results getResult() {
        return Result;
    }

    public void setResult(Results Result) {
        this.Result = Result;
    }

    public UserProfileReturn(Boolean isSuccess, Results result) {
        this.isSuccess = isSuccess;
        Result = result;
    }

    public class Results {

        @SerializedName("IsSelf")
        @Expose
        private Boolean isSelf;
        @SerializedName("IsFollowing")
        @Expose
        private Boolean isFollowing;
        @SerializedName("IsFollower")
        @Expose
        private Boolean isFollower;
        @SerializedName("IsFriend")
        @Expose
        private Boolean isFriend;
        @SerializedName("IsDefaultProfileImage")
        @Expose
        private Boolean isDefaultProfileImage;
        @SerializedName("IsDefaultCoverImage")
        @Expose
        private Boolean isDefaultCoverImage;
        @SerializedName("ProfileImage")
        @Expose
        private Object profileImage;
        @SerializedName("CoverImage")
        @Expose
        private Object coverImage;
        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("LanguageId")
        @Expose
        private Integer languageId;
        @SerializedName("FirstName")
        @Expose
        private String firstName;
        @SerializedName("LastName")
        @Expose
        private String lastName;
        @SerializedName("DisplayName")
        @Expose
        private Object displayName;
        @SerializedName("Email")
        @Expose
        private String email;
        @SerializedName("ContactEmail")
        @Expose
        private Object contactEmail;
        @SerializedName("Tel")
        @Expose
        private Object tel;
        @SerializedName("Address")
        @Expose
        private Object address;
        @SerializedName("Password")
        @Expose
        private String password;
        @SerializedName("ActivationCode")
        @Expose
        private String activationCode;
        @SerializedName("FacebookId")
        @Expose
        private Object facebookId;
        @SerializedName("FacebookToken")
        @Expose
        private Object facebookToken;
        @SerializedName("TwitterToken")
        @Expose
        private Object twitterToken;
        @SerializedName("TwitterTokenSecret")
        @Expose
        private Object twitterTokenSecret;
        @SerializedName("IsAdmin")
        @Expose
        private Boolean isAdmin;
        @SerializedName("IsActive")
        @Expose
        private Boolean isActive;
        @SerializedName("IsDeleted")
        @Expose
        private Boolean isDeleted;
        @SerializedName("CreatedDate")
        @Expose
        private String createdDate;
        @SerializedName("UpdatedDate")
        @Expose
        private String updatedDate;
        @SerializedName("LastAccessDate")
        @Expose
        private Object lastAccessDate;
        @SerializedName("UniqueName")
        @Expose
        private String uniqueName;
        @SerializedName("DefaultPageEnum")
        @Expose
        private Integer defaultPageEnum;
        @SerializedName("DefaultShopEntityEnum")
        @Expose
        private Integer defaultShopEntityEnum;
        @SerializedName("DefaultCityId")
        @Expose
        private Integer defaultCityId;
        @SerializedName("SignupSiteEnum")
        @Expose
        private Integer signupSiteEnum;
        @SerializedName("SignupSite")
        @Expose
        private Object signupSite;
        @SerializedName("DefaultWallShopEntityIdFilter")
        @Expose
        private Object defaultWallShopEntityIdFilter;
        @SerializedName("DefaultWallPublicFilter")
        @Expose
        private Boolean defaultWallPublicFilter;
        @SerializedName("DefaultWallLocationEnumFilter")
        @Expose
        private Integer defaultWallLocationEnumFilter;
        @SerializedName("DefaultWallIsDisplayOwnContentFilter")
        @Expose
        private Boolean defaultWallIsDisplayOwnContentFilter;
        @SerializedName("DefaultSearchShopEntityIdFilter")
        @Expose
        private Object defaultSearchShopEntityIdFilter;
        @SerializedName("WallViewFavOnly")
        @Expose
        private Object wallViewFavOnly;
        @SerializedName("Languages")
        @Expose
        private Language Languages;

        public Boolean getIsSelf() {
            return isSelf;
        }

        public void setIsSelf(Boolean isSelf) {
            this.isSelf = isSelf;
        }

        public Boolean getIsFollowing() {
            return isFollowing;
        }

        public void setIsFollowing(Boolean isFollowing) {
            this.isFollowing = isFollowing;
        }

        public Boolean getIsFollower() {
            return isFollower;
        }

        public void setIsFollower(Boolean isFollower) {
            this.isFollower = isFollower;
        }

        public Boolean getIsFriend() {
            return isFriend;
        }

        public void setIsFriend(Boolean isFriend) {
            this.isFriend = isFriend;
        }

        public Boolean getIsDefaultProfileImage() {
            return isDefaultProfileImage;
        }

        public void setIsDefaultProfileImage(Boolean isDefaultProfileImage) {
            this.isDefaultProfileImage = isDefaultProfileImage;
        }

        public Boolean getIsDefaultCoverImage() {
            return isDefaultCoverImage;
        }

        public void setIsDefaultCoverImage(Boolean isDefaultCoverImage) {
            this.isDefaultCoverImage = isDefaultCoverImage;
        }

        public Object getProfileImage() {
            return profileImage;
        }

        public void setProfileImage(Object profileImage) {
            this.profileImage = profileImage;
        }

        public Object getCoverImage() {
            return coverImage;
        }

        public void setCoverImage(Object coverImage) {
            this.coverImage = coverImage;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getLanguageId() {
            return languageId;
        }

        public void setLanguageId(Integer languageId) {
            this.languageId = languageId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Object getDisplayName() {
            return displayName;
        }

        public void setDisplayName(Object displayName) {
            this.displayName = displayName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Object getContactEmail() {
            return contactEmail;
        }

        public void setContactEmail(Object contactEmail) {
            this.contactEmail = contactEmail;
        }

        public Object getTel() {
            return tel;
        }

        public void setTel(Object tel) {
            this.tel = tel;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getActivationCode() {
            return activationCode;
        }

        public void setActivationCode(String activationCode) {
            this.activationCode = activationCode;
        }

        public Object getFacebookId() {
            return facebookId;
        }

        public void setFacebookId(Object facebookId) {
            this.facebookId = facebookId;
        }

        public Object getFacebookToken() {
            return facebookToken;
        }

        public void setFacebookToken(Object facebookToken) {
            this.facebookToken = facebookToken;
        }

        public Object getTwitterToken() {
            return twitterToken;
        }

        public void setTwitterToken(Object twitterToken) {
            this.twitterToken = twitterToken;
        }

        public Object getTwitterTokenSecret() {
            return twitterTokenSecret;
        }

        public void setTwitterTokenSecret(Object twitterTokenSecret) {
            this.twitterTokenSecret = twitterTokenSecret;
        }

        public Boolean getIsAdmin() {
            return isAdmin;
        }

        public void setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
        }

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public Boolean getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
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

        public Object getLastAccessDate() {
            return lastAccessDate;
        }

        public void setLastAccessDate(Object lastAccessDate) {
            this.lastAccessDate = lastAccessDate;
        }

        public String getUniqueName() {
            return uniqueName;
        }

        public void setUniqueName(String uniqueName) {
            this.uniqueName = uniqueName;
        }

        public Integer getDefaultPageEnum() {
            return defaultPageEnum;
        }

        public void setDefaultPageEnum(Integer defaultPageEnum) {
            this.defaultPageEnum = defaultPageEnum;
        }

        public Integer getDefaultShopEntityEnum() {
            return defaultShopEntityEnum;
        }

        public void setDefaultShopEntityEnum(Integer defaultShopEntityEnum) {
            this.defaultShopEntityEnum = defaultShopEntityEnum;
        }

        public Integer getDefaultCityId() {
            return defaultCityId;
        }

        public void setDefaultCityId(Integer defaultCityId) {
            this.defaultCityId = defaultCityId;
        }

        public Integer getSignupSiteEnum() {
            return signupSiteEnum;
        }

        public void setSignupSiteEnum(Integer signupSiteEnum) {
            this.signupSiteEnum = signupSiteEnum;
        }

        public Object getSignupSite() {
            return signupSite;
        }

        public void setSignupSite(Object signupSite) {
            this.signupSite = signupSite;
        }

        public Object getDefaultWallShopEntityIdFilter() {
            return defaultWallShopEntityIdFilter;
        }

        public void setDefaultWallShopEntityIdFilter(Object defaultWallShopEntityIdFilter) {
            this.defaultWallShopEntityIdFilter = defaultWallShopEntityIdFilter;
        }

        public Boolean getDefaultWallPublicFilter() {
            return defaultWallPublicFilter;
        }

        public void setDefaultWallPublicFilter(Boolean defaultWallPublicFilter) {
            this.defaultWallPublicFilter = defaultWallPublicFilter;
        }

        public Integer getDefaultWallLocationEnumFilter() {
            return defaultWallLocationEnumFilter;
        }

        public void setDefaultWallLocationEnumFilter(Integer defaultWallLocationEnumFilter) {
            this.defaultWallLocationEnumFilter = defaultWallLocationEnumFilter;
        }

        public Boolean getDefaultWallIsDisplayOwnContentFilter() {
            return defaultWallIsDisplayOwnContentFilter;
        }

        public void setDefaultWallIsDisplayOwnContentFilter(Boolean defaultWallIsDisplayOwnContentFilter) {
            this.defaultWallIsDisplayOwnContentFilter = defaultWallIsDisplayOwnContentFilter;
        }

        public Object getDefaultSearchShopEntityIdFilter() {
            return defaultSearchShopEntityIdFilter;
        }

        public void setDefaultSearchShopEntityIdFilter(Object defaultSearchShopEntityIdFilter) {
            this.defaultSearchShopEntityIdFilter = defaultSearchShopEntityIdFilter;
        }

        public Object getWallViewFavOnly() {
            return wallViewFavOnly;
        }

        public void setWallViewFavOnly(Object wallViewFavOnly) {
            this.wallViewFavOnly = wallViewFavOnly;
        }

        public Language getLanguages() {
            return Languages;
        }

        public void setLanguages(Language Languages) {
            this.Languages = Languages;
        }

        public class Language {

            @SerializedName("Id")
            @Expose
            private Integer id;
            @SerializedName("Name")
            @Expose
            private String name;
            @SerializedName("IsActive")
            @Expose
            private Boolean isActive;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Boolean getIsActive() {
                return isActive;
            }

            public void setIsActive(Boolean isActive) {
                this.isActive = isActive;
            }
        }
      }
    }
