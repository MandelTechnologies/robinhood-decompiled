package com.robinhood.android.equitydetail.p123ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.util.Money;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.LocalDates;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: IpoQuoteGraphLayout.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/IpoQuoteGraphLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "estimatedPriceTxt", "Lcom/robinhood/android/common/view/AnimatedRhTextView;", "getEstimatedPriceTxt", "()Lcom/robinhood/android/common/view/AnimatedRhTextView;", "estimatedPriceTxt$delegate", "Lkotlin/Lazy;", "ipoDetailTxt", "Landroid/widget/TextView;", "getIpoDetailTxt", "()Landroid/widget/TextView;", "ipoDetailTxt$delegate", "setData", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "ipoQuote", "Lcom/robinhood/directipo/models/db/IpoQuote;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class IpoQuoteGraphLayout extends Hammer_IpoQuoteGraphLayout {

    /* renamed from: estimatedPriceTxt$delegate, reason: from kotlin metadata */
    private final Lazy estimatedPriceTxt;

    /* renamed from: ipoDetailTxt$delegate, reason: from kotlin metadata */
    private final Lazy ipoDetailTxt;
    public Navigator navigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoQuoteGraphLayout(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.estimatedPriceTxt = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equitydetail.ui.IpoQuoteGraphLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IpoQuoteGraphLayout.estimatedPriceTxt_delegate$lambda$0(this.f$0);
            }
        });
        this.ipoDetailTxt = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equitydetail.ui.IpoQuoteGraphLayout$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IpoQuoteGraphLayout.ipoDetailTxt_delegate$lambda$1(this.f$0);
            }
        });
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimatedRhTextView estimatedPriceTxt_delegate$lambda$0(IpoQuoteGraphLayout ipoQuoteGraphLayout) {
        return (AnimatedRhTextView) ipoQuoteGraphLayout.findViewById(C15314R.id.ipo_estimated_price_txt);
    }

    private final AnimatedRhTextView getEstimatedPriceTxt() {
        Object value = this.estimatedPriceTxt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AnimatedRhTextView) value;
    }

    private final TextView getIpoDetailTxt() {
        Object value = this.ipoDetailTxt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView ipoDetailTxt_delegate$lambda$1(IpoQuoteGraphLayout ipoQuoteGraphLayout) {
        return (TextView) ipoQuoteGraphLayout.findViewById(C15314R.id.ipo_detail_txt);
    }

    public final void setData(Instrument instrument, IpoQuote ipoQuote) throws Resources.NotFoundException {
        String string2;
        int i;
        Intrinsics.checkNotNullParameter(ipoQuote, "ipoQuote");
        AnimatedRhTextView estimatedPriceTxt = getEstimatedPriceTxt();
        Money estimatedPrice = ipoQuote.getEstimatedPrice();
        if (estimatedPrice == null || (string2 = Money.format$default(estimatedPrice, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            string2 = getResources().getString(C41827R.string.general_label_n_a);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        estimatedPriceTxt.setText(string2);
        DefaultConstructorMarker defaultConstructorMarker = null;
        LocalDate listDate = instrument != null ? instrument.getListDate() : null;
        int i2 = 1;
        if (Intrinsics.areEqual(LocalDates.currentDateInEst$default(null, 1, null), listDate)) {
            i = C15314R.string.graph_pre_ipo_list_day_detail;
        } else {
            i = C15314R.string.graph_pre_ipo_detail;
        }
        String string3 = getResources().getString(i, instrument != null ? instrument.getSymbol() : null, listDate);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        TextViewsKt.setTextWithLearnMore(getIpoDetailTxt(), (CharSequence) string3, false, false, (String) null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.equitydetail.ui.IpoQuoteGraphLayout$setData$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Resources.NotFoundException {
                String string4 = this.this$0.getResources().getString(C15314R.string.url_ipo_faq);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                Navigator navigator = this.this$0.getNavigator();
                Context context = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, context, string4);
            }
        }, i2, defaultConstructorMarker));
    }

    /* compiled from: IpoQuoteGraphLayout.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/IpoQuoteGraphLayout$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/IpoQuoteGraphLayout;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<IpoQuoteGraphLayout> {
        private final /* synthetic */ Inflater<IpoQuoteGraphLayout> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public IpoQuoteGraphLayout inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (IpoQuoteGraphLayout) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_ipo_quote_graph_layout);
        }
    }
}
