package com.robinhood.android.investFlow.submit;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringViewState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowPostBody;
import com.robinhood.investflow.models.api.ApiInvestFlowRecurringSchedulePostBody;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.text.Spans;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestFlowOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010$J\u001e\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+J\"\u0010-\u001a\u00020,*\u00020.2\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\u000e\u0010/\u001a\u0002002\u0006\u0010\u0006\u001a\u00020\u0007J\t\u00101\u001a\u00020\u0003HÂ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003Je\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010:\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u000fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderViewState;", "", "isLoadingNbbo", "", "account", "Lcom/robinhood/models/db/Account;", "amount", "Lcom/robinhood/models/util/Money;", "isCrypto", "assetAllocations", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "nbboResponse", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "accountNumber", "", "contentViewState", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmitViewState;", "<init>", "(ZLcom/robinhood/models/db/Account;Lcom/robinhood/models/util/Money;ZLjava/util/List;Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;Ljava/lang/String;Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmitViewState;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getAmount", "()Lcom/robinhood/models/util/Money;", "()Z", "getAssetAllocations", "()Ljava/util/List;", "getNbboResponse", "()Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "getAccountNumber", "()Ljava/lang/String;", "getContentViewState", "()Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmitViewState;", "getPostBody", "Lcom/robinhood/android/investFlow/submit/InvestFlowSubmitData;", "refId", "Ljava/util/UUID;", "sourceId", "getOrderSummaryDescription", "Landroid/text/SpannedString;", "context", "Landroid/content/Context;", "onRefreshNbbo", "Lkotlin/Function0;", "", "appendNbboRefreshText", "Landroid/text/SpannableStringBuilder;", "amountCharArray", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowOrderViewState {
    public static final int $stable = 8;
    private final Account account;
    private final String accountNumber;
    private final Money amount;
    private final List<ApiAssetAllocation> assetAllocations;
    private final InvestFlowOrderArgs2 contentViewState;
    private final boolean isCrypto;
    private final boolean isLoadingNbbo;
    private final ApiInvestFlowNbboResponse nbboResponse;

    /* renamed from: component1, reason: from getter */
    private final boolean getIsLoadingNbbo() {
        return this.isLoadingNbbo;
    }

    public static /* synthetic */ InvestFlowOrderViewState copy$default(InvestFlowOrderViewState investFlowOrderViewState, boolean z, Account account, Money money, boolean z2, List list, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, String str, InvestFlowOrderArgs2 investFlowOrderArgs2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investFlowOrderViewState.isLoadingNbbo;
        }
        if ((i & 2) != 0) {
            account = investFlowOrderViewState.account;
        }
        if ((i & 4) != 0) {
            money = investFlowOrderViewState.amount;
        }
        if ((i & 8) != 0) {
            z2 = investFlowOrderViewState.isCrypto;
        }
        if ((i & 16) != 0) {
            list = investFlowOrderViewState.assetAllocations;
        }
        if ((i & 32) != 0) {
            apiInvestFlowNbboResponse = investFlowOrderViewState.nbboResponse;
        }
        if ((i & 64) != 0) {
            str = investFlowOrderViewState.accountNumber;
        }
        if ((i & 128) != 0) {
            investFlowOrderArgs2 = investFlowOrderViewState.contentViewState;
        }
        String str2 = str;
        InvestFlowOrderArgs2 investFlowOrderArgs22 = investFlowOrderArgs2;
        List list2 = list;
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse2 = apiInvestFlowNbboResponse;
        return investFlowOrderViewState.copy(z, account, money, z2, list2, apiInvestFlowNbboResponse2, str2, investFlowOrderArgs22);
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    public final List<ApiAssetAllocation> component5() {
        return this.assetAllocations;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiInvestFlowNbboResponse getNbboResponse() {
        return this.nbboResponse;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final InvestFlowOrderArgs2 getContentViewState() {
        return this.contentViewState;
    }

    public final InvestFlowOrderViewState copy(boolean isLoadingNbbo, Account account, Money amount, boolean isCrypto, List<ApiAssetAllocation> assetAllocations, ApiInvestFlowNbboResponse nbboResponse, String accountNumber, InvestFlowOrderArgs2 contentViewState) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new InvestFlowOrderViewState(isLoadingNbbo, account, amount, isCrypto, assetAllocations, nbboResponse, accountNumber, contentViewState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowOrderViewState)) {
            return false;
        }
        InvestFlowOrderViewState investFlowOrderViewState = (InvestFlowOrderViewState) other;
        return this.isLoadingNbbo == investFlowOrderViewState.isLoadingNbbo && Intrinsics.areEqual(this.account, investFlowOrderViewState.account) && Intrinsics.areEqual(this.amount, investFlowOrderViewState.amount) && this.isCrypto == investFlowOrderViewState.isCrypto && Intrinsics.areEqual(this.assetAllocations, investFlowOrderViewState.assetAllocations) && Intrinsics.areEqual(this.nbboResponse, investFlowOrderViewState.nbboResponse) && Intrinsics.areEqual(this.accountNumber, investFlowOrderViewState.accountNumber) && Intrinsics.areEqual(this.contentViewState, investFlowOrderViewState.contentViewState);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoadingNbbo) * 31;
        Account account = this.account;
        int iHashCode2 = (((((((iHashCode + (account == null ? 0 : account.hashCode())) * 31) + this.amount.hashCode()) * 31) + Boolean.hashCode(this.isCrypto)) * 31) + this.assetAllocations.hashCode()) * 31;
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = this.nbboResponse;
        int iHashCode3 = (((iHashCode2 + (apiInvestFlowNbboResponse == null ? 0 : apiInvestFlowNbboResponse.hashCode())) * 31) + this.accountNumber.hashCode()) * 31;
        InvestFlowOrderArgs2 investFlowOrderArgs2 = this.contentViewState;
        return iHashCode3 + (investFlowOrderArgs2 != null ? investFlowOrderArgs2.hashCode() : 0);
    }

    public String toString() {
        return "InvestFlowOrderViewState(isLoadingNbbo=" + this.isLoadingNbbo + ", account=" + this.account + ", amount=" + this.amount + ", isCrypto=" + this.isCrypto + ", assetAllocations=" + this.assetAllocations + ", nbboResponse=" + this.nbboResponse + ", accountNumber=" + this.accountNumber + ", contentViewState=" + this.contentViewState + ")";
    }

    public InvestFlowOrderViewState(boolean z, Account account, Money amount, boolean z2, List<ApiAssetAllocation> assetAllocations, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, String accountNumber, InvestFlowOrderArgs2 investFlowOrderArgs2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.isLoadingNbbo = z;
        this.account = account;
        this.amount = amount;
        this.isCrypto = z2;
        this.assetAllocations = assetAllocations;
        this.nbboResponse = apiInvestFlowNbboResponse;
        this.accountNumber = accountNumber;
        this.contentViewState = investFlowOrderArgs2;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public /* synthetic */ InvestFlowOrderViewState(boolean z, Account account, Money money, boolean z2, List list, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, String str, InvestFlowOrderArgs2 investFlowOrderArgs2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : account, money, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : apiInvestFlowNbboResponse, str, (i & 128) != 0 ? null : investFlowOrderArgs2);
    }

    public final List<ApiAssetAllocation> getAssetAllocations() {
        return this.assetAllocations;
    }

    public final ApiInvestFlowNbboResponse getNbboResponse() {
        return this.nbboResponse;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final InvestFlowOrderArgs2 getContentViewState() {
        return this.contentViewState;
    }

    public final InvestFlowSubmitData getPostBody(UUID refId, UUID sourceId) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        List<ApiInvestFlowRecurringSchedulePostBody> listEmptyList = CollectionsKt.emptyList();
        InvestFlowOrderArgs2 investFlowOrderArgs2 = this.contentViewState;
        InvestFlowRecurringViewState investFlowRecurringViewState = investFlowOrderArgs2 instanceof InvestFlowRecurringViewState ? (InvestFlowRecurringViewState) investFlowOrderArgs2 : null;
        if (investFlowRecurringViewState != null) {
            listEmptyList = investFlowRecurringViewState.getRecurringSchedulesPostBody();
        }
        List<ApiInvestFlowRecurringSchedulePostBody> list = listEmptyList;
        Account account = this.account;
        BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
        List<ApiAssetAllocation> list2 = this.assetAllocations;
        Account account2 = this.account;
        return new InvestFlowSubmitData(brokerageAccountType, new ApiInvestFlowPostBody(list2, account2 != null ? account2.getAccountNumber() : null, this.amount, list, refId, sourceId));
    }

    public final SpannedString getOrderSummaryDescription(Context context, Function0<Unit> onRefreshNbbo) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onRefreshNbbo, "onRefreshNbbo");
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = this.nbboResponse;
        if (apiInvestFlowNbboResponse == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (PlaceholderUtils.XXShortPlaceholderText + apiInvestFlowNbboResponse.getNbbo_string_1()));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground2));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (PlaceholderUtils.XXShortPlaceholderText + apiInvestFlowNbboResponse.getNbbo_string_2()));
        spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        appendNbboRefreshText(spannableStringBuilder, context, onRefreshNbbo);
        return new SpannedString(spannableStringBuilder);
    }

    private final void appendNbboRefreshText(SpannableStringBuilder spannableStringBuilder, Context context, final Function0<Unit> function0) throws Resources.NotFoundException {
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = this.nbboResponse;
        spannableStringBuilder.append((CharSequence) (PlaceholderUtils.XXShortPlaceholderText + (apiInvestFlowNbboResponse != null ? apiInvestFlowNbboResponse.getLast_refresh_string() : null) + PlaceholderUtils.XXShortPlaceholderText));
        String string2 = context.getString(C11048R.string.general_label_refresh);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        spannableStringBuilder.append(PlaceholderUtils.XXShortPlaceholderText);
        Spans spans = Spans.INSTANCE;
        final boolean z = true;
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderViewState$appendNbboRefreshText$$inlined$appendClickableSpan$1
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "textPaint");
                textPaint.setColor(textPaint.linkColor);
                textPaint.setUnderlineText(z);
                if (z) {
                    textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                }
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                function0.invoke();
            }
        };
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(clickableSpan, length, spannableStringBuilder.length(), 17);
        if (this.isLoadingNbbo) {
            spannableStringBuilder.append(PlaceholderUtils.XXShortPlaceholderText);
            Drawable drawable = context.getDrawable(C13997R.drawable.button_spinner);
            Intrinsics.checkNotNull(drawable);
            Drawable drawableMutate = drawable.mutate();
            Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawableMutate;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
            animatedVectorDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            animatedVectorDrawable.setTint(ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary));
            animatedVectorDrawable.start();
            ImageSpan imageSpan = new ImageSpan(animatedVectorDrawable, Build.VERSION.SDK_INT >= 29 ? 2 : 0);
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(PlaceholderUtils.XXShortPlaceholderText);
            spannableStringBuilder.setSpan(imageSpan, length2, spannableStringBuilder.length(), 17);
        }
    }

    public final char[] amountCharArray(Money amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        char[] charArray = Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null).toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return charArray;
    }
}
