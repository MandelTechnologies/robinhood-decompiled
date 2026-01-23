package com.robinhood.android.feature.lib.sweep.interest;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: UiTimelineInfo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo;", "", "top", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Top;", "middle", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle;", "bottom", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Bottom;", "<init>", "(Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Top;Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle;Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Bottom;)V", "getTop", "()Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Top;", "getMiddle", "()Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle;", "getBottom", "()Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Bottom;", "Top", "Middle", "Bottom", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class UiTimelineInfo {
    private final Bottom bottom;
    private final Middle middle;
    private final Top top;

    public UiTimelineInfo(Top top, Middle middle, Bottom bottom) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(middle, "middle");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        this.top = top;
        this.middle = middle;
        this.bottom = bottom;
    }

    public final Top getTop() {
        return this.top;
    }

    public final Middle getMiddle() {
        return this.middle;
    }

    public final Bottom getBottom() {
        return this.bottom;
    }

    /* compiled from: UiTimelineInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Top;", "", "", "title", "j$/time/LocalDate", InquiryField.DateField.TYPE, "<init>", "(ILj$/time/LocalDate;)V", "I", "getTitle", "()I", "Lj$/time/LocalDate;", "getDate", "()Lj$/time/LocalDate;", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Top {
        private final LocalDate date;
        private final int title;

        public Top(int i, LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.title = i;
            this.date = date;
        }

        public final int getTitle() {
            return this.title;
        }

        public final LocalDate getDate() {
            return this.date;
        }
    }

    /* compiled from: UiTimelineInfo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle;", "", "reason", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "interestAccruing", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;Lcom/robinhood/models/util/Money;)V", "getReason", "()Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "getInterestAccruing", "()Lcom/robinhood/models/util/Money;", "Default", "Paused", "Activated", "Reason", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Activated;", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Default;", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Paused;", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Middle {
        private final Money interestAccruing;
        private final Reason reason;

        public /* synthetic */ Middle(Reason reason, Money money, DefaultConstructorMarker defaultConstructorMarker) {
            this(reason, money);
        }

        private Middle(Reason reason, Money money) {
            this.reason = reason;
            this.interestAccruing = money;
        }

        public Reason getReason() {
            return this.reason;
        }

        public Money getInterestAccruing() {
            return this.interestAccruing;
        }

        /* compiled from: UiTimelineInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Default;", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle;", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "reason", "Lcom/robinhood/models/util/Money;", "interestAccruing", "j$/time/LocalDate", InquiryField.DateField.TYPE, "<init>", "(Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;Lcom/robinhood/models/util/Money;Lj$/time/LocalDate;)V", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "getReason", "()Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "Lcom/robinhood/models/util/Money;", "getInterestAccruing", "()Lcom/robinhood/models/util/Money;", "Lj$/time/LocalDate;", "getDate", "()Lj$/time/LocalDate;", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Default extends Middle {
            private final LocalDate date;
            private final Money interestAccruing;
            private final Reason reason;

            public /* synthetic */ Default(Reason reason, Money money, LocalDate localDate, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(reason, money, (i & 4) != 0 ? null : localDate);
            }

            @Override // com.robinhood.android.feature.lib.sweep.interest.UiTimelineInfo.Middle
            public Reason getReason() {
                return this.reason;
            }

            @Override // com.robinhood.android.feature.lib.sweep.interest.UiTimelineInfo.Middle
            public Money getInterestAccruing() {
                return this.interestAccruing;
            }

            public final LocalDate getDate() {
                return this.date;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(Reason reason, Money money, LocalDate localDate) {
                super(reason, money, null);
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.reason = reason;
                this.interestAccruing = money;
                this.date = localDate;
            }
        }

        /* compiled from: UiTimelineInfo.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Paused;", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle;", "reason", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "interestAccruing", "Lcom/robinhood/models/util/Money;", "apyInterest", "Ljava/math/BigDecimal;", "pausedReason", "Lcom/robinhood/models/api/ApiSweepsTimelineSummary$PausedReason;", "pausedDisplayMessage", "", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Lcom/robinhood/models/api/ApiSweepsTimelineSummary$PausedReason;Ljava/lang/String;Lcom/robinhood/models/db/Account;)V", "getReason", "()Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "getInterestAccruing", "()Lcom/robinhood/models/util/Money;", "getApyInterest", "()Ljava/math/BigDecimal;", "getPausedReason", "()Lcom/robinhood/models/api/ApiSweepsTimelineSummary$PausedReason;", "getPausedDisplayMessage", "()Ljava/lang/String;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getDialogInfo", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Paused$DialogInfo;", "DialogInfo", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Paused extends Middle {
            private final Account account;
            private final BigDecimal apyInterest;
            private final Money interestAccruing;
            private final String pausedDisplayMessage;
            private final ApiSweepsTimelineSummary.PausedReason pausedReason;
            private final Reason reason;

            /* compiled from: UiTimelineInfo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ApiSweepsTimelineSummary.PausedReason.values().length];
                    try {
                        iArr[ApiSweepsTimelineSummary.PausedReason.PDT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ApiSweepsTimelineSummary.PausedReason.MARGIN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ApiSweepsTimelineSummary.PausedReason.ACCOUNT_DEFICIT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.robinhood.android.feature.lib.sweep.interest.UiTimelineInfo.Middle
            public Reason getReason() {
                return this.reason;
            }

            @Override // com.robinhood.android.feature.lib.sweep.interest.UiTimelineInfo.Middle
            public Money getInterestAccruing() {
                return this.interestAccruing;
            }

            public final BigDecimal getApyInterest() {
                return this.apyInterest;
            }

            public final ApiSweepsTimelineSummary.PausedReason getPausedReason() {
                return this.pausedReason;
            }

            public final String getPausedDisplayMessage() {
                return this.pausedDisplayMessage;
            }

            public final Account getAccount() {
                return this.account;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Paused(Reason reason, Money money, BigDecimal apyInterest, ApiSweepsTimelineSummary.PausedReason pausedReason, String str, Account account) {
                super(reason, money, null);
                Intrinsics.checkNotNullParameter(reason, "reason");
                Intrinsics.checkNotNullParameter(apyInterest, "apyInterest");
                Intrinsics.checkNotNullParameter(account, "account");
                this.reason = reason;
                this.interestAccruing = money;
                this.apyInterest = apyInterest;
                this.pausedReason = pausedReason;
                this.pausedDisplayMessage = str;
                this.account = account;
            }

            public final DialogInfo getDialogInfo() {
                ApiSweepsTimelineSummary.PausedReason pausedReason = this.pausedReason;
                int i = pausedReason == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pausedReason.ordinal()];
                if (i == 1) {
                    StringResource.Companion companion = StringResource.INSTANCE;
                    return new DialogInfo(companion.invoke(C16703R.string.interest_pdt_restricted_dialog_message_v2, AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence()), companion.invoke(C16703R.string.interest_pdt_restricted_dialog_title_v2, new Object[0]), C11048R.string.general_action_learn_more, C16703R.string.url_pdt_help_center);
                }
                if (i == 2) {
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    return new DialogInfo(companion2.invoke(C16703R.string.interest_margin_restricted_dialog_message, Formats.getInterestRateFormatShort().format(this.apyInterest)), companion2.invoke(C16703R.string.interest_margin_restricted_dialog_title, new Object[0]), C11048R.string.general_action_learn_more, C16703R.string.url_interest_margin_help_center);
                }
                if (i != 3) {
                    return null;
                }
                throw new IllegalStateException("Incorrect view logic. Please open up buying power");
            }

            /* compiled from: UiTimelineInfo.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Paused$DialogInfo;", "", "dialogMessage", "Lcom/robinhood/utils/resource/StringResource;", "dialogTitle", "negativeButton", "", "helpCenterUrl", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;II)V", "getDialogMessage", "()Lcom/robinhood/utils/resource/StringResource;", "getDialogTitle", "getNegativeButton", "()I", "getHelpCenterUrl", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class DialogInfo {
                private final StringResource dialogMessage;
                private final StringResource dialogTitle;
                private final int helpCenterUrl;
                private final int negativeButton;

                public DialogInfo(StringResource dialogMessage, StringResource dialogTitle, int i, int i2) {
                    Intrinsics.checkNotNullParameter(dialogMessage, "dialogMessage");
                    Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
                    this.dialogMessage = dialogMessage;
                    this.dialogTitle = dialogTitle;
                    this.negativeButton = i;
                    this.helpCenterUrl = i2;
                }

                public final StringResource getDialogMessage() {
                    return this.dialogMessage;
                }

                public final StringResource getDialogTitle() {
                    return this.dialogTitle;
                }

                public final int getNegativeButton() {
                    return this.negativeButton;
                }

                public final int getHelpCenterUrl() {
                    return this.helpCenterUrl;
                }
            }
        }

        /* compiled from: UiTimelineInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u000e\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Activated;", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle;", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "reason", "Lcom/robinhood/models/util/Money;", "interestAccruing", "j$/time/LocalDate", InquiryField.DateField.TYPE, "<init>", "(Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;Lcom/robinhood/models/util/Money;Lj$/time/LocalDate;)V", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "getReason", "()Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "Lcom/robinhood/models/util/Money;", "getInterestAccruing", "()Lcom/robinhood/models/util/Money;", "Lj$/time/LocalDate;", "getDate", "()Lj$/time/LocalDate;", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Activated extends Middle {
            private final LocalDate date;
            private final Money interestAccruing;
            private final Reason reason;

            @Override // com.robinhood.android.feature.lib.sweep.interest.UiTimelineInfo.Middle
            public Reason getReason() {
                return this.reason;
            }

            @Override // com.robinhood.android.feature.lib.sweep.interest.UiTimelineInfo.Middle
            public Money getInterestAccruing() {
                return this.interestAccruing;
            }

            public final LocalDate getDate() {
                return this.date;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activated(Reason reason, Money money, LocalDate localDate) {
                super(reason, money, null);
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.reason = reason;
                this.interestAccruing = money;
                this.date = localDate;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UiTimelineInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Middle$Reason;", "", "titleText", "", "<init>", "(Ljava/lang/String;II)V", "getTitleText", "()I", "DEPOSIT_TO_EARN", "INTEREST_ACCRUING_TO_START", "INTEREST_ACCRUING", "INTEREST_ACCRUED", "INTEREST_PAUSED", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Reason {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Reason[] $VALUES;
            private final int titleText;
            public static final Reason DEPOSIT_TO_EARN = new Reason("DEPOSIT_TO_EARN", 0, C16703R.string.interest_earning_deposit_money_to_earn);
            public static final Reason INTEREST_ACCRUING_TO_START = new Reason("INTEREST_ACCRUING_TO_START", 1, C16703R.string.interest_earning_begins_accruing);
            public static final Reason INTEREST_ACCRUING = new Reason("INTEREST_ACCRUING", 2, C16703R.string.interest_earning_accruing);
            public static final Reason INTEREST_ACCRUED = new Reason("INTEREST_ACCRUED", 3, C16703R.string.interest_earning_accrued);
            public static final Reason INTEREST_PAUSED = new Reason("INTEREST_PAUSED", 4, C16703R.string.interest_earning_paused);

            private static final /* synthetic */ Reason[] $values() {
                return new Reason[]{DEPOSIT_TO_EARN, INTEREST_ACCRUING_TO_START, INTEREST_ACCRUING, INTEREST_ACCRUED, INTEREST_PAUSED};
            }

            public static EnumEntries<Reason> getEntries() {
                return $ENTRIES;
            }

            private Reason(String str, int i, int i2) {
                this.titleText = i2;
            }

            public final int getTitleText() {
                return this.titleText;
            }

            static {
                Reason[] reasonArr$values = $values();
                $VALUES = reasonArr$values;
                $ENTRIES = EnumEntries2.enumEntries(reasonArr$values);
            }

            public static Reason valueOf(String str) {
                return (Reason) Enum.valueOf(Reason.class, str);
            }

            public static Reason[] values() {
                return (Reason[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: UiTimelineInfo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo$Bottom;", "", "", "title", "j$/time/LocalDate", InquiryField.DateField.TYPE, "Lcom/robinhood/models/util/Money;", "interestPaid", "Ljava/util/UUID;", "id", "<init>", "(ILj$/time/LocalDate;Lcom/robinhood/models/util/Money;Ljava/util/UUID;)V", "I", "getTitle", "()I", "Lj$/time/LocalDate;", "getDate", "()Lj$/time/LocalDate;", "Lcom/robinhood/models/util/Money;", "getInterestPaid", "()Lcom/robinhood/models/util/Money;", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Bottom {
        private final LocalDate date;
        private final UUID id;
        private final Money interestPaid;
        private final int title;

        public Bottom(int i, LocalDate date, Money money, UUID uuid) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.title = i;
            this.date = date;
            this.interestPaid = money;
            this.id = uuid;
        }

        public /* synthetic */ Bottom(int i, LocalDate localDate, Money money, UUID uuid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, localDate, (i2 & 4) != 0 ? null : money, (i2 & 8) != 0 ? null : uuid);
        }

        public final int getTitle() {
            return this.title;
        }

        public final LocalDate getDate() {
            return this.date;
        }

        public final Money getInterestPaid() {
            return this.interestPaid;
        }

        public final UUID getId() {
            return this.id;
        }
    }
}
