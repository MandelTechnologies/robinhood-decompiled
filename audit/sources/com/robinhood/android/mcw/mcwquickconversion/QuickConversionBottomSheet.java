package com.robinhood.android.mcw.mcwquickconversion;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.mcw.contracts.CurrencyConverterContract;
import com.robinhood.android.mcw.contracts.CurrencyConverterKey;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheet;
import com.robinhood.android.mcw.mcwquickconversion.QuickConversionDuxo;
import com.robinhood.android.mcw.mcwquickconversion.models.UiEvent;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.p237ui.lifecycle.UnsupportedFeatureDialogFragment;
import com.robinhood.android.regiongate.p237ui.lifecycle.UnsupportedScreenRegionGateException;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.util.Money;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QuickConversionBottomSheet.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"QuickConversionBottomSheet", "", "arg", "Lcom/robinhood/android/mcw/contracts/QuickConversionKey;", "onDismissRequest", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "Lcom/robinhood/utils/resource/StringResource;", "onOrderCheckAction", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/mcw/mcwquickconversion/QuickConversionDuxo;", "(Lcom/robinhood/android/mcw/contracts/QuickConversionKey;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/mcw/mcwquickconversion/QuickConversionDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-lib-mcw-quick-conversion_externalDebug", "showErrorDialog", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class QuickConversionBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Navigator QuickConversionBottomSheet$lambda$1$lambda$0(Navigator navigator) {
        return navigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionBottomSheet$lambda$10(QuickConversionKey quickConversionKey, Function0 function0, Function1 function1, Function1 function12, Modifier modifier, QuickConversionDuxo quickConversionDuxo, int i, int i2, Composer composer, int i3) {
        QuickConversionBottomSheet(quickConversionKey, function0, function1, function12, modifier, quickConversionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuickConversionBottomSheet(final QuickConversionKey arg, final Function0<Unit> onDismissRequest, final Function1<? super StringResource, Unit> onSuccess, final Function1<? super GenericOrderCheckAction, Unit> onOrderCheckAction, Modifier modifier, QuickConversionDuxo quickConversionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        QuickConversionDuxo quickConversionDuxo2;
        Composer composer2;
        int i4;
        int i5;
        int i6;
        QuickConversionDuxo quickConversionDuxo3;
        Modifier modifier3;
        final Navigator navigator;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        int i7;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        Composer composer3;
        final Modifier modifier4;
        final QuickConversionDuxo quickConversionDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onOrderCheckAction, "onOrderCheckAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-873864473);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(arg) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSuccess) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderCheckAction) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    quickConversionDuxo2 = quickConversionDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(quickConversionDuxo2) ? 131072 : 65536;
                    i3 |= i9;
                } else {
                    quickConversionDuxo2 = quickConversionDuxo;
                }
                i3 |= i9;
            } else {
                quickConversionDuxo2 = quickConversionDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, arg)));
                        i4 = 0;
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i5 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(QuickConversionDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$QuickConversionBottomSheet$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$QuickConversionBottomSheet$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer2, 0);
                        composer2.endReplaceGroup();
                        quickConversionDuxo3 = (QuickConversionDuxo) baseDuxo;
                        i6 = i3 & (-458753);
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = 0;
                        i5 = -1633490746;
                        i6 = i3;
                        quickConversionDuxo3 = quickConversionDuxo2;
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    composer2 = composerStartRestartGroup;
                    i6 = i3;
                    quickConversionDuxo3 = quickConversionDuxo2;
                    i5 = -1633490746;
                    modifier3 = modifier2;
                    i4 = 0;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-873864473, i6, -1, "com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheet (QuickConversionBottomSheet.kt:38)");
                }
                navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(navigator);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuickConversionBottomSheet.QuickConversionBottomSheet$lambda$1$lambda$0(navigator);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                CurrencyConverterContract currencyConverterContract = new CurrencyConverterContract((Function0) objRememberedValue);
                composer2.startReplaceGroup(i5);
                i7 = (composer2.changedInstance(context) ? 1 : 0) | ((i6 & 896) != 256 ? 1 : i4);
                objRememberedValue2 = composer2.rememberedValue();
                if (i7 == 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return QuickConversionBottomSheet.QuickConversionBottomSheet$lambda$3$lambda$2(onSuccess, context, (CurrencyConverterContract.Result) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(currencyConverterContract, (Function1) objRememberedValue2, composer2, i4);
                composer2.startReplaceGroup(1849434622);
                objRememberedValue3 = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance2 = composer2.changedInstance(quickConversionDuxo3) | composer2.changedInstance(arg);
                objRememberedValue4 = composer2.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new QuickConversionBottomSheet2(quickConversionDuxo3, arg, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(arg, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, i6 & 14);
                QuickConversionDuxo quickConversionDuxo5 = quickConversionDuxo3;
                composer3 = composer2;
                Modifier modifier6 = modifier3;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismissRequest, modifier6, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-946837248, true, new C217802(arg, onDismissRequest, onSuccess, context, activityResultRegistry8RememberLauncherForActivityResult, quickConversionDuxo3, navigator, onOrderCheckAction, snapshotState), composer2, 54), composer3, ((i6 >> 3) & 14) | 1572864 | ((i6 >> 9) & 112), 60);
                if (QuickConversionBottomSheet$lambda$5(snapshotState)) {
                    composer3.startReplaceGroup(5004770);
                    Object objRememberedValue6 = composer3.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return QuickConversionBottomSheet.QuickConversionBottomSheet$lambda$9$lambda$8(snapshotState);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    composer3.endReplaceGroup();
                    QuickConversionErrorDialog.QuickConversionErrorDialog(null, (Function0) objRememberedValue6, composer3, 48, 1);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
                quickConversionDuxo4 = quickConversionDuxo5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                modifier4 = modifier2;
                quickConversionDuxo4 = quickConversionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuickConversionBottomSheet.QuickConversionBottomSheet$lambda$10(arg, onDismissRequest, onSuccess, onOrderCheckAction, modifier4, quickConversionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                modifier3 = modifier5;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(navigator);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuickConversionBottomSheet.QuickConversionBottomSheet$lambda$1$lambda$0(navigator);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    CurrencyConverterContract currencyConverterContract2 = new CurrencyConverterContract((Function0) objRememberedValue);
                    composer2.startReplaceGroup(i5);
                    i7 = (composer2.changedInstance(context) ? 1 : 0) | ((i6 & 896) != 256 ? 1 : i4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (i7 == 0) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return QuickConversionBottomSheet.QuickConversionBottomSheet$lambda$3$lambda$2(onSuccess, context, (CurrencyConverterContract.Result) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                        composer2.endReplaceGroup();
                        ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult2 = ActivityResultRegistry3.rememberLauncherForActivityResult(currencyConverterContract2, (Function1) objRememberedValue2, composer2, i4);
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue3 = composer2.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue3;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composer2.changedInstance(quickConversionDuxo3) | composer2.changedInstance(arg);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue4 = new QuickConversionBottomSheet2(quickConversionDuxo3, arg, null);
                            composer2.updateRememberedValue(objRememberedValue4);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(arg, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, i6 & 14);
                            QuickConversionDuxo quickConversionDuxo52 = quickConversionDuxo3;
                            composer3 = composer2;
                            Modifier modifier62 = modifier3;
                            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismissRequest, modifier62, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-946837248, true, new C217802(arg, onDismissRequest, onSuccess, context, activityResultRegistry8RememberLauncherForActivityResult2, quickConversionDuxo3, navigator, onOrderCheckAction, snapshotState), composer2, 54), composer3, ((i6 >> 3) & 14) | 1572864 | ((i6 >> 9) & 112), 60);
                            if (QuickConversionBottomSheet$lambda$5(snapshotState)) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier62;
                            quickConversionDuxo4 = quickConversionDuxo52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionBottomSheet$lambda$3$lambda$2(Function1 function1, Context context, CurrencyConverterContract.Result result) {
        if (result instanceof CurrencyConverterContract.Result.Completed) {
            Money updatedBalance = ((CurrencyConverterContract.Result.Completed) result).getUpdatedBalance();
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            function1.invoke(UtilsKt.buildSuccessMessageRes(updatedBalance, resources));
        } else if (result != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QuickConversionBottomSheet$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: QuickConversionBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$QuickConversionBottomSheet$2 */
    static final class C217802 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ QuickConversionKey $arg;
        final /* synthetic */ Context $context;
        final /* synthetic */ QuickConversionDuxo $duxo;
        final /* synthetic */ ActivityResultRegistry8<NavigationActivityResultContract.NavigationParams<CurrencyConverterKey>, CurrencyConverterContract.Result> $launcher;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function0<Unit> $onDismissRequest;
        final /* synthetic */ Function1<GenericOrderCheckAction, Unit> $onOrderCheckAction;
        final /* synthetic */ Function1<StringResource, Unit> $onSuccess;
        final /* synthetic */ SnapshotState<Boolean> $showErrorDialog$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C217802(QuickConversionKey quickConversionKey, Function0<Unit> function0, Function1<? super StringResource, Unit> function1, Context context, ActivityResultRegistry8<NavigationActivityResultContract.NavigationParams<CurrencyConverterKey>, CurrencyConverterContract.Result> activityResultRegistry8, QuickConversionDuxo quickConversionDuxo, Navigator navigator, Function1<? super GenericOrderCheckAction, Unit> function12, SnapshotState<Boolean> snapshotState) {
            this.$arg = quickConversionKey;
            this.$onDismissRequest = function0;
            this.$onSuccess = function1;
            this.$context = context;
            this.$launcher = activityResultRegistry8;
            this.$duxo = quickConversionDuxo;
            this.$navigator = navigator;
            this.$onOrderCheckAction = function12;
            this.$showErrorDialog$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-946837248, i, -1, "com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheet.<anonymous> (QuickConversionBottomSheet.kt:67)");
            }
            QuickConversionKey quickConversionKey = this.$arg;
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$onDismissRequest) | composer.changed(this.$onSuccess) | composer.changedInstance(this.$context) | composer.changedInstance(this.$launcher) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$navigator) | composer.changed(this.$onOrderCheckAction);
            final Function0<Unit> function0 = this.$onDismissRequest;
            final Function1<StringResource, Unit> function1 = this.$onSuccess;
            final Context context = this.$context;
            final ActivityResultRegistry8<NavigationActivityResultContract.NavigationParams<CurrencyConverterKey>, CurrencyConverterContract.Result> activityResultRegistry8 = this.$launcher;
            final QuickConversionDuxo quickConversionDuxo = this.$duxo;
            final Navigator navigator = this.$navigator;
            final Function1<GenericOrderCheckAction, Unit> function12 = this.$onOrderCheckAction;
            final SnapshotState<Boolean> snapshotState = this.$showErrorDialog$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function13 = new Function1() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$QuickConversionBottomSheet$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QuickConversionBottomSheet.C217802.invoke$lambda$1$lambda$0(function0, function1, context, activityResultRegistry8, quickConversionDuxo, navigator, function12, snapshotState, (UiEvent) obj);
                    }
                };
                composer.updateRememberedValue(function13);
                objRememberedValue = function13;
            }
            composer.endReplaceGroup();
            QuickConversionComposable.QuickConversionComposable(quickConversionKey, (Function1) objRememberedValue, null, this.$duxo, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0, Function1 function1, Context context, ActivityResultRegistry8 activityResultRegistry8, QuickConversionDuxo quickConversionDuxo, Navigator navigator, Function1 function12, SnapshotState snapshotState, UiEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (Intrinsics.areEqual(event, UiEvent.Close.INSTANCE)) {
                function0.invoke();
            } else if (event instanceof UiEvent.ConversionComplete) {
                Money updatedBalance = ((UiEvent.ConversionComplete) event).getUpdatedBalance();
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                function1.invoke(UtilsKt.buildSuccessMessageRes(updatedBalance, resources));
            } else if (event instanceof UiEvent.ConversionError) {
                QuickConversionBottomSheet.QuickConversionBottomSheet$lambda$6(snapshotState, true);
            } else if (event instanceof UiEvent.EditAmount) {
                QuickConversionDuxo.Companion companion = QuickConversionDuxo.INSTANCE;
                NavigationActivityResultContract3.launch$default(activityResultRegistry8, new CurrencyConverterKey(((QuickConversionKey) companion.getArgs((HasArgs) quickConversionDuxo)).getAccountNumber(), Tuples4.m3642to(((QuickConversionKey) companion.getArgs((HasArgs) quickConversionDuxo)).getSourceCurrency(), ((QuickConversionKey) companion.getArgs((HasArgs) quickConversionDuxo)).getAmountNeeded().getCurrency()), null, ((QuickConversionKey) companion.getArgs((HasArgs) quickConversionDuxo)).getAmountNeeded().getDecimalValue(), false, true, null, 68, null), null, false, 6, null);
            } else if (event instanceof UiEvent.FxRate) {
                UtilsKt.tryShowFxRateBottomSheet(navigator, context);
            } else if (event instanceof UiEvent.OrderCheckAction) {
                function12.invoke(((UiEvent.OrderCheckAction) event).getAction());
            } else {
                if (!(event instanceof UiEvent.RegionGateFailed)) {
                    throw new NoWhenBranchMatchedException();
                }
                function0.invoke();
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new UnsupportedScreenRegionGateException("Trying to access QuickConversionBottomSheet but McwRegionGate is not enabled"), true, null, 4, null);
                AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
                UnsupportedFeatureDialogFragment.Companion companion2 = UnsupportedFeatureDialogFragment.INSTANCE;
                FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                companion2.show(appCompatActivityRequireActivityBaseContext, supportFragmentManager);
            }
            return Unit.INSTANCE;
        }
    }

    private static final boolean QuickConversionBottomSheet$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionBottomSheet$lambda$9$lambda$8(SnapshotState snapshotState) {
        QuickConversionBottomSheet$lambda$6(snapshotState, false);
        return Unit.INSTANCE;
    }
}
