package com.robinhood.android.acatsin.availabledestinations;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsContract;
import com.robinhood.android.acatsin.store.AcatsInActivityStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore;
import com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAvailableDestinationsDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0012J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDataState;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsBrokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "acatsInActivityStore", "Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onOptionSelected", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "onReload", "handleError", "error", "", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInAvailableDestinationsDuxo extends BaseDuxo<AcatsInAvailableDestinationsDataState, AcatsInAvailableDestinationsViewState> implements HasSavedState {
    private final AcatsBrokerageStore acatsBrokerageStore;
    private final AcatsInActivityStore acatsInActivityStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInAvailableDestinationsDuxo(AcatsBrokerageStore acatsBrokerageStore, AcatsInActivityStore acatsInActivityStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new AcatsInAvailableDestinationsDataState(((AcatsInAvailableDestinationsContract.Key) INSTANCE.getArgs(savedStateHandle)).isAcatsRetry(), null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), new AcatsInAvailableDestinationsStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(acatsBrokerageStore, "acatsBrokerageStore");
        Intrinsics.checkNotNullParameter(acatsInActivityStore, "acatsInActivityStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsBrokerageStore = acatsBrokerageStore;
        this.acatsInActivityStore = acatsInActivityStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.acatsBrokerageStore.getAvailableDestinationsPage(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInAvailableDestinationsDuxo.onStart$lambda$0(this.f$0, (ApiAvailableDestinationsResponse) obj);
            }
        }, new C78042(this), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(AcatsInAvailableDestinationsDuxo acatsInAvailableDestinationsDuxo, ApiAvailableDestinationsResponse availableAccountsPage) {
        Intrinsics.checkNotNullParameter(availableAccountsPage, "availableAccountsPage");
        acatsInAvailableDestinationsDuxo.applyMutation(new AcatsInAvailableDestinationsDuxo2(availableAccountsPage, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInAvailableDestinationsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$onStart$2 */
    /* synthetic */ class C78042 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C78042(Object obj) {
            super(1, obj, AcatsInAvailableDestinationsDuxo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AcatsInAvailableDestinationsDuxo) this.receiver).handleError(p0);
        }
    }

    /* compiled from: AcatsInAvailableDestinationsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$onOptionSelected$1", m3645f = "AcatsInAvailableDestinationsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$onOptionSelected$1 */
    static final class C78011 extends ContinuationImpl7 implements Function2<AcatsInAvailableDestinationsDataState, Continuation<? super AcatsInAvailableDestinationsDataState>, Object> {
        final /* synthetic */ AcatsDestination $option;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C78011(AcatsDestination acatsDestination, Continuation<? super C78011> continuation) {
            super(2, continuation);
            this.$option = acatsDestination;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C78011 c78011 = new C78011(this.$option, continuation);
            c78011.L$0 = obj;
            return c78011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInAvailableDestinationsDataState acatsInAvailableDestinationsDataState, Continuation<? super AcatsInAvailableDestinationsDataState> continuation) {
            return ((C78011) create(acatsInAvailableDestinationsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInAvailableDestinationsDataState.copy$default((AcatsInAvailableDestinationsDataState) this.L$0, false, null, null, null, this.$option, null, null, null, 239, null);
        }
    }

    public final void onOptionSelected(AcatsDestination option) {
        Intrinsics.checkNotNullParameter(option, "option");
        applyMutation(new C78011(option, null));
    }

    /* compiled from: AcatsInAvailableDestinationsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$onReload$1", m3645f = "AcatsInAvailableDestinationsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$onReload$1 */
    static final class C78021 extends ContinuationImpl7 implements Function2<AcatsInAvailableDestinationsDataState, Continuation<? super AcatsInAvailableDestinationsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C78021(Continuation<? super C78021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C78021 c78021 = new C78021(continuation);
            c78021.L$0 = obj;
            return c78021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInAvailableDestinationsDataState acatsInAvailableDestinationsDataState, Continuation<? super AcatsInAvailableDestinationsDataState> continuation) {
            return ((C78021) create(acatsInAvailableDestinationsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInAvailableDestinationsDataState.copy$default((AcatsInAvailableDestinationsDataState) this.L$0, false, CollectionsKt.emptyList(), null, null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, null);
        }
    }

    public final void onReload() {
        applyMutation(new C78021(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.acatsInActivityStore.refreshAvailableDestinations(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new C78033(this));
    }

    /* compiled from: AcatsInAvailableDestinationsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$onReload$3 */
    /* synthetic */ class C78033 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C78033(Object obj) {
            super(1, obj, AcatsInAvailableDestinationsDuxo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AcatsInAvailableDestinationsDuxo) this.receiver).handleError(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable error) throws Throwable {
        if (Throwables.isNetworkRelated(error)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, error, false, null, 4, null);
            applyMutation(new C78001(error, null));
            return;
        }
        throw error;
    }

    /* compiled from: AcatsInAvailableDestinationsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$handleError$1", m3645f = "AcatsInAvailableDestinationsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsDuxo$handleError$1 */
    static final class C78001 extends ContinuationImpl7 implements Function2<AcatsInAvailableDestinationsDataState, Continuation<? super AcatsInAvailableDestinationsDataState>, Object> {
        final /* synthetic */ Throwable $error;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C78001(Throwable th, Continuation<? super C78001> continuation) {
            super(2, continuation);
            this.$error = th;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C78001 c78001 = new C78001(this.$error, continuation);
            c78001.L$0 = obj;
            return c78001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInAvailableDestinationsDataState acatsInAvailableDestinationsDataState, Continuation<? super AcatsInAvailableDestinationsDataState> continuation) {
            return ((C78001) create(acatsInAvailableDestinationsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInAvailableDestinationsDataState.copy$default((AcatsInAvailableDestinationsDataState) this.L$0, false, null, null, null, null, null, null, this.$error, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
    }

    /* compiled from: AcatsInAvailableDestinationsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDuxo;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Key;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInAvailableDestinationsDuxo, AcatsInAvailableDestinationsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInAvailableDestinationsContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInAvailableDestinationsContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInAvailableDestinationsContract.Key getArgs(AcatsInAvailableDestinationsDuxo acatsInAvailableDestinationsDuxo) {
            return (AcatsInAvailableDestinationsContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInAvailableDestinationsDuxo);
        }
    }
}
