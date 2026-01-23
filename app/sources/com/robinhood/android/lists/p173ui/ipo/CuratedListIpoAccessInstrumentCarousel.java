package com.robinhood.android.lists.p173ui.ipo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.robinhood.android.carousel.InstrumentCard;
import com.robinhood.android.carousel.InstrumentCarousel;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.ipo.CuratedListIpoAccessInstrumentCard;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListIpoAccessInstrumentCarousel.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u0005:\u0002 !B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0016\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0002H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCarousel;", "Lcom/robinhood/android/carousel/InstrumentCarousel;", "Lcom/robinhood/models/ui/CuratedListEligible;", "Lcom/robinhood/utils/ui/view/Bindable;", "", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCard$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCarousel$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCarousel$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCarousel$Callbacks;)V", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Ljava/util/UUID;", "onAttachedToWindow", "", "bind", "state", "createInstrumentCard", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCard;", "cardButtonGroupTitle", "", "cardButtonTitle", "onIpoAccessInstrumentClicked", "curatedListEligible", "Callbacks", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CuratedListIpoAccessInstrumentCarousel extends InstrumentCarousel<CuratedListEligible> implements Bindable<List<? extends CuratedListEligible>>, CuratedListIpoAccessInstrumentCard.Callbacks {
    private Callbacks callbacks;
    private final VisibleItemsManager<UUID, CuratedListEligible> visibleItemsManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CuratedListIpoAccessInstrumentCarousel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCarousel$Callbacks;", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCard$Callbacks;", "onIpoAccessInstrumentAppear", "", "curatedListEligible", "Lcom/robinhood/models/ui/CuratedListEligible;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends CuratedListIpoAccessInstrumentCard.Callbacks {
        void onIpoAccessInstrumentAppear(CuratedListEligible curatedListEligible);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListIpoAccessInstrumentCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        this.visibleItemsManager = new VisibleItemsManager<>(layoutManager, new Function0() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCarousel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(CuratedListIpoAccessInstrumentCarousel.visibleItemsManager$lambda$0(this.f$0));
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCarousel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListIpoAccessInstrumentCarousel.visibleItemsManager$lambda$1(this.f$0, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCarousel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListIpoAccessInstrumentCarousel.visibleItemsManager$lambda$2((CuratedListEligible) obj);
            }
        });
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCarousel.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                CuratedListIpoAccessInstrumentCarousel.this.visibleItemsManager.update();
            }
        });
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int visibleItemsManager$lambda$0(CuratedListIpoAccessInstrumentCarousel curatedListIpoAccessInstrumentCarousel) {
        RecyclerView.Adapter adapter = curatedListIpoAccessInstrumentCarousel.getAdapter();
        if (adapter != null) {
            return adapter.getSize();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListEligible visibleItemsManager$lambda$1(CuratedListIpoAccessInstrumentCarousel curatedListIpoAccessInstrumentCarousel, int i) {
        return curatedListIpoAccessInstrumentCarousel.getItem(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID visibleItemsManager$lambda$2(CuratedListEligible VisibleItemsManager) {
        Intrinsics.checkNotNullParameter(VisibleItemsManager, "$this$VisibleItemsManager");
        return VisibleItemsManager.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(this.visibleItemsManager.getItemAppearances()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCarousel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListIpoAccessInstrumentCarousel.onAttachedToWindow$lambda$3(this.f$0, (CuratedListEligible) obj);
            }
        });
        ViewDisposerKt.bindTo$default(RxRecyclerView.scrollEvents(this), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCarousel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListIpoAccessInstrumentCarousel.onAttachedToWindow$lambda$4(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3(CuratedListIpoAccessInstrumentCarousel curatedListIpoAccessInstrumentCarousel, CuratedListEligible item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Callbacks callbacks = curatedListIpoAccessInstrumentCarousel.callbacks;
        if (callbacks != null) {
            callbacks.onIpoAccessInstrumentAppear(item);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(CuratedListIpoAccessInstrumentCarousel curatedListIpoAccessInstrumentCarousel, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        curatedListIpoAccessInstrumentCarousel.visibleItemsManager.update();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(List<? extends CuratedListEligible> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        bindItems(state);
    }

    @Override // com.robinhood.android.carousel.InstrumentCarousel
    public InstrumentCard<CuratedListEligible> createInstrumentCard(Context context, String cardButtonGroupTitle, String cardButtonTitle) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new CuratedListIpoAccessInstrumentCard(this, context, cardButtonGroupTitle, cardButtonTitle);
    }

    @Override // com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCard.Callbacks
    public void onIpoAccessInstrumentClicked(CuratedListEligible curatedListEligible) {
        Intrinsics.checkNotNullParameter(curatedListEligible, "curatedListEligible");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onIpoAccessInstrumentClicked(curatedListEligible);
        }
    }

    /* compiled from: CuratedListIpoAccessInstrumentCarousel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCarousel$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCarousel;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListIpoAccessInstrumentCarousel> {
        private final /* synthetic */ Inflater<CuratedListIpoAccessInstrumentCarousel> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListIpoAccessInstrumentCarousel inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListIpoAccessInstrumentCarousel) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_curated_list_ipo_access_instrument_carousel);
        }
    }
}
