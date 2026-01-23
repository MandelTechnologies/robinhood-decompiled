package com.robinhood.android.options.lib.simulatedreturn.info;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.options.contracts.OptionsSimulatedReturnInfoFragmentKey;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.staticcontent.model.OtherMarkdown;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: OptionsSimulatedReturnInfoDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/info/OptionsSimulatedReturnInfoDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/options/lib/simulatedreturn/info/OptionsSimulatedReturnInfoViewState;", "Lcom/robinhood/android/options/lib/simulatedreturn/info/OptionsSimulatedReturnInfoErrorEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnInfoDuxo extends BaseDuxo5<OptionsSimulatedReturnInfoViewState, OptionsSimulatedReturnInfoErrorEvent> implements HasSavedState {
    private final BrokerageResourceManager brokerageResourceManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsSimulatedReturnInfoDuxo(BrokerageResourceManager brokerageResourceManager, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new OptionsSimulatedReturnInfoViewState(null, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.brokerageResourceManager = brokerageResourceManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C233071(null), 3, null);
    }

    /* compiled from: OptionsSimulatedReturnInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.info.OptionsSimulatedReturnInfoDuxo$onCreate$1", m3645f = "OptionsSimulatedReturnInfoDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.info.OptionsSimulatedReturnInfoDuxo$onCreate$1 */
    static final class C233071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C233071(Continuation<? super C233071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnInfoDuxo.this.new C233071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            OptionsSimulatedReturnsContentful optionsSimulatedReturnsContentful;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((OptionsSimulatedReturnInfoFragmentKey) OptionsSimulatedReturnInfoDuxo.INSTANCE.getArgs((HasSavedState) OptionsSimulatedReturnInfoDuxo.this)).isPreTrade()) {
                        optionsSimulatedReturnsContentful = OptionsSimulatedReturnsContentful.PRE_TRADE_CONTENTFUL_ID;
                    } else {
                        optionsSimulatedReturnsContentful = OptionsSimulatedReturnsContentful.INFO_CONTENTFUL_ID;
                    }
                    Single singleLoadResource = OptionsSimulatedReturnInfoDuxo.this.brokerageResourceManager.loadResource(optionsSimulatedReturnsContentful);
                    this.label = 1;
                    obj = RxAwait3.await(singleLoadResource, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                OptionsSimulatedReturnInfoDuxo.this.applyMutation(new AnonymousClass1((OtherMarkdown) obj, null));
            } catch (Throwable th) {
                OptionsSimulatedReturnInfoDuxo.this.submit(new OptionsSimulatedReturnInfoErrorEvent(th));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsSimulatedReturnInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/info/OptionsSimulatedReturnInfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.info.OptionsSimulatedReturnInfoDuxo$onCreate$1$1", m3645f = "OptionsSimulatedReturnInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.info.OptionsSimulatedReturnInfoDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnInfoViewState, Continuation<? super OptionsSimulatedReturnInfoViewState>, Object> {
            final /* synthetic */ OtherMarkdown $entry;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OtherMarkdown otherMarkdown, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$entry = otherMarkdown;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$entry, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnInfoViewState optionsSimulatedReturnInfoViewState, Continuation<? super OptionsSimulatedReturnInfoViewState> continuation) {
                return ((AnonymousClass1) create(optionsSimulatedReturnInfoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((OptionsSimulatedReturnInfoViewState) this.L$0).copy(this.$entry.getTitle(), this.$entry.getMarkdown2());
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/info/OptionsSimulatedReturnInfoDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/lib/simulatedreturn/info/OptionsSimulatedReturnInfoDuxo;", "Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnInfoFragmentKey;", "<init>", "()V", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionsSimulatedReturnInfoDuxo, OptionsSimulatedReturnInfoFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionsSimulatedReturnInfoFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (OptionsSimulatedReturnInfoFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionsSimulatedReturnInfoFragmentKey getArgs(OptionsSimulatedReturnInfoDuxo optionsSimulatedReturnInfoDuxo) {
            return (OptionsSimulatedReturnInfoFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionsSimulatedReturnInfoDuxo);
        }
    }
}
