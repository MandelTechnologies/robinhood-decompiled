package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.MergeSimilarInstrumentsBinding;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView;
import com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent;
import com.robinhood.android.equitydetail.p123ui.carousel.EquityInstrumentCard;
import com.robinhood.android.equitydetail.p123ui.carousel.EquityInstrumentCarousel;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SimilarInstrumentsView.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001'B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0#J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView;", "Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "analyticsCallbacks", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "getAnalyticsCallbacks", "()Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "setAnalyticsCallbacks", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;)V", "binding", "Lcom/robinhood/android/equitydetail/databinding/MergeSimilarInstrumentsBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/MergeSimilarInstrumentsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttachedToWindow", "", "onEquityInstrumentClicked", "instrumentId", "Ljava/util/UUID;", "bind", "instrument", "Lcom/robinhood/models/db/Instrument;", "similarInstrumentIds", "", "setRecycledViewPool", "recycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SimilarInstrumentsView extends LinearLayout implements LoggableSdpView, EquityInstrumentCard.Callbacks {
    private LoggableSdpView.Callbacks analyticsCallbacks;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final Component.ComponentType componentType;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SimilarInstrumentsView.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/MergeSimilarInstrumentsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewAttachedToWindow(this, view);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewDetachedFromWindow(this, view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarInstrumentsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.componentType = Component.ComponentType.PEOPLE_ALSO_VIEW_SECTION;
        this.binding = ViewBinding5.viewBinding(this, SimilarInstrumentsView2.INSTANCE);
        setOrientation(1);
        ViewGroups.inflate(this, C15314R.layout.merge_similar_instruments, true);
        EquityInstrumentCarousel equityInstrumentCarousel = getBinding().instrumentCarousel;
        equityInstrumentCarousel.setCardButtonGroupTitle(AnalyticsStrings.BUTTON_GROUP_STOCK_DETAIL_ACTIONS);
        equityInstrumentCarousel.setCardButtonTitle(AnalyticsStrings.BUTTON_TITLE_PEOPLE_ALSO_BOUGHT);
        equityInstrumentCarousel.setCallbacks(this);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public Component.ComponentType getComponentType() {
        return this.componentType;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public LoggableSdpView.Callbacks getAnalyticsCallbacks() {
        return this.analyticsCallbacks;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public void setAnalyticsCallbacks(LoggableSdpView.Callbacks callbacks) {
        this.analyticsCallbacks = callbacks;
    }

    private final MergeSimilarInstrumentsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeSimilarInstrumentsBinding) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        EquityInstrumentCarousel instrumentCarousel = getBinding().instrumentCarousel;
        Intrinsics.checkNotNullExpressionValue(instrumentCarousel, "instrumentCarousel");
        Observable<Integer> observableFilter = RxRecyclerView.scrollStateChanges(instrumentCarousel).filter(new Predicate() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsView.onAttachedToWindow.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.intValue() == 1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        ViewDisposerKt.bindTo$default(observableFilter, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SimilarInstrumentsView.onAttachedToWindow$lambda$1(this.f$0, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(SimilarInstrumentsView similarInstrumentsView, Integer num) {
        LoggableSdpView.Callbacks analyticsCallbacks = similarInstrumentsView.getAnalyticsCallbacks();
        if (analyticsCallbacks != null) {
            analyticsCallbacks.logEvent(new SdpEvent.Swipe(similarInstrumentsView.getComponentType()));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.equitydetail.ui.carousel.EquityInstrumentCard.Callbacks
    public void onEquityInstrumentClicked(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        LoggableSdpView.Callbacks analyticsCallbacks = getAnalyticsCallbacks();
        if (analyticsCallbacks != null) {
            String string2 = instrumentId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            analyticsCallbacks.logEvent(new SdpEvent.SimilarInstrumentSelected(string2));
        }
    }

    public final void bind(Instrument instrument, List<UUID> similarInstrumentIds) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(similarInstrumentIds, "similarInstrumentIds");
        getBinding().similarInstrumentDescription.setText(getResources().getString(C15314R.string.instrument_detail_similar_instruments_description, instrument.getSymbol()));
        getBinding().instrumentCarousel.bindItems(similarInstrumentIds);
    }

    public final void setRecycledViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        getBinding().instrumentCarousel.setRecycledViewPool(recycledViewPool);
    }

    /* compiled from: SimilarInstrumentsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SimilarInstrumentsView> {
        private final /* synthetic */ Inflater<SimilarInstrumentsView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SimilarInstrumentsView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SimilarInstrumentsView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_similar_instruments);
        }
    }
}
