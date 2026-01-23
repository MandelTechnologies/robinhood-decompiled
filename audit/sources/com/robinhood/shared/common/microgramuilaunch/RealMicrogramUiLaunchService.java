package com.robinhood.shared.common.microgramuilaunch;

import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.microgramsdui.SharedMicrogramRouterFragmentKey;
import com.robinhood.android.microgramsdui.control.UiController;
import com.robinhood.android.microgramsdui.control.UiInitializer;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.MicrogramAction;
import com.robinhood.microgram.sdui.RouterMessage5;
import com.robinhood.microgram.sdui.StandardScreen5;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.shared.common.contracts.MicrogramAlertDialogFragmentKey;
import com.robinhood.shared.common.contracts.MicrogramBottomSheetFragmentKey;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import microgram.p507ui.contracts.InitialScreenData;
import microgram.p507ui.contracts.MicrogramUILaunchService;
import microgram.p507ui.contracts.PresentationMode;
import microgram.p507ui.contracts.Theme;

/* compiled from: RealMicrogramUiLaunchService.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\f0\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010\u001fJ2\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0%H\u0096@¢\u0006\u0002\u0010&J'\u0010'\u001a\u00020\f2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\b*H\u0082H¢\u0006\u0002\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/common/microgramuilaunch/RealMicrogramUiLaunchService;", "Lmicrogram/ui/contracts/MicrogramUILaunchService;", "microgramLaunchId", "Lmicrogram/android/MicrogramLaunchId;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "launchUi", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lkotlin/ParameterName;", "name", "fragmentKey", "", "launchDialog", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "dialogFragmentKey", "getUiInitializer", "Lkotlin/Function0;", "Lcom/robinhood/android/microgramsdui/control/UiInitializer;", "<init>", "(Lmicrogram/android/MicrogramLaunchId;Lcom/robinhood/utils/moshi/LazyMoshi;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "launchRouter", "initialScreenData", "Lmicrogram/ui/contracts/InitialScreenData;", "presentationMode", "Lmicrogram/ui/contracts/PresentationMode;", "(Lmicrogram/ui/contracts/InitialScreenData;Lmicrogram/ui/contracts/PresentationMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentAlert", "routerIdentifier", "", "encodedAlertContent", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentBottomSheet", "identifier", "encodedInitialScreenData", "presentBottomSheetWithMetadata", "metadata", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeUi", "block", "Lcom/robinhood/android/microgramsdui/control/UiController;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-ui-launch_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class RealMicrogramUiLaunchService implements MicrogramUILaunchService {
    private final Function0<UiInitializer> getUiInitializer;
    private final Function1<DialogFragmentKey, Unit> launchDialog;
    private final Function1<FragmentKey, Unit> launchUi;
    private final MicrogramLaunchId microgramLaunchId;
    private final LazyMoshi moshi;

    /* compiled from: RealMicrogramUiLaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Theme.values().length];
            try {
                iArr[Theme.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Theme.ACHROMATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Theme.CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Theme.LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Theme.DARK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Theme.LIGHT_ACHROMATIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Theme.DARK_ACHROMATIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: RealMicrogramUiLaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService", m3645f = "RealMicrogramUiLaunchService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "launchRouter")
    /* renamed from: com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService$launchRouter$1 */
    static final class C374711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C374711(Continuation<? super C374711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealMicrogramUiLaunchService.this.launchRouter(null, null, this);
        }
    }

    /* compiled from: RealMicrogramUiLaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService", m3645f = "RealMicrogramUiLaunchService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "presentAlert")
    /* renamed from: com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService$presentAlert$1 */
    static final class C374721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C374721(Continuation<? super C374721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealMicrogramUiLaunchService.this.presentAlert(null, null, this);
        }
    }

    /* compiled from: RealMicrogramUiLaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService", m3645f = "RealMicrogramUiLaunchService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "presentBottomSheet")
    /* renamed from: com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService$presentBottomSheet$1 */
    static final class C374731 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C374731(Continuation<? super C374731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealMicrogramUiLaunchService.this.presentBottomSheet(null, null, this);
        }
    }

    /* compiled from: RealMicrogramUiLaunchService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService", m3645f = "RealMicrogramUiLaunchService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "presentBottomSheetWithMetadata")
    /* renamed from: com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService$presentBottomSheetWithMetadata$1 */
    static final class C374741 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C374741(Continuation<? super C374741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealMicrogramUiLaunchService.this.presentBottomSheetWithMetadata(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealMicrogramUiLaunchService(MicrogramLaunchId microgramLaunchId, LazyMoshi moshi, Function1<? super FragmentKey, Unit> launchUi, Function1<? super DialogFragmentKey, Unit> launchDialog, Function0<? extends UiInitializer> getUiInitializer) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.p507ui.contracts.MicrogramUILaunchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object launchRouter(InitialScreenData initialScreenData, PresentationMode presentationMode, Continuation<? super Unit> continuation) {
        C374711 c374711;
        StandardScreen5 standardScreen5;
        if (continuation instanceof C374711) {
            c374711 = (C374711) continuation;
            int i = c374711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374711.label = i - Integer.MIN_VALUE;
            } else {
                c374711 = new C374711(continuation);
            }
        }
        Object objStartFromLegacyLaunchService = c374711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStartFromLegacyLaunchService);
            UiInitializer uiInitializerInvoke = this.getUiInitializer.invoke();
            c374711.L$0 = initialScreenData;
            c374711.label = 1;
            objStartFromLegacyLaunchService = uiInitializerInvoke.startFromLegacyLaunchService(c374711);
            if (objStartFromLegacyLaunchService == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            initialScreenData = (InitialScreenData) c374711.L$0;
            ResultKt.throwOnFailure(objStartFromLegacyLaunchService);
        }
        UiController uiController = (UiController) objStartFromLegacyLaunchService;
        uiController.routerView(initialScreenData.getRouterIdentifier());
        String screenIdentifier = initialScreenData.getScreenIdentifier();
        RouterMessage5.Companion companion = RouterMessage5.INSTANCE;
        uiController.screenView(screenIdentifier, companion.fromLegacyValue(initialScreenData.getScreenType()));
        Function1<FragmentKey, Unit> function1 = this.launchUi;
        MicrogramLaunchId microgramLaunchId = this.microgramLaunchId;
        String routerIdentifier = initialScreenData.getRouterIdentifier();
        switch (WhenMappings.$EnumSwitchMapping$0[initialScreenData.getTheme().ordinal()]) {
            case 1:
                standardScreen5 = StandardScreen5.DEFAULT;
                break;
            case 2:
                standardScreen5 = StandardScreen5.ACHROMATIC;
                break;
            case 3:
                standardScreen5 = StandardScreen5.CRYPTO;
                break;
            case 4:
                standardScreen5 = StandardScreen5.LIGHT;
                break;
            case 5:
                standardScreen5 = StandardScreen5.DARK;
                break;
            case 6:
                standardScreen5 = StandardScreen5.LIGHT_ACHROMATIC;
                break;
            case 7:
                standardScreen5 = StandardScreen5.DARK_ACHROMATIC;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        StandardScreen5 standardScreen52 = standardScreen5;
        RouterMessage5 routerMessage5 = (RouterMessage5) companion.fromServerValue(initialScreenData.getScreenType());
        if (routerMessage5 == null) {
            routerMessage5 = RouterMessage5.LIST;
        }
        function1.invoke(new SharedMicrogramRouterFragmentKey(microgramLaunchId, new UiObject.Legacy(new com.robinhood.microgram.sdui.InitialScreenData(routerIdentifier, initialScreenData.getScreenIdentifier(), routerMessage5, initialScreenData.getEncodedInitialContent(), standardScreen52)), null, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.p507ui.contracts.MicrogramUILaunchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object presentAlert(String str, String str2, Continuation<? super Unit> continuation) throws IOException {
        C374721 c374721;
        if (continuation instanceof C374721) {
            c374721 = (C374721) continuation;
            int i = c374721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374721.label = i - Integer.MIN_VALUE;
            } else {
                c374721 = new C374721(continuation);
            }
        }
        Object objStartFromLegacyLaunchService = c374721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374721.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStartFromLegacyLaunchService);
            UiInitializer uiInitializerInvoke = this.getUiInitializer.invoke();
            c374721.L$0 = str;
            c374721.L$1 = str2;
            c374721.label = 1;
            objStartFromLegacyLaunchService = uiInitializerInvoke.startFromLegacyLaunchService(c374721);
            if (objStartFromLegacyLaunchService == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) c374721.L$1;
            str = (String) c374721.L$0;
            ResultKt.throwOnFailure(objStartFromLegacyLaunchService);
        }
        ((UiController) objStartFromLegacyLaunchService).routerView(str);
        LazyMoshi lazyMoshi = this.moshi;
        Types types = Types.INSTANCE;
        JsonAdapter jsonAdapterAdapter = lazyMoshi.adapter(new TypeToken<GenericAlertContent<? extends MicrogramAction>>() { // from class: com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService$presentAlert$$inlined$getAdapter$1
        }.getType());
        Function1<DialogFragmentKey, Unit> function1 = this.launchDialog;
        MicrogramLaunchId microgramLaunchId = this.microgramLaunchId;
        Object objFromJson = jsonAdapterAdapter.fromJson(str2);
        Intrinsics.checkNotNull(objFromJson);
        function1.invoke(new MicrogramAlertDialogFragmentKey(microgramLaunchId, new UiObject.Legacy((Parcelable) objFromJson), str));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.p507ui.contracts.MicrogramUILaunchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object presentBottomSheet(String str, String str2, Continuation<? super Unit> continuation) {
        C374731 c374731;
        if (continuation instanceof C374731) {
            c374731 = (C374731) continuation;
            int i = c374731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374731.label = i - Integer.MIN_VALUE;
            } else {
                c374731 = new C374731(continuation);
            }
        }
        Object objStartFromLegacyLaunchService = c374731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStartFromLegacyLaunchService);
            UiInitializer uiInitializerInvoke = this.getUiInitializer.invoke();
            c374731.L$0 = str;
            c374731.label = 1;
            objStartFromLegacyLaunchService = uiInitializerInvoke.startFromLegacyLaunchService(c374731);
            if (objStartFromLegacyLaunchService == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c374731.L$0;
            ResultKt.throwOnFailure(objStartFromLegacyLaunchService);
        }
        String str3 = str;
        ((UiController) objStartFromLegacyLaunchService).bottomSheetView(str3);
        this.launchDialog.invoke(new MicrogramBottomSheetFragmentKey(this.microgramLaunchId, str3, null, null, null, 28, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.p507ui.contracts.MicrogramUILaunchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object presentBottomSheetWithMetadata(String str, String str2, Map<String, String> map, Continuation<? super Unit> continuation) {
        C374741 c374741;
        if (continuation instanceof C374741) {
            c374741 = (C374741) continuation;
            int i = c374741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374741.label = i - Integer.MIN_VALUE;
            } else {
                c374741 = new C374741(continuation);
            }
        }
        Object objStartFromLegacyLaunchService = c374741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374741.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStartFromLegacyLaunchService);
            UiInitializer uiInitializerInvoke = this.getUiInitializer.invoke();
            c374741.L$0 = str;
            c374741.L$1 = map;
            c374741.label = 1;
            objStartFromLegacyLaunchService = uiInitializerInvoke.startFromLegacyLaunchService(c374741);
            if (objStartFromLegacyLaunchService == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c374741.L$1;
            str = (String) c374741.L$0;
            ResultKt.throwOnFailure(objStartFromLegacyLaunchService);
        }
        String str3 = str;
        Map<String, String> map2 = map;
        ((UiController) objStartFromLegacyLaunchService).bottomSheetView(str3);
        this.launchDialog.invoke(new MicrogramBottomSheetFragmentKey(this.microgramLaunchId, str3, map2, Metadata4.buildLoggingEventContext(this.moshi, map2), Metadata4.buildLoggingScreen(this.moshi, map2)));
        return Unit.INSTANCE;
    }

    private final Object initializeUi(Function1<? super UiController, Unit> function1, Continuation<? super Unit> continuation) {
        UiInitializer uiInitializerInvoke = this.getUiInitializer.invoke();
        InlineMarker.mark(0);
        Object objStartFromLegacyLaunchService = uiInitializerInvoke.startFromLegacyLaunchService(continuation);
        InlineMarker.mark(1);
        function1.invoke(objStartFromLegacyLaunchService);
        return Unit.INSTANCE;
    }
}
