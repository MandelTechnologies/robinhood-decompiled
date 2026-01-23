package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoUpgradeDisclosureComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$7$1", m3645f = "CryptoUpgradeDisclosureComposable.kt", m3646l = {103}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$7$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoUpgradeDisclosureComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoUpgradeDisclosureDuxo $duxo;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ SnapshotState4<CryptoUpgradeDisclosureViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoUpgradeDisclosureComposable3(ScrollState scrollState, CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, SnapshotState4<CryptoUpgradeDisclosureViewState> snapshotState4, Continuation<? super CryptoUpgradeDisclosureComposable3> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$duxo = cryptoUpgradeDisclosureDuxo;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoUpgradeDisclosureComposable3(this.$scrollState, this.$duxo, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoUpgradeDisclosureComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ScrollState scrollState = this.$scrollState;
            final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$7$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(CryptoUpgradeDisclosureComposable3.invokeSuspend$lambda$0(scrollState));
                }
            }));
            Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$7$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$7$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$7$1$invokeSuspend$$inlined$filter$1$2", m3645f = "CryptoUpgradeDisclosureComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$7$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            if (((Boolean) obj).booleanValue()) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            final CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo = this.$duxo;
            final SnapshotState4<CryptoUpgradeDisclosureViewState> snapshotState4 = this.$viewState$delegate;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$7$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState = CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$6(snapshotState4).getCryptoUpgradeDisclosureContentState();
                    List contents = cryptoUpgradeDisclosureContentState != null ? cryptoUpgradeDisclosureContentState.getContents() : null;
                    if (contents == null) {
                        contents = CollectionsKt.emptyList();
                    }
                    if (!contents.isEmpty()) {
                        cryptoUpgradeDisclosureDuxo.onScrolledToBottom();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(ScrollState scrollState) {
        return scrollState.getValue() >= scrollState.getMaxValue();
    }
}
