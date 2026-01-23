package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelStoreOwner;
import com.singular.sdk.internal.Constants;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.R$string;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardAccountRangeService;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.cards.DefaultStaticCardAccountRanges;
import com.stripe.android.cards.StaticCardAccountRanges;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardNumberEditText.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002xyB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB?\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fBc\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ/\u0010h\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u00072\u0006\u0010j\u001a\u00020\u00072\u0006\u0010k\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u0007H\u0000¢\u0006\u0002\blJ\b\u0010m\u001a\u00020'H\u0014J\r\u0010n\u001a\u00020'H\u0000¢\u0006\u0002\boJ\b\u0010p\u001a\u00020'H\u0014J\u0012\u0010q\u001a\u00020'2\b\u0010r\u001a\u0004\u0018\u00010sH\u0016J\b\u0010t\u001a\u00020sH\u0016J\u0017\u0010u\u001a\u00020'2\b\b\u0002\u0010v\u001a\u00020\u0007H\u0000¢\u0006\u0002\bwR\u0014\u0010\u001b\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R<\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020&8\u0006@@X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u0010!\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u00104\u001a\b\u0012\u0004\u0012\u00020'0\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R<\u0010<\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R$\u0010?\u001a\u00020&2\u0006\u0010-\u001a\u00020&@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00101\"\u0004\bA\u00103R\u001e\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020C@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020CX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020'0%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010*\"\u0004\bI\u0010,R\u0014\u0010J\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010ER\u0010\u0010K\u001a\u0004\u0018\u00010LX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010M\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010;R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010P\u001a\b\u0012\u0004\u0012\u00020&0O2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0O@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TRH\u0010U\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0O\u0012\u0004\u0012\u00020'0%2\u0018\u0010$\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0O\u0012\u0004\u0012\u00020'0%@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010*\"\u0004\bW\u0010,R\u0014\u0010X\u001a\u00020Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u0004\u0018\u00010]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001c\u0010\u000b\u001a\u00020\n8\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006z"}, m3636d2 = {"Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "workContext", "publishableKeySupplier", "Lkotlin/Function0;", "", "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)V", "cardAccountRangeRepository", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "staticCardAccountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/CardAccountRangeRepository;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Landroidx/lifecycle/ViewModelStoreOwner;)V", "accessibilityText", "getAccessibilityText", "()Ljava/lang/String;", "accountRangeService", "Lcom/stripe/android/cards/CardAccountRangeService;", "getAccountRangeService$annotations", "()V", "getAccountRangeService", "()Lcom/stripe/android/cards/CardAccountRangeService;", "callback", "Lkotlin/Function1;", "Lcom/stripe/android/model/CardBrand;", "", "brandChangeCallback", "getBrandChangeCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setBrandChangeCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "value", "cardBrand", "getCardBrand$annotations", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "setCardBrand$payments_core_release", "(Lcom/stripe/android/model/CardBrand;)V", "completionCallback", "getCompletionCallback$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "formattedPanLength", "getFormattedPanLength", "()I", "implicitCardBrandChangeCallback", "getImplicitCardBrandChangeCallback$payments_core_release", "setImplicitCardBrandChangeCallback$payments_core_release", "implicitCardBrandForCbc", "getImplicitCardBrandForCbc$payments_core_release", "setImplicitCardBrandForCbc$payments_core_release", "<set-?>", "", "isCardNumberValid", "()Z", "isCbcEligible", "isLoadingCallback", "isLoadingCallback$payments_core_release", "setLoadingCallback$payments_core_release", "isValid", "loadingJob", "Lkotlinx/coroutines/Job;", "panLength", "getPanLength$payments_core_release", "", "possibleCardBrands", "getPossibleCardBrands$payments_core_release", "()Ljava/util/List;", "setPossibleCardBrands$payments_core_release", "(Ljava/util/List;)V", "possibleCardBrandsCallback", "getPossibleCardBrandsCallback$payments_core_release", "setPossibleCardBrandsCallback$payments_core_release", "unvalidatedCardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "getUnvalidatedCardNumber", "()Lcom/stripe/android/cards/CardNumber$Unvalidated;", "validatedCardNumber", "Lcom/stripe/android/cards/CardNumber$Validated;", "getValidatedCardNumber$payments_core_release", "()Lcom/stripe/android/cards/CardNumber$Validated;", "getViewModelStoreOwner$payments_core_release", "()Landroidx/lifecycle/ViewModelStoreOwner;", "setViewModelStoreOwner$payments_core_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "getWorkContext", "()Lkotlin/coroutines/CoroutineContext;", "setWorkContext", "(Lkotlin/coroutines/CoroutineContext;)V", "calculateCursorPosition", "newFormattedLength", "start", "addedDigits", "calculateCursorPosition$payments_core_release", "onAttachedToWindow", "onCardMetadataLoadedTooSlow", "onCardMetadataLoadedTooSlow$payments_core_release", "onDetachedFromWindow", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "updateLengthFilter", "maxLength", "updateLengthFilter$payments_core_release", "CardNumberTextWatcher", "SavedState", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CardNumberEditText extends StripeEditText {
    private final CardAccountRangeService accountRangeService;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private /* synthetic */ Function1<? super CardBrand, Unit> brandChangeCallback;
    private final CardAccountRangeRepository cardAccountRangeRepository;
    private CardBrand cardBrand;
    private /* synthetic */ Function0<Unit> completionCallback;
    private Function1<? super CardBrand, Unit> implicitCardBrandChangeCallback;
    private CardBrand implicitCardBrandForCbc;
    private boolean isCardNumberValid;
    private boolean isCbcEligible;
    private /* synthetic */ Function1<? super Boolean, Unit> isLoadingCallback;
    private Job loadingJob;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private List<? extends CardBrand> possibleCardBrands;
    private /* synthetic */ Function1<? super List<? extends CardBrand>, Unit> possibleCardBrandsCallback;
    private ViewModelStoreOwner viewModelStoreOwner;
    private CoroutineContext workContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getAccountRangeService$annotations() {
    }

    public static /* synthetic */ void getCardBrand$annotations() {
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CardAccountRangeRepository cardAccountRangeRepository, StaticCardAccountRanges staticCardAccountRanges, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ViewModelStoreOwner viewModelStoreOwner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.editTextStyle : i, coroutineContext, coroutineContext2, cardAccountRangeRepository, (i2 & 64) != 0 ? new DefaultStaticCardAccountRanges() : staticCardAccountRanges, analyticsRequestExecutor, paymentAnalyticsRequestFactory, (i2 & 512) != 0 ? null : viewModelStoreOwner);
    }

    public final CoroutineContext getWorkContext() {
        return this.workContext;
    }

    public final void setWorkContext(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<set-?>");
        this.workContext = coroutineContext;
    }

    /* renamed from: getViewModelStoreOwner$payments_core_release, reason: from getter */
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.viewModelStoreOwner = viewModelStoreOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i, CoroutineContext uiContext, CoroutineContext workContext, CardAccountRangeRepository cardAccountRangeRepository, StaticCardAccountRanges staticCardAccountRanges, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ViewModelStoreOwner viewModelStoreOwner) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepository, "cardAccountRangeRepository");
        Intrinsics.checkNotNullParameter(staticCardAccountRanges, "staticCardAccountRanges");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.workContext = workContext;
        this.cardAccountRangeRepository = cardAccountRangeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.viewModelStoreOwner = viewModelStoreOwner;
        CardBrand cardBrand = CardBrand.Unknown;
        this.cardBrand = cardBrand;
        this.brandChangeCallback = new Function1<CardBrand, Unit>() { // from class: com.stripe.android.view.CardNumberEditText$brandChangeCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CardBrand it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CardBrand cardBrand2) {
                invoke2(cardBrand2);
                return Unit.INSTANCE;
            }
        };
        this.implicitCardBrandForCbc = cardBrand;
        this.implicitCardBrandChangeCallback = new Function1<CardBrand, Unit>() { // from class: com.stripe.android.view.CardNumberEditText$implicitCardBrandChangeCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CardBrand it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CardBrand cardBrand2) {
                invoke2(cardBrand2);
                return Unit.INSTANCE;
            }
        };
        this.possibleCardBrands = CollectionsKt.emptyList();
        this.possibleCardBrandsCallback = new Function1<List<? extends CardBrand>, Unit>() { // from class: com.stripe.android.view.CardNumberEditText$possibleCardBrandsCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends CardBrand> it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CardBrand> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }
        };
        this.completionCallback = new Function0<Unit>() { // from class: com.stripe.android.view.CardNumberEditText$completionCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.accountRangeService = new CardAccountRangeService(cardAccountRangeRepository, uiContext, this.workContext, staticCardAccountRanges, new CardAccountRangeService.AccountRangeResultListener() { // from class: com.stripe.android.view.CardNumberEditText$accountRangeService$1
            @Override // com.stripe.android.cards.CardAccountRangeService.AccountRangeResultListener
            public void onAccountRangesResult(List<AccountRange> accountRanges) {
                Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
                CardNumberEditText.updateLengthFilter$payments_core_release$default(this.this$0, 0, 1, null);
                List<AccountRange> list = accountRanges;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AccountRange) it.next()).getBrand());
                }
                List<? extends CardBrand> listDistinct = CollectionsKt.distinct(arrayList);
                CardNumberEditText cardNumberEditText = this.this$0;
                CardBrand cardBrand2 = (CardBrand) CollectionsKt.singleOrNull((List) listDistinct);
                if (cardBrand2 == null) {
                    cardBrand2 = CardBrand.Unknown;
                }
                cardNumberEditText.setCardBrand$payments_core_release(cardBrand2);
                if (this.this$0.isCbcEligible) {
                    CardNumberEditText cardNumberEditText2 = this.this$0;
                    CardBrand cardBrand3 = (CardBrand) CollectionsKt.firstOrNull((List) listDistinct);
                    if (cardBrand3 == null) {
                        cardBrand3 = CardBrand.Unknown;
                    }
                    cardNumberEditText2.setImplicitCardBrandForCbc$payments_core_release(cardBrand3);
                    this.this$0.setPossibleCardBrands$payments_core_release(listDistinct);
                }
            }
        }, new Function0<Boolean>() { // from class: com.stripe.android.view.CardNumberEditText$accountRangeService$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.isCbcEligible);
            }
        });
        this.isLoadingCallback = new Function1<Boolean, Unit>() { // from class: com.stripe.android.view.CardNumberEditText$isLoadingCallback$1
            public final void invoke(boolean z) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }
        };
        setNumberOnlyInputType();
        setErrorMessage(getResources().getString(R$string.stripe_invalid_card_number));
        addTextChangedListener(new CardNumberTextWatcher());
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardNumberEditText._init_$lambda$1(this.f$0, view, z);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardNumber"});
        }
        updateLengthFilter$payments_core_release$default(this, 0, 1, null);
        setLayoutDirection(0);
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.editTextStyle : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardNumberEditText(final Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, Dispatchers.getMain(), Dispatchers.getIO(), new Function0<String>() { // from class: com.stripe.android.view.CardNumberEditText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return PaymentConfiguration.INSTANCE.getInstance(context).getPublishableKey();
            }
        });
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private CardNumberEditText(Context context, AttributeSet attributeSet, int i, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final Function0<String> function0) {
        this(context, attributeSet, i, coroutineContext, coroutineContext2, new DefaultCardAccountRangeRepositoryFactory(context).create(), new DefaultStaticCardAccountRanges(), new DefaultAnalyticsRequestExecutor(), new PaymentAnalyticsRequestFactory(context, new Provider() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda1
            @Override // javax.inject.Provider
            public final Object get() {
                return CardNumberEditText._init_$lambda$0(function0);
            }
        }), null, 512, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final void setCardBrand$payments_core_release(CardBrand value) {
        Intrinsics.checkNotNullParameter(value, "value");
        CardBrand cardBrand = this.cardBrand;
        this.cardBrand = value;
        if (value != cardBrand) {
            this.brandChangeCallback.invoke(value);
            updateLengthFilter$payments_core_release$default(this, 0, 1, null);
        }
    }

    public final Function1<CardBrand, Unit> getBrandChangeCallback$payments_core_release() {
        return this.brandChangeCallback;
    }

    public final void setBrandChangeCallback$payments_core_release(Function1<? super CardBrand, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.brandChangeCallback = callback;
        callback.invoke(this.cardBrand);
    }

    /* renamed from: getImplicitCardBrandForCbc$payments_core_release, reason: from getter */
    public final CardBrand getImplicitCardBrandForCbc() {
        return this.implicitCardBrandForCbc;
    }

    public final void setImplicitCardBrandForCbc$payments_core_release(CardBrand value) {
        Intrinsics.checkNotNullParameter(value, "value");
        CardBrand cardBrand = this.implicitCardBrandForCbc;
        this.implicitCardBrandForCbc = value;
        if (value != cardBrand) {
            this.implicitCardBrandChangeCallback.invoke(value);
            updateLengthFilter$payments_core_release$default(this, 0, 1, null);
        }
    }

    public final Function1<CardBrand, Unit> getImplicitCardBrandChangeCallback$payments_core_release() {
        return this.implicitCardBrandChangeCallback;
    }

    public final void setImplicitCardBrandChangeCallback$payments_core_release(Function1<? super CardBrand, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.implicitCardBrandChangeCallback = callback;
        callback.invoke(this.implicitCardBrandForCbc);
    }

    public final List<CardBrand> getPossibleCardBrands$payments_core_release() {
        return this.possibleCardBrands;
    }

    public final void setPossibleCardBrands$payments_core_release(List<? extends CardBrand> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List<? extends CardBrand> list = this.possibleCardBrands;
        this.possibleCardBrands = value;
        if (Intrinsics.areEqual(value, list)) {
            return;
        }
        this.possibleCardBrandsCallback.invoke(value);
        updateLengthFilter$payments_core_release$default(this, 0, 1, null);
    }

    public final Function1<List<? extends CardBrand>, Unit> getPossibleCardBrandsCallback$payments_core_release() {
        return this.possibleCardBrandsCallback;
    }

    public final void setPossibleCardBrandsCallback$payments_core_release(Function1<? super List<? extends CardBrand>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.possibleCardBrandsCallback = callback;
        callback.invoke(this.possibleCardBrands);
    }

    public final Function0<Unit> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final void setCompletionCallback$payments_core_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.completionCallback = function0;
    }

    public final int getPanLength$payments_core_release() {
        AccountRange accountRange = this.accountRangeService.getAccountRange();
        if (accountRange != null) {
            return accountRange.getPanLength();
        }
        AccountRange accountRangeFirst = this.accountRangeService.getStaticCardAccountRanges().first(getUnvalidatedCardNumber());
        if (accountRangeFirst != null) {
            return accountRangeFirst.getPanLength();
        }
        return 16;
    }

    private final int getFormattedPanLength() {
        return getPanLength$payments_core_release() + CardNumber.INSTANCE.getSpacePositions(getPanLength$payments_core_release()).size();
    }

    /* renamed from: isCardNumberValid, reason: from getter */
    public final boolean getIsCardNumberValid() {
        return this.isCardNumberValid;
    }

    public final CardNumber.Validated getValidatedCardNumber$payments_core_release() {
        return getUnvalidatedCardNumber().validate(getPanLength$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardNumber.Unvalidated getUnvalidatedCardNumber() {
        return new CardNumber.Unvalidated(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid() {
        return getValidatedCardNumber$payments_core_release() != null;
    }

    public final CardAccountRangeService getAccountRangeService() {
        return this.accountRangeService;
    }

    public final Function1<Boolean, Unit> isLoadingCallback$payments_core_release() {
        return this.isLoadingCallback;
    }

    public final void setLoadingCallback$payments_core_release(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.isLoadingCallback = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CardNumberEditText this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z || !this$0.getUnvalidatedCardNumber().isPartialEntry(this$0.getPanLength$payments_core_release())) {
            return;
        }
        this$0.setShouldShowError(true);
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.loadingJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(this.workContext), null, null, new C426691(null), 3, null);
        CardWidgetViewModel6.doWithCardWidgetViewModel(this, this.viewModelStoreOwner, new Function2<LifecycleOwner, CardWidgetViewModel, Unit>() { // from class: com.stripe.android.view.CardNumberEditText.onAttachedToWindow.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner, CardWidgetViewModel cardWidgetViewModel) {
                invoke2(lifecycleOwner, cardWidgetViewModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LifecycleOwner doWithCardWidgetViewModel, CardWidgetViewModel viewModel) {
                Intrinsics.checkNotNullParameter(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                StateFlow<Boolean> stateFlowIsCbcEligible = viewModel.isCbcEligible();
                CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(doWithCardWidgetViewModel), null, null, new CardWidgetViewModel4(doWithCardWidgetViewModel, Lifecycle.State.STARTED, stateFlowIsCbcEligible, null, cardNumberEditText), 3, null);
            }
        });
    }

    /* compiled from: CardNumberEditText.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1", m3645f = "CardNumberEditText.kt", m3646l = {224}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1 */
    static final class C426691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C426691(Continuation<? super C426691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardNumberEditText.this.new C426691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> loading = CardNumberEditText.this.cardAccountRangeRepository.getLoading();
                final CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.stripe.android.view.CardNumberEditText.onAttachedToWindow.1.1

                    /* compiled from: CardNumberEditText.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1$1$1", m3645f = "CardNumberEditText.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C508291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $it;
                        int label;
                        final /* synthetic */ CardNumberEditText this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C508291(CardNumberEditText cardNumberEditText, boolean z, Continuation<? super C508291> continuation) {
                            super(2, continuation);
                            this.this$0 = cardNumberEditText;
                            this.$it = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C508291(this.this$0, this.$it, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C508291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.this$0.isLoadingCallback$payments_core_release().invoke(boxing.boxBoolean(this.$it));
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C508291(cardNumberEditText, z, null), continuation);
                        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (loading.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() throws Resources.NotFoundException {
        String string2 = getResources().getString(R$string.stripe_acc_label_card_number_node, getText());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    protected void onDetachedFromWindow() {
        Job job = this.loadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.loadingJob = null;
        this.accountRangeService.cancelAccountRangeRepositoryJob();
        super.onDetachedFromWindow();
    }

    public static /* synthetic */ void updateLengthFilter$payments_core_release$default(CardNumberEditText cardNumberEditText, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cardNumberEditText.getFormattedPanLength();
        }
        cardNumberEditText.updateLengthFilter$payments_core_release(i);
    }

    public final /* synthetic */ void updateLengthFilter$payments_core_release(int maxLength) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
    }

    public final /* synthetic */ int calculateCursorPosition$payments_core_release(int newFormattedLength, int start, int addedDigits, int panLength) {
        int i;
        Set<Integer> spacePositions = CardNumber.INSTANCE.getSpacePositions(panLength);
        boolean z = spacePositions instanceof Collection;
        boolean z2 = false;
        if (z && spacePositions.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = spacePositions.iterator();
            i = 0;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (start <= iIntValue && start + addedDigits >= iIntValue && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (!z || !spacePositions.isEmpty()) {
            Iterator<T> it2 = spacePositions.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int iIntValue2 = ((Number) it2.next()).intValue();
                if (addedDigits == 0 && start == iIntValue2 + 1) {
                    z2 = true;
                    break;
                }
            }
        }
        int i2 = start + addedDigits + i;
        if (z2 && i2 > 0) {
            i2--;
        }
        return i2 <= newFormattedLength ? i2 : newFormattedLength;
    }

    public final /* synthetic */ void onCardMetadataLoadedTooSlow$payments_core_release() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CardMetadataLoadedTooSlow, null, null, null, null, null, 62, null));
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.isCbcEligible);
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Parcelable superState;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        this.isCbcEligible = savedState != null ? savedState.getIsCbcEligible() : false;
        if (savedState != null && (superState = savedState.getSuperState()) != null) {
            state = superState;
        }
        super.onRestoreInstanceState(state);
    }

    /* compiled from: CardNumberEditText.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/stripe/android/view/CardNumberEditText$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superSavedState", "", "isCbcEligible", "<init>", "(Landroid/os/Parcelable;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/os/Parcelable;", "getSuperSavedState", "()Landroid/os/Parcelable;", "Z", "()Z", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SavedState extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final boolean isCbcEligible;
        private final Parcelable superSavedState;

        /* compiled from: CardNumberEditText.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return Intrinsics.areEqual(this.superSavedState, savedState.superSavedState) && this.isCbcEligible == savedState.isCbcEligible;
        }

        public int hashCode() {
            Parcelable parcelable = this.superSavedState;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + Boolean.hashCode(this.isCbcEligible);
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.superSavedState + ", isCbcEligible=" + this.isCbcEligible + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.superSavedState, flags);
            parcel.writeInt(this.isCbcEligible ? 1 : 0);
        }

        /* renamed from: isCbcEligible, reason: from getter */
        public final boolean getIsCbcEligible() {
            return this.isCbcEligible;
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.superSavedState = parcelable;
            this.isCbcEligible = z;
        }
    }

    /* compiled from: CardNumberEditText.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J*\u0010\u0017\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J(\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0004H\u0002J*\u0010\"\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006$"}, m3636d2 = {"Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;", "Lcom/stripe/android/view/StripeTextWatcher;", "(Lcom/stripe/android/view/CardNumberEditText;)V", "beforeCardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "digitsAdded", "", "getDigitsAdded", "()Z", "formattedNumber", "", "isPastedPan", "latestChangeStart", "", "latestInsertionSize", "newCursorPosition", "Ljava/lang/Integer;", "shouldUpdateAfterChange", "getShouldUpdateAfterChange", "afterTextChanged", "", Constants.RequestParamsKeys.SESSION_ID_KEY, "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "isComplete", "wasCardNumberValid", "startPosition", "previousCount", "currentCount", "cardNumber", "onTextChanged", "before", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private final class CardNumberTextWatcher extends StripeTextWatcher {
        private CardNumber.Unvalidated beforeCardNumber;
        private String formattedNumber;
        private boolean isPastedPan;
        private int latestChangeStart;
        private int latestInsertionSize;
        private Integer newCursorPosition;

        public CardNumberTextWatcher() {
            this.beforeCardNumber = CardNumberEditText.this.getUnvalidatedCardNumber();
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            this.isPastedPan = false;
            this.beforeCardNumber = CardNumberEditText.this.getUnvalidatedCardNumber();
            this.latestChangeStart = start;
            this.latestInsertionSize = after;
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            int panLength$payments_core_release;
            String string2 = s != null ? s.toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            CardNumber.Unvalidated unvalidated = new CardNumber.Unvalidated(string2);
            CardNumberEditText.this.getAccountRangeService().onCardNumberChanged(unvalidated);
            boolean zIsPastedPan = isPastedPan(start, before, count, unvalidated);
            this.isPastedPan = zIsPastedPan;
            if (zIsPastedPan) {
                CardNumberEditText.this.updateLengthFilter$payments_core_release(unvalidated.getFormatted(unvalidated.getLength()).length());
            }
            if (this.isPastedPan) {
                panLength$payments_core_release = unvalidated.getLength();
            } else {
                panLength$payments_core_release = CardNumberEditText.this.getPanLength$payments_core_release();
            }
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            String formatted = unvalidated.getFormatted(panLength$payments_core_release);
            this.newCursorPosition = Integer.valueOf(cardNumberEditText.calculateCursorPosition$payments_core_release(formatted.length(), this.latestChangeStart, this.latestInsertionSize, panLength$payments_core_release));
            this.formattedNumber = formatted;
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (getShouldUpdateAfterChange()) {
                CardNumberEditText.this.setTextSilent$payments_core_release(this.formattedNumber);
                Integer num = this.newCursorPosition;
                if (num != null) {
                    CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                    cardNumberEditText.setSelection(RangesKt.coerceIn(num.intValue(), 0, cardNumberEditText.getFieldText$payments_core_release().length()));
                }
            }
            this.formattedNumber = null;
            this.newCursorPosition = null;
            if (CardNumberEditText.this.getUnvalidatedCardNumber().getLength() != CardNumberEditText.this.getPanLength$payments_core_release()) {
                if (CardNumberEditText.this.getUnvalidatedCardNumber().isPartialEntry(CardNumberEditText.this.getPanLength$payments_core_release()) && !CardNumberEditText.this.getUnvalidatedCardNumber().isPossibleCardBrand()) {
                    CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                    cardNumberEditText2.isCardNumberValid = cardNumberEditText2.isValid();
                    CardNumberEditText.this.setShouldShowError(true);
                    return;
                } else {
                    CardNumberEditText cardNumberEditText3 = CardNumberEditText.this;
                    cardNumberEditText3.isCardNumberValid = cardNumberEditText3.isValid();
                    CardNumberEditText.this.setShouldShowError(false);
                    return;
                }
            }
            boolean isCardNumberValid = CardNumberEditText.this.getIsCardNumberValid();
            CardNumberEditText cardNumberEditText4 = CardNumberEditText.this;
            cardNumberEditText4.isCardNumberValid = cardNumberEditText4.isValid();
            CardNumberEditText.this.setShouldShowError(!r0.isValid());
            if (CardNumberEditText.this.getAccountRangeService().getAccountRange() == null && CardNumberEditText.this.getUnvalidatedCardNumber().getIsValidLuhn()) {
                CardNumberEditText.this.onCardMetadataLoadedTooSlow$payments_core_release();
            }
            if (isComplete(isCardNumberValid)) {
                CardNumberEditText.this.getCompletionCallback$payments_core_release().invoke();
            }
        }

        private final boolean getShouldUpdateAfterChange() {
            return (getDigitsAdded() || !CardNumberEditText.this.getIsLastKeyDelete()) && this.formattedNumber != null;
        }

        private final boolean getDigitsAdded() {
            return CardNumberEditText.this.getUnvalidatedCardNumber().getLength() > this.beforeCardNumber.getLength();
        }

        private final boolean isComplete(boolean wasCardNumberValid) {
            if (wasCardNumberValid) {
                return false;
            }
            if (CardNumberEditText.this.getUnvalidatedCardNumber().getIsMaxLength()) {
                return true;
            }
            return CardNumberEditText.this.isValid() && CardNumberEditText.this.getAccountRangeService().getAccountRange() != null;
        }

        private final boolean isPastedPan(int startPosition, int previousCount, int currentCount, CardNumber.Unvalidated cardNumber) {
            return currentCount > previousCount && startPosition == 0 && cardNumber.getNormalized().length() >= 14;
        }
    }
}
