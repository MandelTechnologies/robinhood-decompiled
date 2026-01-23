package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.os.PowerManager;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.gold.contracts.Level2MarketDataFragmentKey;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.api.ApiPricebook;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.Pricebook;
import com.robinhood.models.p355ui.Pricebook2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p408rx.Poll;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Level2Duxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2Duxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "powerManager", "Landroid/os/PowerManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Landroid/os/PowerManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "setDayNightStyle", ResourceTypes.STYLE, "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class Level2Duxo extends OldBaseDuxo<Level2ViewState> implements HasSavedState {
    private final Brokeback brokeback;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final PowerManager powerManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Level2Duxo(Brokeback brokeback, InstrumentStore instrumentStore, TraderMarketHoursManager marketHoursManager, PowerManager powerManager, SavedStateHandle savedStateHandle) {
        super(new Level2ViewState(null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.brokeback = brokeback;
        this.instrumentStore = instrumentStore;
        this.marketHoursManager = marketHoursManager;
        this.powerManager = powerManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.onResume$lambda$0(this.f$0, (Level2ViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.marketHoursManager.streamIsAdtHours(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.onResume$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentStore.getInstrument(((Level2MarketDataFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.onResume$lambda$4(this.f$0, (Instrument) obj);
            }
        });
        long j = this.powerManager.isPowerSaveMode() ? 5L : 1L;
        Single singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(this, null, new C155194(null), 1, null);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable observable = singleRxSingle$default.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable observableCompose = observable.compose(new Poll(j, timeUnit, false));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        Observable observableSubscribeOn = observableCompose.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo.onResume.5
            @Override // io.reactivex.functions.Function
            public final Pricebook apply(ApiPricebook it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Pricebook2.toUiModel(it);
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSubscribeOn, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.onResume$lambda$6(this.f$0, (Pricebook) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.onResume$lambda$8(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.onResume$lambda$9(this.f$0, (Level2ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Level2ViewState onResume$lambda$0(Level2Duxo level2Duxo, Level2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return Level2ViewState.copy$default(applyMutation, ((Level2MarketDataFragmentKey) INSTANCE.getArgs((HasSavedState) level2Duxo)).getAccountNumber(), null, false, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(Level2Duxo level2Duxo, final boolean z) {
        level2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.onResume$lambda$2$lambda$1(z, (Level2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Level2ViewState onResume$lambda$2$lambda$1(boolean z, Level2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return Level2ViewState.copy$default(applyMutation, null, null, z, null, null, null, null, 123, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(Level2Duxo level2Duxo, final Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        level2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.onResume$lambda$4$lambda$3(instrument, (Level2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Level2ViewState onResume$lambda$4$lambda$3(Instrument instrument, Level2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return Level2ViewState.copy$default(applyMutation, null, instrument, false, null, null, null, null, 125, null);
    }

    /* compiled from: Level2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiPricebook;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$onResume$4", m3645f = "Level2Duxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$onResume$4 */
    static final class C155194 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiPricebook>, Object> {
        int label;

        C155194(Continuation<? super C155194> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Level2Duxo.this.new C155194(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiPricebook> continuation) {
            return ((C155194) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Brokeback brokeback = Level2Duxo.this.brokeback;
            UUID instrumentId = ((Level2MarketDataFragmentKey) Level2Duxo.INSTANCE.getArgs((HasSavedState) Level2Duxo.this)).getInstrumentId();
            this.label = 1;
            Object pricebook = brokeback.getPricebook(instrumentId, this);
            return pricebook == coroutine_suspended ? coroutine_suspended : pricebook;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(Level2Duxo level2Duxo, final Pricebook pricebook) {
        level2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.onResume$lambda$6$lambda$5(pricebook, (Level2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Level2ViewState onResume$lambda$6$lambda$5(Pricebook pricebook, Level2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return Level2ViewState.copy$default(applyMutation, null, null, false, pricebook, null, null, null, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(Level2Duxo level2Duxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        level2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.onResume$lambda$8$lambda$7(t, (Level2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Level2ViewState onResume$lambda$8$lambda$7(Throwable th, Level2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return Level2ViewState.copy$default(applyMutation, null, null, false, null, null, new UiEvent(th), null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Level2ViewState onResume$lambda$9(Level2Duxo level2Duxo, Level2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return Level2ViewState.copy$default(applyMutation, null, null, false, null, level2Duxo.marketHoursManager.getCurrentMarketHours(), null, null, 111, null);
    }

    public final void setDayNightStyle(final DayNightOverlay style) {
        Intrinsics.checkNotNullParameter(style, "style");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2Duxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2Duxo.setDayNightStyle$lambda$10(style, (Level2ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Level2ViewState setDayNightStyle$lambda$10(DayNightOverlay dayNightOverlay, Level2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return Level2ViewState.copy$default(applyMutation, null, null, false, null, null, null, dayNightOverlay, 63, null);
    }

    /* compiled from: Level2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2Duxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2Duxo;", "Lcom/robinhood/android/gold/contracts/Level2MarketDataFragmentKey;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<Level2Duxo, Level2MarketDataFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Level2MarketDataFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (Level2MarketDataFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Level2MarketDataFragmentKey getArgs(Level2Duxo level2Duxo) {
            return (Level2MarketDataFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, level2Duxo);
        }
    }
}
