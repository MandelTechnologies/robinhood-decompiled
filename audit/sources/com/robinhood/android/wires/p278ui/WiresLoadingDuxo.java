package com.robinhood.android.wires.p278ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.contracts.Wires;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.wires.p278ui.WiresLoadingEvent;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireContent;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireDetailsContent;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireDetailsResponse;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.rosetta.eventlogging.WiresContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WiresLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/wires/ui/WiresLoadingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "Companion", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class WiresLoadingDuxo extends BaseDuxo5<Unit, WiresLoadingEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WiresLoadingDuxo(TransfersBonfireApi transfersBonfireApi, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C315201(null), 3, null);
    }

    /* compiled from: WiresLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.WiresLoadingDuxo$onCreate$1", m3645f = "WiresLoadingDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.WiresLoadingDuxo$onCreate$1 */
    static final class C315201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: WiresLoadingDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.wires.ui.WiresLoadingDuxo$onCreate$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WiresContext.WiresDirection.values().length];
                try {
                    iArr[WiresContext.WiresDirection.INCOMING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WiresContext.WiresDirection.OUTGOING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C315201(Continuation<? super C315201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WiresLoadingDuxo.this.new C315201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C315201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            WiresLoadingEvent preselectionSpecified;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TransfersBonfireApi transfersBonfireApi = WiresLoadingDuxo.this.transfersBonfireApi;
                    RhEntity rhEntity = RhEntity.RHS;
                    this.label = 1;
                    obj = transfersBonfireApi.getWireDetails(rhEntity, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiWireDetailsResponse apiWireDetailsResponse = (ApiWireDetailsResponse) obj;
                ApiWireDetailsContent content = apiWireDetailsResponse.getContent();
                WiresContext.WiresDirection direction = ((Wires) WiresLoadingDuxo.INSTANCE.getArgs((HasSavedState) WiresLoadingDuxo.this)).getDirection();
                WiresLoadingDuxo wiresLoadingDuxo = WiresLoadingDuxo.this;
                if (content instanceof ApiWireDetailsContent.InvalidAccountContent) {
                    preselectionSpecified = new WiresLoadingEvent.NoBrokerageAccount(apiWireDetailsResponse.getUser_state(), (ApiWireDetailsContent.InvalidAccountContent) content);
                } else if (content instanceof ApiWireDetailsContent.WireDetailsContent) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
                    if (i2 == 1) {
                        preselectionSpecified = new WiresLoadingEvent.PreselectionSpecified((ApiWireDetailsContent.WireDetailsContent) content);
                    } else if (i2 == 2) {
                        ApiOutgoingWireContent outgoing_wire = ((ApiWireDetailsContent.WireDetailsContent) content).getOutgoing_wire();
                        if ((outgoing_wire != null ? outgoing_wire.getDetails() : null) != null) {
                            preselectionSpecified = new WiresLoadingEvent.PreselectionSpecified((ApiWireDetailsContent.WireDetailsContent) content);
                        } else {
                            preselectionSpecified = new WiresLoadingEvent.Selection((ApiWireDetailsContent.WireDetailsContent) content);
                        }
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        preselectionSpecified = new WiresLoadingEvent.Selection((ApiWireDetailsContent.WireDetailsContent) content);
                    }
                } else {
                    if (content instanceof ApiWireDetailsContent.Unknown) {
                        throw new IllegalStateException("Unknown content!");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                wiresLoadingDuxo.submit(preselectionSpecified);
            } catch (Throwable th) {
                WiresLoadingDuxo.this.submit(new WiresLoadingEvent.Error(th));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: WiresLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/wires/ui/WiresLoadingDuxo;", "Lcom/robinhood/android/transfers/contracts/Wires;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<WiresLoadingDuxo, Wires> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Wires getArgs(SavedStateHandle savedStateHandle) {
            return (Wires) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Wires getArgs(WiresLoadingDuxo wiresLoadingDuxo) {
            return (Wires) DuxoCompanion.DefaultImpls.getArgs(this, wiresLoadingDuxo);
        }
    }
}
