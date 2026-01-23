package com.robinhood.android.acatsin.availabledestinations;

import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsDestination.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B=\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u0082\u0001\u0003\u0018\u0019\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "", "pictogram", "", "title", "bodyComponents", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isSelected", "", "testTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "getPictogram", "()Ljava/lang/String;", "getTitle", "getBodyComponents", "()Ljava/util/List;", "()Z", "getTestTag", "ExistingAccount", "SignUpAccount", "Deeplink", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination$Deeplink;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination$ExistingAccount;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination$SignUpAccount;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsDestination {
    public static final int $stable = 8;
    private final List<UIComponent<GenericAction>> bodyComponents;
    private final boolean isSelected;
    private final String pictogram;
    private final String testTag;
    private final String title;

    public /* synthetic */ AcatsDestination(String str, String str2, List list, boolean z, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, z, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AcatsDestination(String str, String str2, List<? extends UIComponent<? extends GenericAction>> list, boolean z, String str3) {
        this.pictogram = str;
        this.title = str2;
        this.bodyComponents = list;
        this.isSelected = z;
        this.testTag = str3;
    }

    public String getPictogram() {
        return this.pictogram;
    }

    public String getTitle() {
        return this.title;
    }

    public List<UIComponent<GenericAction>> getBodyComponents() {
        return this.bodyComponents;
    }

    /* renamed from: isSelected, reason: from getter */
    public boolean getIsSelected() {
        return this.isSelected;
    }

    public String getTestTag() {
        return this.testTag;
    }

    /* compiled from: AcatsDestination.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination$ExistingAccount;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "pictogram", "", "title", "bodyComponents", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isSelected", "", "availableAccount", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/robinhood/models/acats/db/bonfire/AvailableAccount;)V", "getPictogram", "()Ljava/lang/String;", "getTitle", "getBodyComponents", "()Ljava/util/List;", "()Z", "getAvailableAccount", "()Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExistingAccount extends AcatsDestination {
        public static final int $stable = 8;
        private final AvailableAccount availableAccount;
        private final List<UIComponent<GenericAction>> bodyComponents;
        private final boolean isSelected;
        private final String pictogram;
        private final String title;

        public static /* synthetic */ ExistingAccount copy$default(ExistingAccount existingAccount, String str, String str2, List list, boolean z, AvailableAccount availableAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                str = existingAccount.pictogram;
            }
            if ((i & 2) != 0) {
                str2 = existingAccount.title;
            }
            if ((i & 4) != 0) {
                list = existingAccount.bodyComponents;
            }
            if ((i & 8) != 0) {
                z = existingAccount.isSelected;
            }
            if ((i & 16) != 0) {
                availableAccount = existingAccount.availableAccount;
            }
            AvailableAccount availableAccount2 = availableAccount;
            List list2 = list;
            return existingAccount.copy(str, str2, list2, z, availableAccount2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPictogram() {
            return this.pictogram;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<UIComponent<GenericAction>> component3() {
            return this.bodyComponents;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component5, reason: from getter */
        public final AvailableAccount getAvailableAccount() {
            return this.availableAccount;
        }

        public final ExistingAccount copy(String pictogram, String title, List<? extends UIComponent<? extends GenericAction>> bodyComponents, boolean isSelected, AvailableAccount availableAccount) {
            Intrinsics.checkNotNullParameter(pictogram, "pictogram");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
            Intrinsics.checkNotNullParameter(availableAccount, "availableAccount");
            return new ExistingAccount(pictogram, title, bodyComponents, isSelected, availableAccount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExistingAccount)) {
                return false;
            }
            ExistingAccount existingAccount = (ExistingAccount) other;
            return Intrinsics.areEqual(this.pictogram, existingAccount.pictogram) && Intrinsics.areEqual(this.title, existingAccount.title) && Intrinsics.areEqual(this.bodyComponents, existingAccount.bodyComponents) && this.isSelected == existingAccount.isSelected && Intrinsics.areEqual(this.availableAccount, existingAccount.availableAccount);
        }

        public int hashCode() {
            return (((((((this.pictogram.hashCode() * 31) + this.title.hashCode()) * 31) + this.bodyComponents.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.availableAccount.hashCode();
        }

        public String toString() {
            return "ExistingAccount(pictogram=" + this.pictogram + ", title=" + this.title + ", bodyComponents=" + this.bodyComponents + ", isSelected=" + this.isSelected + ", availableAccount=" + this.availableAccount + ")";
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        public String getPictogram() {
            return this.pictogram;
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        public List<UIComponent<GenericAction>> getBodyComponents() {
            return this.bodyComponents;
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        /* renamed from: isSelected */
        public boolean getIsSelected() {
            return this.isSelected;
        }

        public final AvailableAccount getAvailableAccount() {
            return this.availableAccount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ExistingAccount(String pictogram, String title, List<? extends UIComponent<? extends GenericAction>> bodyComponents, boolean z, AvailableAccount availableAccount) {
            super(pictogram, title, bodyComponents, z, availableAccount.getQueryValue(), null);
            Intrinsics.checkNotNullParameter(pictogram, "pictogram");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
            Intrinsics.checkNotNullParameter(availableAccount, "availableAccount");
            this.pictogram = pictogram;
            this.title = title;
            this.bodyComponents = bodyComponents;
            this.isSelected = z;
            this.availableAccount = availableAccount;
        }
    }

    /* compiled from: AcatsDestination.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination$SignUpAccount;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "pictogram", "", "title", "bodyComponents", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isSelected", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "queryValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;)V", "getPictogram", "()Ljava/lang/String;", "getTitle", "getBodyComponents", "()Ljava/util/List;", "()Z", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getQueryValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SignUpAccount extends AcatsDestination {
        public static final int $stable = 8;
        private final BrokerageAccountType accountType;
        private final List<UIComponent<GenericAction>> bodyComponents;
        private final boolean isSelected;
        private final String pictogram;
        private final String queryValue;
        private final String title;

        public static /* synthetic */ SignUpAccount copy$default(SignUpAccount signUpAccount, String str, String str2, List list, boolean z, BrokerageAccountType brokerageAccountType, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signUpAccount.pictogram;
            }
            if ((i & 2) != 0) {
                str2 = signUpAccount.title;
            }
            if ((i & 4) != 0) {
                list = signUpAccount.bodyComponents;
            }
            if ((i & 8) != 0) {
                z = signUpAccount.isSelected;
            }
            if ((i & 16) != 0) {
                brokerageAccountType = signUpAccount.accountType;
            }
            if ((i & 32) != 0) {
                str3 = signUpAccount.queryValue;
            }
            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            String str4 = str3;
            return signUpAccount.copy(str, str2, list, z, brokerageAccountType2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPictogram() {
            return this.pictogram;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<UIComponent<GenericAction>> component3() {
            return this.bodyComponents;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component5, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component6, reason: from getter */
        public final String getQueryValue() {
            return this.queryValue;
        }

        public final SignUpAccount copy(String pictogram, String title, List<? extends UIComponent<? extends GenericAction>> bodyComponents, boolean isSelected, BrokerageAccountType accountType, String queryValue) {
            Intrinsics.checkNotNullParameter(pictogram, "pictogram");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(queryValue, "queryValue");
            return new SignUpAccount(pictogram, title, bodyComponents, isSelected, accountType, queryValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignUpAccount)) {
                return false;
            }
            SignUpAccount signUpAccount = (SignUpAccount) other;
            return Intrinsics.areEqual(this.pictogram, signUpAccount.pictogram) && Intrinsics.areEqual(this.title, signUpAccount.title) && Intrinsics.areEqual(this.bodyComponents, signUpAccount.bodyComponents) && this.isSelected == signUpAccount.isSelected && this.accountType == signUpAccount.accountType && Intrinsics.areEqual(this.queryValue, signUpAccount.queryValue);
        }

        public int hashCode() {
            return (((((((((this.pictogram.hashCode() * 31) + this.title.hashCode()) * 31) + this.bodyComponents.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.accountType.hashCode()) * 31) + this.queryValue.hashCode();
        }

        public String toString() {
            return "SignUpAccount(pictogram=" + this.pictogram + ", title=" + this.title + ", bodyComponents=" + this.bodyComponents + ", isSelected=" + this.isSelected + ", accountType=" + this.accountType + ", queryValue=" + this.queryValue + ")";
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        public String getPictogram() {
            return this.pictogram;
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        public List<UIComponent<GenericAction>> getBodyComponents() {
            return this.bodyComponents;
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        /* renamed from: isSelected */
        public boolean getIsSelected() {
            return this.isSelected;
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final String getQueryValue() {
            return this.queryValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SignUpAccount(String pictogram, String title, List<? extends UIComponent<? extends GenericAction>> bodyComponents, boolean z, BrokerageAccountType accountType, String queryValue) {
            super(pictogram, title, bodyComponents, z, accountType.getServerValue(), null);
            Intrinsics.checkNotNullParameter(pictogram, "pictogram");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(queryValue, "queryValue");
            this.pictogram = pictogram;
            this.title = title;
            this.bodyComponents = bodyComponents;
            this.isSelected = z;
            this.accountType = accountType;
            this.queryValue = queryValue;
        }
    }

    /* compiled from: AcatsDestination.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination$Deeplink;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "pictogram", "", "richTextTitle", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "bodyComponents", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isSelected", "", "deeplink", "loggingId", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "getPictogram", "()Ljava/lang/String;", "getRichTextTitle", "()Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "getBodyComponents", "()Ljava/util/List;", "()Z", "getDeeplink", "getLoggingId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Deeplink extends AcatsDestination {
        public static final int $stable = 8;
        private final List<UIComponent<GenericAction>> bodyComponents;
        private final String deeplink;
        private final boolean isSelected;
        private final String loggingId;
        private final String pictogram;
        private final RichText richTextTitle;

        public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, String str, RichText richText, List list, boolean z, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deeplink.pictogram;
            }
            if ((i & 2) != 0) {
                richText = deeplink.richTextTitle;
            }
            if ((i & 4) != 0) {
                list = deeplink.bodyComponents;
            }
            if ((i & 8) != 0) {
                z = deeplink.isSelected;
            }
            if ((i & 16) != 0) {
                str2 = deeplink.deeplink;
            }
            if ((i & 32) != 0) {
                str3 = deeplink.loggingId;
            }
            String str4 = str2;
            String str5 = str3;
            return deeplink.copy(str, richText, list, z, str4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPictogram() {
            return this.pictogram;
        }

        /* renamed from: component2, reason: from getter */
        public final RichText getRichTextTitle() {
            return this.richTextTitle;
        }

        public final List<UIComponent<GenericAction>> component3() {
            return this.bodyComponents;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component6, reason: from getter */
        public final String getLoggingId() {
            return this.loggingId;
        }

        public final Deeplink copy(String pictogram, RichText richTextTitle, List<? extends UIComponent<? extends GenericAction>> bodyComponents, boolean isSelected, String deeplink, String loggingId) {
            Intrinsics.checkNotNullParameter(pictogram, "pictogram");
            Intrinsics.checkNotNullParameter(richTextTitle, "richTextTitle");
            Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(loggingId, "loggingId");
            return new Deeplink(pictogram, richTextTitle, bodyComponents, isSelected, deeplink, loggingId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Deeplink)) {
                return false;
            }
            Deeplink deeplink = (Deeplink) other;
            return Intrinsics.areEqual(this.pictogram, deeplink.pictogram) && Intrinsics.areEqual(this.richTextTitle, deeplink.richTextTitle) && Intrinsics.areEqual(this.bodyComponents, deeplink.bodyComponents) && this.isSelected == deeplink.isSelected && Intrinsics.areEqual(this.deeplink, deeplink.deeplink) && Intrinsics.areEqual(this.loggingId, deeplink.loggingId);
        }

        public int hashCode() {
            return (((((((((this.pictogram.hashCode() * 31) + this.richTextTitle.hashCode()) * 31) + this.bodyComponents.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.deeplink.hashCode()) * 31) + this.loggingId.hashCode();
        }

        public String toString() {
            return "Deeplink(pictogram=" + this.pictogram + ", richTextTitle=" + this.richTextTitle + ", bodyComponents=" + this.bodyComponents + ", isSelected=" + this.isSelected + ", deeplink=" + this.deeplink + ", loggingId=" + this.loggingId + ")";
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        public String getPictogram() {
            return this.pictogram;
        }

        public final RichText getRichTextTitle() {
            return this.richTextTitle;
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        public List<UIComponent<GenericAction>> getBodyComponents() {
            return this.bodyComponents;
        }

        @Override // com.robinhood.android.acatsin.availabledestinations.AcatsDestination
        /* renamed from: isSelected */
        public boolean getIsSelected() {
            return this.isSelected;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getLoggingId() {
            return this.loggingId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Deeplink(String pictogram, RichText richTextTitle, List<? extends UIComponent<? extends GenericAction>> bodyComponents, boolean z, String deeplink, String loggingId) {
            super(pictogram, richTextTitle.getText(), bodyComponents, z, loggingId, null);
            Intrinsics.checkNotNullParameter(pictogram, "pictogram");
            Intrinsics.checkNotNullParameter(richTextTitle, "richTextTitle");
            Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(loggingId, "loggingId");
            this.pictogram = pictogram;
            this.richTextTitle = richTextTitle;
            this.bodyComponents = bodyComponents;
            this.isSelected = z;
            this.deeplink = deeplink;
            this.loggingId = loggingId;
        }
    }
}
