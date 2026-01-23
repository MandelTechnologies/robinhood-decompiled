package com.robinhood.shared.common.microgramuilaunch;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.microgramsdui.SharedMicrogramRouterFragmentKey;
import com.robinhood.android.microgramsdui.control.UiController;
import com.robinhood.android.microgramsdui.control.UiInitializer;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.microgram.sdui.RouterMessage5;
import com.robinhood.shared.common.contracts.MicrogramAlertDialogFragmentKey;
import com.robinhood.shared.common.contracts.MicrogramBottomSheetFragmentKey;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.MicrogramLaunchId;
import microgram.p507ui.p508v1.InitialScreenDataDto;
import microgram.p507ui.p508v1.LaunchRouterRequestDto;
import microgram.p507ui.p508v1.LaunchRouterResponseDto;
import microgram.p507ui.p508v1.LaunchService;
import microgram.p507ui.p508v1.PresentAlertRequestDto;
import microgram.p507ui.p508v1.PresentAlertResponseDto;
import microgram.p507ui.p508v1.PresentBottomSheetRequestDto;
import microgram.p507ui.p508v1.PresentBottomSheetResponseDto;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: RealMicrogramUiLaunchService.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\f0\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J'\u0010\"\u001a\u00020\f2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\b%H\u0082H¢\u0006\u0002\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/common/microgramuilaunch/RealProtoLaunchService;", "Lmicrogram/ui/v1/LaunchService;", "microgramLaunchId", "Lmicrogram/android/MicrogramLaunchId;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "launchUi", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lkotlin/ParameterName;", "name", "fragmentKey", "", "launchDialog", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "dialogFragmentKey", "getUiInitializer", "Lkotlin/Function0;", "Lcom/robinhood/android/microgramsdui/control/UiInitializer;", "<init>", "(Lmicrogram/android/MicrogramLaunchId;Lcom/robinhood/utils/moshi/LazyMoshi;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "LaunchRouter", "Lmicrogram/ui/v1/LaunchRouterResponseDto;", "request", "Lmicrogram/ui/v1/LaunchRouterRequestDto;", "(Lmicrogram/ui/v1/LaunchRouterRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PresentBottomSheet", "Lmicrogram/ui/v1/PresentBottomSheetResponseDto;", "Lmicrogram/ui/v1/PresentBottomSheetRequestDto;", "(Lmicrogram/ui/v1/PresentBottomSheetRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PresentAlert", "Lmicrogram/ui/v1/PresentAlertResponseDto;", "Lmicrogram/ui/v1/PresentAlertRequestDto;", "(Lmicrogram/ui/v1/PresentAlertRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeUi", "block", "Lcom/robinhood/android/microgramsdui/control/UiController;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-ui-launch_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.microgramuilaunch.RealProtoLaunchService, reason: use source file name */
/* loaded from: classes26.dex */
public final class RealMicrogramUiLaunchService3 implements LaunchService {
    private final Function0<UiInitializer> getUiInitializer;
    private final Function1<DialogFragmentKey, Unit> launchDialog;
    private final Function1<FragmentKey, Unit> launchUi;
    private final MicrogramLaunchId microgramLaunchId;
    private final LazyMoshi moshi;

