package com.robinhood.shared.crypto.trading.bottomsheet;

import android.content.Context;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.ScreenDto;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.moshi.LazyMoshi;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.CryptoTradingBottomSheetDynamicDataService;
import contracts.crypto.trade.proto.p431v1.LaunchBottomSheetRequestDto;
import contracts.crypto.trade.proto.p431v1.SourceDto;
import contracts.crypto.trade.proto.p431v1.StreamBottomSheetDynamicDataRequestDto;
import contracts.crypto.trade.proto.p431v1.StreamBottomSheetDynamicDataResponseDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.service.ManagedServiceExtension2;

/* compiled from: CryptoTradingBottomSheetService.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u001bJ\"\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lkotlinx/coroutines/CoroutineScope;)V", "bottomSheetService", "Lcontracts/crypto/trade/proto/v1/CryptoTradingBottomSheetService;", "dialogStateFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "bottomSheetFlow", "", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "emitBottomSheetData", "", "dtos", "Lkotlinx/collections/immutable/ImmutableList;", "streamLaunchDialog", "Lkotlinx/coroutines/flow/Flow;", "launchBottomSheet", "bottomSheetType", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "source", "Lcontracts/crypto/trade/proto/v1/SourceDto;", "lib-trading-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTradingBottomSheetService {
    private final SharedFlow2<List<BottomSheetTypeDto>> bottomSheetFlow;
    private final contracts.crypto.trade.proto.p431v1.CryptoTradingBottomSheetService bottomSheetService;
    private final SharedFlow2<DialogFragmentKey> dialogStateFlow;
    private final CoroutineScope microgramCoroutineScope;

    public CryptoTradingBottomSheetService(Context context, Navigator navigator, MicrogramManager microgramManager, LazyMoshi moshi, @RootCoroutineScope CoroutineScope microgramCoroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.bottomSheetService = (contracts.crypto.trade.proto.p431v1.CryptoTradingBottomSheetService) RealMicrogramUiLaunchService2.getComponentWithUiLaunch(microgramManager, new RemoteMicrogramApplication("app-crypto-trading-bottom-sheets", null, 2, null), microgramCoroutineScope, moshi, MapsKt.mapOf(RealMicrogramDeeplinkService.INSTANCE.getExtension(context, navigator), ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(CryptoTradingBottomSheetDynamicDataService.class), new CryptoTradingBottomSheetDynamicDataService() { // from class: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$1
            public Flow<Response<StreamBottomSheetDynamicDataResponseDto>> StreamBottomSheetDynamicData(Request<StreamBottomSheetDynamicDataRequestDto> request) {
                return CryptoTradingBottomSheetDynamicDataService.DefaultImpls.StreamBottomSheetDynamicData(this, request);
            }

            @Override // contracts.crypto.trade.proto.p431v1.CryptoTradingBottomSheetDynamicDataService
            public Flow<StreamBottomSheetDynamicDataResponseDto> StreamBottomSheetDynamicData(final StreamBottomSheetDynamicDataRequestDto request) {
                Intrinsics.checkNotNullParameter(request, "request");
                final SharedFlow2 sharedFlow2 = this.this$0.bottomSheetFlow;
                final Flow<BottomSheetTypeDto> flow = new Flow<BottomSheetTypeDto>() { // from class: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$1$StreamBottomSheetDynamicData$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super BottomSheetTypeDto> flowCollector, Continuation continuation) {
                        Object objCollect = sharedFlow2.collect(new AnonymousClass2(flowCollector, request), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$1$StreamBottomSheetDynamicData$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ StreamBottomSheetDynamicDataRequestDto $request$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$1$StreamBottomSheetDynamicData$$inlined$mapNotNull$1$2", m3645f = "CryptoTradingBottomSheetService.kt", m3646l = {74}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$1$StreamBottomSheetDynamicData$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
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

                        public AnonymousClass2(FlowCollector flowCollector, StreamBottomSheetDynamicDataRequestDto streamBottomSheetDynamicDataRequestDto) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$request$inlined = streamBottomSheetDynamicDataRequestDto;
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
                                List list = (List) obj;
                                BottomSheetTypeDto bottom_sheet_type = this.$request$inlined.getBottom_sheet_type();
                                BottomSheetTypeDto bottomSheetTypeDto = null;
                                BottomSheetTypeDto.TypeDto type2 = bottom_sheet_type != null ? bottom_sheet_type.getType() : null;
                                if (type2 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                if (type2 instanceof BottomSheetTypeDto.TypeDto.Spread) {
                                    Iterator<T> it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        T next = it.next();
                                        if (((BottomSheetTypeDto) next).getType() instanceof BottomSheetTypeDto.TypeDto.Spread) {
                                            bottomSheetTypeDto = next;
                                            break;
                                        }
                                    }
                                    bottomSheetTypeDto = bottomSheetTypeDto;
                                } else if (type2 instanceof BottomSheetTypeDto.TypeDto.LimitOrderDefinition) {
                                    Iterator<T> it2 = list.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        T next2 = it2.next();
                                        if (((BottomSheetTypeDto) next2).getType() instanceof BottomSheetTypeDto.TypeDto.LimitOrderDefinition) {
                                            bottomSheetTypeDto = next2;
                                            break;
                                        }
                                    }
                                    bottomSheetTypeDto = bottomSheetTypeDto;
                                } else if (type2 instanceof BottomSheetTypeDto.TypeDto.TokenizationFxFee) {
                                    Iterator<T> it3 = list.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        T next3 = it3.next();
                                        if (((BottomSheetTypeDto) next3).getType() instanceof BottomSheetTypeDto.TypeDto.TokenizationFxFee) {
                                            bottomSheetTypeDto = next3;
                                            break;
                                        }
                                    }
                                    bottomSheetTypeDto = bottomSheetTypeDto;
                                } else if (type2 instanceof BottomSheetTypeDto.TypeDto.TokenizationEstimatedPrice) {
                                    Iterator<T> it4 = list.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        T next4 = it4.next();
                                        if (((BottomSheetTypeDto) next4).getType() instanceof BottomSheetTypeDto.TypeDto.TokenizationEstimatedPrice) {
                                            bottomSheetTypeDto = next4;
                                            break;
                                        }
                                    }
                                    bottomSheetTypeDto = bottomSheetTypeDto;
                                } else if (type2 instanceof BottomSheetTypeDto.TypeDto.TokenizationEstimatedTotalCost) {
                                    Iterator<T> it5 = list.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            break;
                                        }
                                        T next5 = it5.next();
                                        if (((BottomSheetTypeDto) next5).getType() instanceof BottomSheetTypeDto.TypeDto.TokenizationEstimatedTotalCost) {
                                            bottomSheetTypeDto = next5;
                                            break;
                                        }
                                    }
                                    bottomSheetTypeDto = bottomSheetTypeDto;
                                }
                                if (bottomSheetTypeDto != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(bottomSheetTypeDto, anonymousClass1) == coroutine_suspended) {
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
                };
                return new Flow<StreamBottomSheetDynamicDataResponseDto>() { // from class: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$1$StreamBottomSheetDynamicData$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$1$StreamBottomSheetDynamicData$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$1$StreamBottomSheetDynamicData$$inlined$map$1$2", m3645f = "CryptoTradingBottomSheetService.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$1$StreamBottomSheetDynamicData$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
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
                                StreamBottomSheetDynamicDataResponseDto streamBottomSheetDynamicDataResponseDto = new StreamBottomSheetDynamicDataResponseDto((BottomSheetTypeDto) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(streamBottomSheetDynamicDataResponseDto, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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
                    public Object collect(FlowCollector<? super StreamBottomSheetDynamicDataResponseDto> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        })), new Function1() { // from class: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTradingBottomSheetService.bottomSheetService$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTradingBottomSheetService.bottomSheetService$lambda$1(this.f$0, (DialogFragmentKey) obj);
            }
        }).getServiceLocator().getClient(contracts.crypto.trade.proto.p431v1.CryptoTradingBottomSheetService.class);
        this.dialogStateFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 6, null);
        this.bottomSheetFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bottomSheetService$lambda$0(FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bottomSheetService$lambda$1(CryptoTradingBottomSheetService cryptoTradingBottomSheetService, DialogFragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(cryptoTradingBottomSheetService.microgramCoroutineScope, null, null, new CryptoTradingBottomSheetService3(cryptoTradingBottomSheetService, it, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTradingBottomSheetService.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$emitBottomSheetData$1", m3645f = "CryptoTradingBottomSheetService.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$emitBottomSheetData$1 */
    static final class C379201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ImmutableList<BottomSheetTypeDto> $dtos;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C379201(ImmutableList<BottomSheetTypeDto> immutableList, Continuation<? super C379201> continuation) {
            super(2, continuation);
            this.$dtos = immutableList;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTradingBottomSheetService.this.new C379201(this.$dtos, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C379201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = CryptoTradingBottomSheetService.this.bottomSheetFlow;
                ImmutableList<BottomSheetTypeDto> immutableList = this.$dtos;
                this.label = 1;
                if (sharedFlow2.emit(immutableList, this) == coroutine_suspended) {
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
    }

    public final void emitBottomSheetData(ImmutableList<BottomSheetTypeDto> dtos) {
        Intrinsics.checkNotNullParameter(dtos, "dtos");
        BuildersKt__Builders_commonKt.launch$default(this.microgramCoroutineScope, null, null, new C379201(dtos, null), 3, null);
    }

    public final Flow<DialogFragmentKey> streamLaunchDialog() {
        return FlowKt.asSharedFlow(this.dialogStateFlow);
    }

    public static /* synthetic */ void launchBottomSheet$default(CryptoTradingBottomSheetService cryptoTradingBottomSheetService, BottomSheetTypeDto bottomSheetTypeDto, Screen screen, SourceDto sourceDto, int i, Object obj) {
        if ((i & 4) != 0) {
            sourceDto = null;
        }
        cryptoTradingBottomSheetService.launchBottomSheet(bottomSheetTypeDto, screen, sourceDto);
    }

    /* compiled from: CryptoTradingBottomSheetService.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$launchBottomSheet$1", m3645f = "CryptoTradingBottomSheetService.kt", m3646l = {110}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$launchBottomSheet$1 */
    static final class C379211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BottomSheetTypeDto $bottomSheetType;
        final /* synthetic */ Screen $screen;
        final /* synthetic */ SourceDto $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C379211(BottomSheetTypeDto bottomSheetTypeDto, Screen screen, SourceDto sourceDto, Continuation<? super C379211> continuation) {
            super(2, continuation);
            this.$bottomSheetType = bottomSheetTypeDto;
            this.$screen = screen;
            this.$source = sourceDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTradingBottomSheetService.this.new C379211(this.$bottomSheetType, this.$screen, this.$source, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C379211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                contracts.crypto.trade.proto.p431v1.CryptoTradingBottomSheetService cryptoTradingBottomSheetService = CryptoTradingBottomSheetService.this.bottomSheetService;
                LaunchBottomSheetRequestDto launchBottomSheetRequestDto = new LaunchBottomSheetRequestDto(this.$bottomSheetType, ScreenDto.INSTANCE.fromProto(this.$screen), this.$source);
                this.label = 1;
                if (cryptoTradingBottomSheetService.LaunchBottomSheet(launchBottomSheetRequestDto, this) == coroutine_suspended) {
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
    }

    public final void launchBottomSheet(BottomSheetTypeDto bottomSheetType, Screen screen, SourceDto source) {
        Intrinsics.checkNotNullParameter(bottomSheetType, "bottomSheetType");
        Intrinsics.checkNotNullParameter(screen, "screen");
        BuildersKt__Builders_commonKt.launch$default(this.microgramCoroutineScope, null, null, new C379211(bottomSheetType, screen, source, null), 3, null);
    }
}
