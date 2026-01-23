package com.robinhood.android.equityscreener.crud.saveOptions;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equities.contracts.screeners.SaveScreenerOptionsContract;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.equityscreener.models.LocalScreenerMetadata;
import com.robinhood.equityscreener.models.SaveScreenerResult;
import com.robinhood.equityscreener.models.ScreenerLoggingKeys;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityScreenerContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SaveScreenerOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsDataState;", "Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsStateProvider;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onSave", "", "onSaveAs", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SaveScreenerOptionsDuxo extends BaseDuxo<SaveScreenerOptionsDataState, SaveScreenerOptionsViewState> implements HasSavedState {
    private final EventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;
    private final ScreenersStore screenersStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveScreenerOptionsDuxo(SavedStateHandle savedStateHandle, ScreenersStore screenersStore, EventLogger eventLogger, DuxoBundle duxoBundle, SaveScreenerOptionsViewState2 stateProvider) {
        super(new SaveScreenerOptionsDataState(false, false, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.savedStateHandle = savedStateHandle;
        this.screenersStore = screenersStore;
        this.eventLogger = eventLogger;
    }

    /* compiled from: SaveScreenerOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsDuxo;", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerOptionsContract$Key;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SaveScreenerOptionsDuxo, SaveScreenerOptionsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SaveScreenerOptionsContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (SaveScreenerOptionsContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SaveScreenerOptionsContract.Key getArgs(SaveScreenerOptionsDuxo saveScreenerOptionsDuxo) {
            return (SaveScreenerOptionsContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, saveScreenerOptionsDuxo);
        }
    }

    /* compiled from: SaveScreenerOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsDuxo$onSave$1", m3645f = "SaveScreenerOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsDuxo$onSave$1 */
    static final class C156791 extends ContinuationImpl7 implements Function2<SaveScreenerOptionsDataState, Continuation<? super SaveScreenerOptionsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C156791(Continuation<? super C156791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C156791 c156791 = new C156791(continuation);
            c156791.L$0 = obj;
            return c156791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaveScreenerOptionsDataState saveScreenerOptionsDataState, Continuation<? super SaveScreenerOptionsDataState> continuation) {
            return ((C156791) create(saveScreenerOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SaveScreenerOptionsDataState.copy$default((SaveScreenerOptionsDataState) this.L$0, true, false, 2, null);
        }
    }

    public final void onSave() {
        applyMutation(new C156791(null));
        ScreenersStore screenersStore = this.screenersStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, ScreenersStore.saveScreener$default(screenersStore, ((SaveScreenerOptionsContract.Key) companion.getArgs((HasSavedState) this)).getScreenerId(), false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SaveScreenerOptionsDuxo.onSave$lambda$0(this.f$0, (SaveScreenerResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SaveScreenerOptionsDuxo.onSave$lambda$1(this.f$0, (Throwable) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.screenersStore.getLocalScreener(((SaveScreenerOptionsContract.Key) companion.getArgs((HasSavedState) this)).getScreenerId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SaveScreenerOptionsDuxo.onSave$lambda$3(this.f$0, (LocalScreenerMetadata) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSave$lambda$0(SaveScreenerOptionsDuxo saveScreenerOptionsDuxo, SaveScreenerResult saveResult) {
        Intrinsics.checkNotNullParameter(saveResult, "saveResult");
        saveScreenerOptionsDuxo.applyMutation(new SaveScreenerOptionsDuxo2(saveResult, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSave$lambda$1(SaveScreenerOptionsDuxo saveScreenerOptionsDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        saveScreenerOptionsDuxo.applyMutation(new SaveScreenerOptionsDuxo3(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSave$lambda$3(SaveScreenerOptionsDuxo saveScreenerOptionsDuxo, LocalScreenerMetadata localScreenerData) {
        Intrinsics.checkNotNullParameter(localScreenerData, "localScreenerData");
        Screener screener = localScreenerData.getScreener();
        EventLogger eventLogger = saveScreenerOptionsDuxo.eventLogger;
        Component component = new Component(Component.ComponentType.BUTTON, ScreenerLoggingKeys.SAVE_SCREENER_CURRENT, null, 4, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SAVE;
        String displayName = screener.getDisplayName();
        List<Screener.Filter> filters = screener.getFilters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList.add(((Screener.Filter) it.next()).getKey());
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, null, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EquityScreenerContext(displayName, arrayList, screener.getColumns(), null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -16777217, -1, -1, 16383, null), false, 42, null);
        return Unit.INSTANCE;
    }

    public final void onSaveAs() {
        LifecycleHost.DefaultImpls.bind$default(this, this.screenersStore.getLocalScreener(((SaveScreenerOptionsContract.Key) INSTANCE.getArgs((HasSavedState) this)).getScreenerId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SaveScreenerOptionsDuxo.onSaveAs$lambda$5(this.f$0, (LocalScreenerMetadata) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSaveAs$lambda$5(SaveScreenerOptionsDuxo saveScreenerOptionsDuxo, LocalScreenerMetadata localScreenerData) {
        Intrinsics.checkNotNullParameter(localScreenerData, "localScreenerData");
        Screener screener = localScreenerData.getScreener();
        EventLogger eventLogger = saveScreenerOptionsDuxo.eventLogger;
        Component component = new Component(Component.ComponentType.BUTTON, ScreenerLoggingKeys.SAVE_SCREENER_NEW_SELECTION, null, 4, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        String displayName = screener.getDisplayName();
        List<Screener.Filter> filters = screener.getFilters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList.add(((Screener.Filter) it.next()).getKey());
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, null, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EquityScreenerContext(displayName, arrayList, screener.getColumns(), null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -16777217, -1, -1, 16383, null), false, 42, null);
        return Unit.INSTANCE;
    }
}