    /* compiled from: RealMicrogramUiLaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.microgramuilaunch.RealProtoLaunchService", m3645f = "RealMicrogramUiLaunchService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "LaunchRouter")
    /* renamed from: com.robinhood.shared.common.microgramuilaunch.RealProtoLaunchService$LaunchRouter$1 */
    static final class C374751 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C374751(Continuation<? super C374751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealMicrogramUiLaunchService3.this.LaunchRouter((LaunchRouterRequestDto) null, this);
        }
    }

    /* compiled from: RealMicrogramUiLaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.microgramuilaunch.RealProtoLaunchService", m3645f = "RealMicrogramUiLaunchService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "PresentAlert")
    /* renamed from: com.robinhood.shared.common.microgramuilaunch.RealProtoLaunchService$PresentAlert$1 */
    static final class C374761 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C374761(Continuation<? super C374761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealMicrogramUiLaunchService3.this.PresentAlert((PresentAlertRequestDto) null, this);
        }
    }

    /* compiled from: RealMicrogramUiLaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.microgramuilaunch.RealProtoLaunchService", m3645f = "RealMicrogramUiLaunchService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "PresentBottomSheet")
    /* renamed from: com.robinhood.shared.common.microgramuilaunch.RealProtoLaunchService$PresentBottomSheet$1 */
    static final class C374771 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C374771(Continuation<? super C374771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealMicrogramUiLaunchService3.this.PresentBottomSheet((PresentBottomSheetRequestDto) null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealMicrogramUiLaunchService3(MicrogramLaunchId microgramLaunchId, LazyMoshi moshi, Function1<? super FragmentKey, Unit> launchUi, Function1<? super DialogFragmentKey, Unit> launchDialog, Function0<? extends UiInitializer> getUiInitializer) {
        Intrinsics.checkNotNullParameter(microgramLaunchId, "microgramLaunchId");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(launchUi, "launchUi");
        Intrinsics.checkNotNullParameter(launchDialog, "launchDialog");
        Intrinsics.checkNotNullParameter(getUiInitializer, "getUiInitializer");
        this.microgramLaunchId = microgramLaunchId;
        this.moshi = moshi;
        this.launchUi = launchUi;
        this.launchDialog = launchDialog;
        this.getUiInitializer = getUiInitializer;
    }

    public Object LaunchRouter(Request<LaunchRouterRequestDto> request, Continuation<? super Response<LaunchRouterResponseDto>> continuation) {
        return LaunchService.DefaultImpls.LaunchRouter(this, request, continuation);
    }

    public Object PresentAlert(Request<PresentAlertRequestDto> request, Continuation<? super Response<PresentAlertResponseDto>> continuation) {
        return LaunchService.DefaultImpls.PresentAlert(this, request, continuation);
    }

    public Object PresentBottomSheet(Request<PresentBottomSheetRequestDto> request, Continuation<? super Response<PresentBottomSheetResponseDto>> continuation) {
        return LaunchService.DefaultImpls.PresentBottomSheet(this, request, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.p507ui.p508v1.LaunchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object LaunchRouter(LaunchRouterRequestDto launchRouterRequestDto, Continuation<? super LaunchRouterResponseDto> continuation) {
        C374751 c374751;
        LaunchRouterRequestDto launchRouterRequestDto2;
        InitialScreenDataDto initialScreenDataDto;
        if (continuation instanceof C374751) {
            c374751 = (C374751) continuation;
            int i = c374751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374751.label = i - Integer.MIN_VALUE;
            } else {
                c374751 = new C374751(continuation);
            }
        }
        Object obj = c374751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            InitialScreenDataDto initial_screen_data = launchRouterRequestDto.getInitial_screen_data();
            if (initial_screen_data == null) {
                return new LaunchRouterResponseDto();
            }
            UiInitializer uiInitializerInvoke = this.getUiInitializer.invoke();
            c374751.L$0 = launchRouterRequestDto;
            c374751.L$1 = initial_screen_data;
            c374751.label = 1;
            Object objStartFromProtoLaunchService = uiInitializerInvoke.startFromProtoLaunchService(c374751);
            if (objStartFromProtoLaunchService == coroutine_suspended) {
                return coroutine_suspended;
            }
            launchRouterRequestDto2 = launchRouterRequestDto;
            initialScreenDataDto = initial_screen_data;
            obj = objStartFromProtoLaunchService;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            initialScreenDataDto = (InitialScreenDataDto) c374751.L$1;
            launchRouterRequestDto2 = (LaunchRouterRequestDto) c374751.L$0;
            ResultKt.throwOnFailure(obj);
        }
        UiController uiController = (UiController) obj;
        uiController.routerView(initialScreenDataDto.getRouter_identifier());
        uiController.screenView(initialScreenDataDto.getScreen_identifier(), RouterMessage5.INSTANCE.fromProtoValue(initialScreenDataDto.getScreen_type()));
        this.launchUi.invoke(new SharedMicrogramRouterFragmentKey(this.microgramLaunchId, new UiObject.Idl(initialScreenDataDto), launchRouterRequestDto2.getMetadata()));
        return new LaunchRouterResponseDto();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.p507ui.p508v1.LaunchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PresentBottomSheet(PresentBottomSheetRequestDto presentBottomSheetRequestDto, Continuation<? super PresentBottomSheetResponseDto> continuation) {
        C374771 c374771;
        if (continuation instanceof C374771) {
            c374771 = (C374771) continuation;
            int i = c374771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374771.label = i - Integer.MIN_VALUE;
            } else {
                c374771 = new C374771(continuation);
            }
        }
        Object objStartFromProtoLaunchService = c374771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStartFromProtoLaunchService);
            UiInitializer uiInitializerInvoke = this.getUiInitializer.invoke();
            c374771.L$0 = presentBottomSheetRequestDto;
            c374771.label = 1;
            objStartFromProtoLaunchService = uiInitializerInvoke.startFromProtoLaunchService(c374771);
            if (objStartFromProtoLaunchService == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            presentBottomSheetRequestDto = (PresentBottomSheetRequestDto) c374771.L$0;
            ResultKt.throwOnFailure(objStartFromProtoLaunchService);
        }
        ((UiController) objStartFromProtoLaunchService).bottomSheetView(presentBottomSheetRequestDto.getIdentifier());
        this.launchDialog.invoke(new MicrogramBottomSheetFragmentKey(this.microgramLaunchId, presentBottomSheetRequestDto.getIdentifier(), presentBottomSheetRequestDto.getMetadata(), Metadata4.buildLoggingEventContext(this.moshi, presentBottomSheetRequestDto.getMetadata()), Metadata4.buildLoggingScreen(this.moshi, presentBottomSheetRequestDto.getMetadata())));
        return new PresentBottomSheetResponseDto();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.p507ui.p508v1.LaunchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PresentAlert(PresentAlertRequestDto presentAlertRequestDto, Continuation<? super PresentAlertResponseDto> continuation) {
        C374761 c374761;
        AlertDto alert;
        Object objStartFromProtoLaunchService;
        if (continuation instanceof C374761) {
            c374761 = (C374761) continuation;
            int i = c374761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374761.label = i - Integer.MIN_VALUE;
            } else {
                c374761 = new C374761(continuation);
            }
        }
        Object obj = c374761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            alert = presentAlertRequestDto.getAlert();
            if (alert == null) {
                return new PresentAlertResponseDto();
            }
            UiInitializer uiInitializerInvoke = this.getUiInitializer.invoke();
            c374761.L$0 = presentAlertRequestDto;
            c374761.L$1 = alert;
            c374761.label = 1;
            objStartFromProtoLaunchService = uiInitializerInvoke.startFromProtoLaunchService(c374761);
            if (objStartFromProtoLaunchService == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AlertDto alertDto = (AlertDto) c374761.L$1;
            PresentAlertRequestDto presentAlertRequestDto2 = (PresentAlertRequestDto) c374761.L$0;
            ResultKt.throwOnFailure(obj);
            alert = alertDto;
            presentAlertRequestDto = presentAlertRequestDto2;
            objStartFromProtoLaunchService = obj;
        }
        ((UiController) objStartFromProtoLaunchService).routerView(presentAlertRequestDto.getRouter_identifier());
        this.launchDialog.invoke(new MicrogramAlertDialogFragmentKey(this.microgramLaunchId, new UiObject.Idl(alert), presentAlertRequestDto.getRouter_identifier()));
        return new PresentAlertResponseDto();
    }

    private final Object initializeUi(Function1<? super UiController, Unit> function1, Continuation<? super Unit> continuation) {
        UiInitializer uiInitializerInvoke = this.getUiInitializer.invoke();
        InlineMarker.mark(0);
        Object objStartFromProtoLaunchService = uiInitializerInvoke.startFromProtoLaunchService(continuation);
        InlineMarker.mark(1);
        function1.invoke(objStartFromProtoLaunchService);
        return Unit.INSTANCE;
    }
}
