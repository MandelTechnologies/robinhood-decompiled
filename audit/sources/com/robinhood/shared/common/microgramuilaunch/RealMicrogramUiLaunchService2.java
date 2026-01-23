package com.robinhood.shared.common.microgramuilaunch;

import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.control.UiInitializer;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.utils.moshi.LazyMoshi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;
import microgram.android.MicrogramSource;
import microgram.android.extension.ServiceExtension;
import microgram.android.inject.MicrogramComponent;
import microgram.android.service.ManagedServiceExtension2;
import microgram.p507ui.contracts.MicrogramUILaunchService;
import microgram.p507ui.p508v1.LaunchService;

/* compiled from: RealMicrogramUiLaunchService.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a~\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000e2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00130\u000e¨\u0006\u0017"}, m3636d2 = {"getComponentWithUiLaunch", "Lmicrogram/android/inject/MicrogramComponent;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "source", "Lmicrogram/android/MicrogramSource;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "extensions", "", "", "Lmicrogram/android/extension/ServiceExtension$Factory;", "launchUI", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lkotlin/ParameterName;", "name", "fragmentKey", "", "launchDialog", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "dialogFragmentKey", "lib-microgram-ui-launch_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchServiceKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class RealMicrogramUiLaunchService2 {
    public static /* synthetic */ MicrogramComponent getComponentWithUiLaunch$default(MicrogramManager microgramManager, MicrogramSource microgramSource, CoroutineScope coroutineScope, LazyMoshi lazyMoshi, Map map, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        return getComponentWithUiLaunch(microgramManager, microgramSource, coroutineScope, lazyMoshi, map, function1, function12);
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [T, com.robinhood.android.microgramsdui.control.UiInitializer] */
    public static final MicrogramComponent getComponentWithUiLaunch(MicrogramManager microgramManager, MicrogramSource source, CoroutineScope lifecycleScope, LazyMoshi moshi, Map<String, ? extends ServiceExtension.Factory> extensions, Function1<? super FragmentKey, Unit> launchUI, Function1<? super DialogFragmentKey, Unit> launchDialog) {
        Intrinsics.checkNotNullParameter(microgramManager, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(launchUI, "launchUI");
        Intrinsics.checkNotNullParameter(launchDialog, "launchDialog");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        MicrogramLaunchId microgramLaunchId = new MicrogramLaunchId(source, null, 2, null);
        Tuples2<String, ServiceExtension.Factory> tuples2ProvidedBy = ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(MicrogramUILaunchService.class), new RealMicrogramUiLaunchService(microgramLaunchId, moshi, launchUI, launchDialog, new Function0() { // from class: com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchServiceKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealMicrogramUiLaunchService2.getComponentWithUiLaunch$lambda$2$lambda$0(objectRef);
            }
        }));
        Tuples2<String, ServiceExtension.Factory> tuples2ProvidedBy2 = ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(LaunchService.class), new RealMicrogramUiLaunchService3(microgramLaunchId, moshi, launchUI, launchDialog, new Function0() { // from class: com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchServiceKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealMicrogramUiLaunchService2.getComponentWithUiLaunch$lambda$2$lambda$1(objectRef);
            }
        }));
        Tuples2[] tuples2Arr = {tuples2ProvidedBy, tuples2ProvidedBy2};
        for (int i = 0; i < 2; i++) {
            String str = (String) tuples2Arr[i].component1();
            if (extensions.containsKey(str)) {
                throw new IllegalStateException(("`" + str + "` is already provided by MicrogramManager.getComponentWithUiLaunch(). Your provided value will be clobbered.").toString());
            }
        }
        microgramLaunchId.setExtensions(MapsKt.plus(extensions, MapsKt.mapOf(tuples2ProvidedBy, tuples2ProvidedBy2)));
        MicrogramComponent component = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, lifecycleScope, microgramLaunchId, null, 4, null).getComponent();
        objectRef.element = UiInitializer.INSTANCE.getUiInitializer(component);
        return component;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiInitializer getComponentWithUiLaunch$lambda$2$lambda$0(Ref.ObjectRef objectRef) {
        T t = objectRef.element;
        if (t != 0) {
            return (UiInitializer) t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uiInitializer");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiInitializer getComponentWithUiLaunch$lambda$2$lambda$1(Ref.ObjectRef objectRef) {
        T t = objectRef.element;
        if (t != 0) {
            return (UiInitializer) t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uiInitializer");
        return null;
    }
}
