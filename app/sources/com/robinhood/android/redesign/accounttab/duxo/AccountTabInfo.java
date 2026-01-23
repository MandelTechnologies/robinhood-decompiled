package com.robinhood.android.redesign.accounttab.duxo;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.redesign.accounttab.AccountTabType;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AccountTabInfo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;", "", "id", "", "getId", "()Ljava/lang/String;", "uniqueItemId", "", "getUniqueItemId", "()J", "layoutUnderTabInfo", "", "getLayoutUnderTabInfo", "()Z", "nestedScrollCompatible", "getNestedScrollCompatible", "Account", "Nux", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Nux;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesign.accounttab.duxo.TabInfo, reason: use source file name */
/* loaded from: classes5.dex */
public interface AccountTabInfo {

    /* compiled from: AccountTabInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.TabInfo$DefaultImpls */
    public static final class DefaultImpls {
        public static boolean getNestedScrollCompatible(AccountTabInfo accountTabInfo) {
            return false;
        }
    }

    String getId();

    boolean getLayoutUnderTabInfo();

    boolean getNestedScrollCompatible();

    long getUniqueItemId();

    /* compiled from: AccountTabInfo.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002STB\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÂ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\nHÂ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010H\u001a\u00020\u0012HÆ\u0003J\t\u0010I\u001a\u00020\u0012HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010K\u001a\u00020\u0012HÆ\u0003J\u0097\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0012HÆ\u0001J\u0013\u0010M\u001a\u00020\u00122\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020QHÖ\u0001J\t\u0010R\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010'R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0016\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010'R\u0011\u0010*\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0014\u0010,\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0014\u0010.\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010'R\u0011\u00100\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b1\u0010'R\u0014\u00102\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u00104\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u00106\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u0011\u00107\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0014\u00109\u001a\u00020:X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010=\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b>\u0010 ¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;", "accountType", "Lcom/robinhood/android/redesign/accounttab/AccountTabType;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "nickname", "", "accountId", "balance", "Ljava/math/BigDecimal;", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "percentageDelta", "accountExists", "", "isUpsell", "pendingApplication", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account$PendingApplication;", "isLocked", "<init>", "(Lcom/robinhood/android/redesign/accounttab/AccountTabType;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Ljava/math/BigDecimal;ZZLcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account$PendingApplication;Z)V", "getAccountType", "()Lcom/robinhood/android/redesign/accounttab/AccountTabType;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getAccountId", "()Ljava/lang/String;", "getBalance", "()Ljava/math/BigDecimal;", "getDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getPercentageDelta", "getAccountExists", "()Z", "getPendingApplication", "()Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account$PendingApplication;", "displayName", "getDisplayName", "layoutUnderTabInfo", "getLayoutUnderTabInfo", "nestedScrollCompatible", "getNestedScrollCompatible", "forceDarkMode", "getForceDarkMode", "id", "getId", "sortId", "getSortId", "isUp", "showPercentageChange", "getShowPercentageChange", "uniqueItemId", "", "getUniqueItemId", "()J", "percentChange", "getPercentChange", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "PendingApplication", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.TabInfo$Account, reason: from toString */
    public static final /* data */ class Account implements AccountTabInfo {
        private final boolean accountExists;
        private final String accountId;
        private final AccountTabType accountType;
        private final BigDecimal balance;
        private final BrokerageAccountType brokerageAccountType;
        private final Direction direction;
        private final StringResource displayName;
        private final String id;
        private final boolean isLocked;
        private final boolean isUp;
        private final boolean isUpsell;
        private final String nickname;
        private final PendingApplication pendingApplication;
        private final String percentChange;
        private final BigDecimal percentageDelta;
        private final boolean showPercentageChange;
        private final String sortId;
        private final StringResource subtitle;
        private final StringResource title;
        private final long uniqueItemId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final NumberFormatter FORMATTER = Formats.getNoSignWithHundredthDecimalPercentFormat();

        /* compiled from: AccountTabInfo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.TabInfo$Account$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AccountTabType.values().length];
                try {
                    iArr[AccountTabType.CREDIT_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccountTabType.RETIREMENT_SIGN_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AccountTabType.ADVISORY_SIGN_UP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component3, reason: from getter */
        private final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        private final String getNickname() {
            return this.nickname;
        }

        public static /* synthetic */ Account copy$default(Account account, AccountTabType accountTabType, BrokerageAccountType brokerageAccountType, StringResource stringResource, StringResource stringResource2, String str, String str2, BigDecimal bigDecimal, Direction direction, BigDecimal bigDecimal2, boolean z, boolean z2, PendingApplication pendingApplication, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                accountTabType = account.accountType;
            }
            return account.copy(accountTabType, (i & 2) != 0 ? account.brokerageAccountType : brokerageAccountType, (i & 4) != 0 ? account.title : stringResource, (i & 8) != 0 ? account.subtitle : stringResource2, (i & 16) != 0 ? account.nickname : str, (i & 32) != 0 ? account.accountId : str2, (i & 64) != 0 ? account.balance : bigDecimal, (i & 128) != 0 ? account.direction : direction, (i & 256) != 0 ? account.percentageDelta : bigDecimal2, (i & 512) != 0 ? account.accountExists : z, (i & 1024) != 0 ? account.isUpsell : z2, (i & 2048) != 0 ? account.pendingApplication : pendingApplication, (i & 4096) != 0 ? account.isLocked : z3);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountTabType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getAccountExists() {
            return this.accountExists;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsUpsell() {
            return this.isUpsell;
        }

        /* renamed from: component12, reason: from getter */
        public final PendingApplication getPendingApplication() {
            return this.pendingApplication;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getIsLocked() {
            return this.isLocked;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component7, reason: from getter */
        public final BigDecimal getBalance() {
            return this.balance;
        }

        /* renamed from: component8, reason: from getter */
        public final Direction getDirection() {
            return this.direction;
        }

        /* renamed from: component9, reason: from getter */
        public final BigDecimal getPercentageDelta() {
            return this.percentageDelta;
        }

        public final Account copy(AccountTabType accountType, BrokerageAccountType brokerageAccountType, StringResource title, StringResource subtitle, String nickname, String accountId, BigDecimal balance, Direction direction, BigDecimal percentageDelta, boolean accountExists, boolean isUpsell, PendingApplication pendingApplication, boolean isLocked) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            return new Account(accountType, brokerageAccountType, title, subtitle, nickname, accountId, balance, direction, percentageDelta, accountExists, isUpsell, pendingApplication, isLocked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Account)) {
                return false;
            }
            Account account = (Account) other;
            return this.accountType == account.accountType && this.brokerageAccountType == account.brokerageAccountType && Intrinsics.areEqual(this.title, account.title) && Intrinsics.areEqual(this.subtitle, account.subtitle) && Intrinsics.areEqual(this.nickname, account.nickname) && Intrinsics.areEqual(this.accountId, account.accountId) && Intrinsics.areEqual(this.balance, account.balance) && this.direction == account.direction && Intrinsics.areEqual(this.percentageDelta, account.percentageDelta) && this.accountExists == account.accountExists && this.isUpsell == account.isUpsell && Intrinsics.areEqual(this.pendingApplication, account.pendingApplication) && this.isLocked == account.isLocked;
        }

        public int hashCode() {
            int iHashCode = ((((this.accountType.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.title.hashCode()) * 31;
            StringResource stringResource = this.subtitle;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            String str = this.nickname;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.accountId.hashCode()) * 31;
            BigDecimal bigDecimal = this.balance;
            int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            Direction direction = this.direction;
            int iHashCode5 = (iHashCode4 + (direction == null ? 0 : direction.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.percentageDelta;
            int iHashCode6 = (((((iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.accountExists)) * 31) + Boolean.hashCode(this.isUpsell)) * 31;
            PendingApplication pendingApplication = this.pendingApplication;
            return ((iHashCode6 + (pendingApplication != null ? pendingApplication.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLocked);
        }

        public String toString() {
            return "Account(accountType=" + this.accountType + ", brokerageAccountType=" + this.brokerageAccountType + ", title=" + this.title + ", subtitle=" + this.subtitle + ", nickname=" + this.nickname + ", accountId=" + this.accountId + ", balance=" + this.balance + ", direction=" + this.direction + ", percentageDelta=" + this.percentageDelta + ", accountExists=" + this.accountExists + ", isUpsell=" + this.isUpsell + ", pendingApplication=" + this.pendingApplication + ", isLocked=" + this.isLocked + ")";
        }

        public Account(AccountTabType accountType, BrokerageAccountType brokerageAccountType, StringResource title, StringResource stringResource, String str, String accountId, BigDecimal bigDecimal, Direction direction, BigDecimal bigDecimal2, boolean z, boolean z2, PendingApplication pendingApplication, boolean z3) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.accountType = accountType;
            this.brokerageAccountType = brokerageAccountType;
            this.title = title;
            this.subtitle = stringResource;
            this.nickname = str;
            this.accountId = accountId;
            this.balance = bigDecimal;
            this.direction = direction;
            this.percentageDelta = bigDecimal2;
            this.accountExists = z;
            this.isUpsell = z2;
            this.pendingApplication = pendingApplication;
            this.isLocked = z3;
            if (str != null && !StringsKt.isBlank(str)) {
                title = StringResource.INSTANCE.invoke(str);
            }
            this.displayName = title;
            this.id = accountId + "-" + accountType.getDescription();
            this.sortId = getId();
            this.isUp = direction == Direction.f5855UP;
            this.showPercentageChange = bigDecimal2 != null;
            this.uniqueItemId = getId().hashCode();
            this.percentChange = bigDecimal2 != null ? FORMATTER.format(bigDecimal2) : null;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Account(com.robinhood.android.redesign.accounttab.AccountTabType r18, com.robinhood.models.api.BrokerageAccountType r19, com.robinhood.utils.resource.StringResource r20, com.robinhood.utils.resource.StringResource r21, java.lang.String r22, java.lang.String r23, java.math.BigDecimal r24, com.robinhood.models.serverdriven.experimental.api.Direction r25, java.math.BigDecimal r26, boolean r27, boolean r28, com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo.Account.PendingApplication r29, boolean r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
            /*
                r17 = this;
                r0 = r31
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L9
                r7 = r2
                goto Lb
            L9:
                r7 = r21
            Lb:
                r1 = r0 & 16
                if (r1 == 0) goto L11
                r8 = r2
                goto L13
            L11:
                r8 = r22
            L13:
                r1 = r0 & 64
                if (r1 == 0) goto L19
                r10 = r2
                goto L1b
            L19:
                r10 = r24
            L1b:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L21
                r11 = r2
                goto L23
            L21:
                r11 = r25
            L23:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L29
                r12 = r2
                goto L2b
            L29:
                r12 = r26
            L2b:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L32
                r1 = 1
                r13 = r1
                goto L34
            L32:
                r13 = r27
            L34:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                r3 = 0
                if (r1 == 0) goto L3b
                r14 = r3
                goto L3d
            L3b:
                r14 = r28
            L3d:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L43
                r15 = r2
                goto L45
            L43:
                r15 = r29
            L45:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L56
                r16 = r3
                r4 = r18
                r5 = r19
                r6 = r20
                r9 = r23
                r3 = r17
                goto L62
            L56:
                r16 = r30
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r9 = r23
            L62:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo.Account.<init>(com.robinhood.android.redesign.accounttab.AccountTabType, com.robinhood.models.api.BrokerageAccountType, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, java.lang.String, java.lang.String, java.math.BigDecimal, com.robinhood.models.serverdriven.experimental.api.Direction, java.math.BigDecimal, boolean, boolean, com.robinhood.android.redesign.accounttab.duxo.TabInfo$Account$PendingApplication, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final AccountTabType getAccountType() {
            return this.accountType;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final BigDecimal getBalance() {
            return this.balance;
        }

        public final Direction getDirection() {
            return this.direction;
        }

        public final BigDecimal getPercentageDelta() {
            return this.percentageDelta;
        }

        public final boolean getAccountExists() {
            return this.accountExists;
        }

        public final boolean isUpsell() {
            return this.isUpsell;
        }

        public final PendingApplication getPendingApplication() {
            return this.pendingApplication;
        }

        public final boolean isLocked() {
            return this.isLocked;
        }

        public final StringResource getDisplayName() {
            return this.displayName;
        }

        @Override // com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo
        public boolean getLayoutUnderTabInfo() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.accountType.ordinal()];
            return i == 1 || i == 2 || i == 3;
        }

        @Override // com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo
        public boolean getNestedScrollCompatible() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.accountType.ordinal()];
            return (i == 1 || i == 2) ? false : true;
        }

        public final boolean getForceDarkMode() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.accountType.ordinal()];
            return i == 1 || i == 2 || i == 3;
        }

        @Override // com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo
        public String getId() {
            return this.id;
        }

        public final String getSortId() {
            return this.sortId;
        }

        /* renamed from: isUp, reason: from getter */
        public final boolean getIsUp() {
            return this.isUp;
        }

        public final boolean getShowPercentageChange() {
            return this.showPercentageChange;
        }

        @Override // com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo
        public long getUniqueItemId() {
            return this.uniqueItemId;
        }

        public final String getPercentChange() {
            return this.percentChange;
        }

        /* compiled from: AccountTabInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account$Companion;", "", "<init>", "()V", "FORMATTER", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getFORMATTER", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.TabInfo$Account$Companion, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final NumberFormatter getFORMATTER() {
                return Account.FORMATTER;
            }
        }

        /* compiled from: AccountTabInfo.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account$PendingApplication;", "", "applicationId", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getApplicationId", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.TabInfo$Account$PendingApplication, reason: from toString */
        public static final /* data */ class PendingApplication {
            public static final int $stable = 0;
            private final String applicationId;
            private final BrokerageAccountType brokerageAccountType;

            public static /* synthetic */ PendingApplication copy$default(PendingApplication pendingApplication, String str, BrokerageAccountType brokerageAccountType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = pendingApplication.applicationId;
                }
                if ((i & 2) != 0) {
                    brokerageAccountType = pendingApplication.brokerageAccountType;
                }
                return pendingApplication.copy(str, brokerageAccountType);
            }

            /* renamed from: component1, reason: from getter */
            public final String getApplicationId() {
                return this.applicationId;
            }

            /* renamed from: component2, reason: from getter */
            public final BrokerageAccountType getBrokerageAccountType() {
                return this.brokerageAccountType;
            }

            public final PendingApplication copy(String applicationId, BrokerageAccountType brokerageAccountType) {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                return new PendingApplication(applicationId, brokerageAccountType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PendingApplication)) {
                    return false;
                }
                PendingApplication pendingApplication = (PendingApplication) other;
                return Intrinsics.areEqual(this.applicationId, pendingApplication.applicationId) && this.brokerageAccountType == pendingApplication.brokerageAccountType;
            }

            public int hashCode() {
                return (this.applicationId.hashCode() * 31) + this.brokerageAccountType.hashCode();
            }

            public String toString() {
                return "PendingApplication(applicationId=" + this.applicationId + ", brokerageAccountType=" + this.brokerageAccountType + ")";
            }

            public PendingApplication(String applicationId, BrokerageAccountType brokerageAccountType) {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                this.applicationId = applicationId;
                this.brokerageAccountType = brokerageAccountType;
            }

            public final String getApplicationId() {
                return this.applicationId;
            }

            public final BrokerageAccountType getBrokerageAccountType() {
                return this.brokerageAccountType;
            }
        }
    }

    /* compiled from: AccountTabInfo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Nux;", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "layoutUnderTabInfo", "", "getLayoutUnderTabInfo", "()Z", "uniqueItemId", "", "getUniqueItemId", "()J", "equals", "other", "", "hashCode", "", "toString", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.TabInfo$Nux */
    public static final /* data */ class Nux implements AccountTabInfo {
        public static final int $stable = 0;
        private static final boolean layoutUnderTabInfo = false;
        public static final Nux INSTANCE = new Nux();
        private static final String id = "nux";
        private static final long uniqueItemId = 109457;

        public boolean equals(Object other) {
            return this == other || (other instanceof Nux);
        }

        public int hashCode() {
            return 1062334877;
        }

        public String toString() {
            return "Nux";
        }

        private Nux() {
        }

        @Override // com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo
        public boolean getNestedScrollCompatible() {
            return DefaultImpls.getNestedScrollCompatible(this);
        }

        @Override // com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo
        public String getId() {
            return id;
        }

        @Override // com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo
        public boolean getLayoutUnderTabInfo() {
            return layoutUnderTabInfo;
        }

        @Override // com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo
        public long getUniqueItemId() {
            return uniqueItemId;
        }
    }
}
