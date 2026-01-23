package com.robinhood.android.microgramsdui;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader2;
import com.robinhood.android.microgramsdui.EmbeddedSectionDuxo3;
import com.robinhood.android.microgramsdui.EmbeddedSectionDuxo4;
import com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment;
import com.robinhood.android.microgramsdui.MicrogramBottomSheetFragment;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoToast2;
import com.robinhood.compose.bento.component.BentoToast3;
import com.robinhood.compose.bento.component.BentoToast4;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.microgram.sdui.EmbeddedSectionContent;
import com.robinhood.microgram.sdui.MicrogramAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.scarlet.BuildConfig;
import com.robinhood.shared.common.contracts.MicrogramAlertDialogFragmentKey;
import com.robinhood.shared.common.contracts.MicrogramBottomSheetFragmentKey;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import microgram.android.MicrogramLaunchId;
import microgram.android.MicrogramSource;
import microgram.p507ui.p508v1.EmbeddedSectionContentDto;
import okio.BufferedSource;

/* compiled from: MicrogramEmbeddedSection.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001au\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/android/MicrogramSource;", "source", "Landroidx/fragment/app/FragmentManager;", "childFragmentManager", "Landroidx/compose/ui/Modifier;", "modifier", "", "launchArgument", "Lkotlin/Function0;", "", "loadingContent", "onLoadingComplete", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionDuxo;", "duxo", "", "isDynamic", "discriminator", "MicrogramEmbeddedSection", "(Lmicrogram/android/MicrogramSource;Landroidx/fragment/app/FragmentManager;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/microgramsdui/EmbeddedSectionDuxo;ZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "lib-microgram-sdui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MicrogramEmbeddedSection3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MicrogramEmbeddedSection$lambda$7(MicrogramSource microgramSource, FragmentManager fragmentManager, Modifier modifier, String str, Function2 function2, Function0 function0, EmbeddedSectionDuxo embeddedSectionDuxo, boolean z, String str2, int i, int i2, Composer composer, int i3) {
        MicrogramEmbeddedSection(microgramSource, fragmentManager, modifier, str, function2, function0, embeddedSectionDuxo, z, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MicrogramEmbeddedSection(final MicrogramSource source, final FragmentManager childFragmentManager, Modifier modifier, String str, Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function0, EmbeddedSectionDuxo embeddedSectionDuxo, boolean z, String str2, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        String str3;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i6;
        Function0<Unit> function02;
        final EmbeddedSectionDuxo embeddedSectionDuxo2;
        int i7;
        int i8;
        int i9;
        int i10;
        String str4;
        final Function2<? super Composer, ? super Integer, Unit> function2M16540getLambda$1010926801$lib_microgram_sdui_externalDebug;
        Function0<Unit> function03;
        Composer composer2;
        boolean z2;
        String identifier;
        final EmbeddedSectionDuxo4 embeddedSectionDuxo4;
        String str5;
        Composer composer3;
        final Event event;
        final boolean z3;
        final Modifier modifier3;
        final EmbeddedSectionDuxo embeddedSectionDuxo3;
        final Function0<Unit> function04;
        final String str6;
        final String str7;
        EventConsumer eventConsumer;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-800370044);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(source) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(childFragmentManager) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str3 = str;
                    i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function22 = function2;
                        i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            function02 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                        }
                        if ((i & 1572864) == 0) {
                            embeddedSectionDuxo2 = embeddedSectionDuxo;
                            i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changedInstance(embeddedSectionDuxo2)) ? 1048576 : 524288;
                        } else {
                            embeddedSectionDuxo2 = embeddedSectionDuxo;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                            i8 = i7;
                        } else {
                            i8 = i7;
                            if ((i & 12582912) == 0) {
                                i3 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                            }
                        }
                        i9 = i2 & 256;
                        if (i9 != 0) {
                            i3 |= 100663296;
                            i10 = i9;
                        } else {
                            i10 = i9;
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changed(str2) ? 67108864 : 33554432;
                            }
                        }
                        if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z3 = z;
                            composer3 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            str6 = str3;
                            function2M16540getLambda$1010926801$lib_microgram_sdui_externalDebug = function22;
                            str7 = str2;
                            embeddedSectionDuxo3 = embeddedSectionDuxo2;
                            function04 = function02;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                str4 = null;
                                if (i4 != 0) {
                                    str3 = null;
                                }
                                function2M16540getLambda$1010926801$lib_microgram_sdui_externalDebug = i5 == 0 ? MicrogramEmbeddedSection.INSTANCE.m16540getLambda$1010926801$lib_microgram_sdui_externalDebug() : function22;
                                if (i6 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    function03 = (Function0) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function03 = function02;
                                }
                                if ((i2 & 64) == 0) {
                                    if (str3 == null) {
                                        identifier = source.getIdentifier();
                                    } else {
                                        identifier = source.getIdentifier() + " + " + str3;
                                    }
                                    String str8 = identifier;
                                    composerStartRestartGroup.startReplaceGroup(-747520797);
                                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    }
                                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EmbeddedSectionDuxo.class), current, str8, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                    composer2 = composerStartRestartGroup;
                                    composer2.endReplaceableGroup();
                                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                    composer2.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$MicrogramEmbeddedSection$$inlined$duxo$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                lifecycle.addObserver(duxoLifecycleObserver);
                                                final Lifecycle lifecycle2 = lifecycle;
                                                return new DisposableEffectResult() { // from class: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$MicrogramEmbeddedSection$$inlined$duxo$1.1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                                    }
                                                };
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceGroup();
                                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                                    composer2.endReplaceGroup();
                                    i3 &= -3670017;
                                    embeddedSectionDuxo2 = (EmbeddedSectionDuxo) baseDuxo;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                }
                                z2 = i8 == 0 ? false : z;
                                if (i10 == 0) {
                                    str4 = str2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                str4 = str2;
                                composer2 = composerStartRestartGroup;
                                function2M16540getLambda$1010926801$lib_microgram_sdui_externalDebug = function22;
                                function03 = function02;
                                z2 = z;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-800370044, i3, -1, "com.robinhood.android.microgramsdui.MicrogramEmbeddedSection (MicrogramEmbeddedSection.kt:61)");
                            }
                            embeddedSectionDuxo2.setSource(source, str4, str3, z2);
                            Composer composer4 = composer2;
                            embeddedSectionDuxo4 = (EmbeddedSectionDuxo4) FlowExtKt.collectAsStateWithLifecycle(embeddedSectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7).getValue();
                            if (!(embeddedSectionDuxo4 instanceof EmbeddedSectionDuxo4.Success)) {
                                composer4.startReplaceGroup(1835539433);
                                function03.invoke();
                                composer4.startReplaceGroup(5004770);
                                boolean zChanged = composer4.changed(embeddedSectionDuxo4);
                                Object objRememberedValue3 = composer4.rememberedValue();
                                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return MicrogramEmbeddedSection3.MicrogramEmbeddedSection$lambda$4$lambda$3(embeddedSectionDuxo4, (String) obj);
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue3);
                                }
                                composer4.endReplaceGroup();
                                CompositionLocal3.CompositionLocalProvider(MicrogramResourceLoader2.getLocalMicrogramResourceLoader().provides(new MicrogramEmbeddedSection8((Function1) objRememberedValue3)), ComposableLambda3.rememberComposableLambda(-731702084, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt.MicrogramEmbeddedSection.2

                                    /* compiled from: MicrogramEmbeddedSection.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$MicrogramEmbeddedSection$2$2, reason: invalid class name */
                                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ EmbeddedSectionDuxo $duxo;
                                        final /* synthetic */ Modifier $modifier;
                                        final /* synthetic */ EmbeddedSectionDuxo4 $state;

                                        AnonymousClass2(EmbeddedSectionDuxo4 embeddedSectionDuxo4, EmbeddedSectionDuxo embeddedSectionDuxo, Modifier modifier) {
                                            this.$state = embeddedSectionDuxo4;
                                            this.$duxo = embeddedSectionDuxo;
                                            this.$modifier = modifier;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer, int i) {
                                            if ((i & 3) == 2 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1349246641, i, -1, "com.robinhood.android.microgramsdui.MicrogramEmbeddedSection.<anonymous>.<anonymous> (MicrogramEmbeddedSection.kt:76)");
                                            }
                                            UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> body = ((EmbeddedSectionDuxo4.Success) this.$state).getBody();
                                            if (body instanceof UiObject.Legacy) {
                                                composer.startReplaceGroup(1192353486);
                                                ImmutableList immutableList = extensions2.toImmutableList(((EmbeddedSectionContent) ((UiObject.Legacy) body).getValue()).getBody());
                                                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                                composer.startReplaceGroup(5004770);
                                                boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                                final EmbeddedSectionDuxo embeddedSectionDuxo = this.$duxo;
                                                Object objRememberedValue = composer.rememberedValue();
                                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$MicrogramEmbeddedSection$2$2$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return MicrogramEmbeddedSection3.C218712.AnonymousClass2.invoke$lambda$1$lambda$0(embeddedSectionDuxo, (Map) obj);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                SduiStateHandler3 sduiStateHandler3 = new SduiStateHandler3((Function1) objRememberedValue);
                                                Modifier modifier = this.$modifier;
                                                int i2 = (SduiStateHandler3.$stable << 6) | 12607488;
                                                composer.startReplaceGroup(-1772220517);
                                                int i3 = i2 & 14;
                                                int i4 = i2 << 3;
                                                int i5 = 458752 & i4;
                                                SduiColumns.SduiColumn(immutableList, MicrogramAction.class, modifier, sduiStateHandler3, null, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer, i5 | (57344 & i4) | i3 | (i4 & 896) | (i4 & 7168) | (3670016 & i4) | (i4 & 29360128) | (i4 & 234881024), 0);
                                                composer.endReplaceGroup();
                                                composer.endReplaceGroup();
                                            } else {
                                                if (!(body instanceof UiObject.Idl)) {
                                                    composer.startReplaceGroup(454103218);
                                                    composer.endReplaceGroup();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                composer.startReplaceGroup(1192849765);
                                                ImmutableList immutableList2 = extensions2.toImmutableList(((EmbeddedSectionContentDto) ((UiObject.Idl) body).getValue()).getBody());
                                                HorizontalPadding horizontalPadding2 = HorizontalPadding.None;
                                                composer.startReplaceGroup(5004770);
                                                boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                                                final EmbeddedSectionDuxo embeddedSectionDuxo2 = this.$duxo;
                                                Object objRememberedValue2 = composer.rememberedValue();
                                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$MicrogramEmbeddedSection$2$2$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return MicrogramEmbeddedSection3.C218712.AnonymousClass2.invoke$lambda$3$lambda$2(embeddedSectionDuxo2, (Map) obj);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer.endReplaceGroup();
                                                SduiStateHandler3 sduiStateHandler32 = new SduiStateHandler3((Function1) objRememberedValue2);
                                                composer.startReplaceGroup(1849434622);
                                                Object objRememberedValue3 = composer.rememberedValue();
                                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue3 = MicrogramEmbeddedSection5.INSTANCE;
                                                    composer.updateRememberedValue(objRememberedValue3);
                                                }
                                                composer.endReplaceGroup();
                                                Modifier modifier2 = this.$modifier;
                                                int i6 = (SduiStateHandler3.$stable << 9) | 100859952;
                                                composer.startReplaceGroup(40010095);
                                                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                                Alignment.Horizontal start = Alignment.INSTANCE.getStart();
                                                int i7 = i6 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                                                int i8 = i6 << 3;
                                                SduiColumnsIdl.SduiColumnIdl(immutableList2, (Function1) ((KFunction) objRememberedValue3), MicrogramAction.class, modifier2, sduiStateHandler32, null, horizontalPadding2, top, start, true, composer, (i8 & 7168) | i7 | (57344 & i8) | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (1879048192 & i8), 0);
                                                composer.endReplaceGroup();
                                                composer.endReplaceGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(EmbeddedSectionDuxo embeddedSectionDuxo, Map it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            embeddedSectionDuxo.onStateUpdated(it);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$3$lambda$2(EmbeddedSectionDuxo embeddedSectionDuxo, Map it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            embeddedSectionDuxo.onStateUpdated(it);
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i12) {
                                        if ((i12 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-731702084, i12, -1, "com.robinhood.android.microgramsdui.MicrogramEmbeddedSection.<anonymous> (MicrogramEmbeddedSection.kt:75)");
                                        }
                                        EmbeddedSectionDuxo embeddedSectionDuxo5 = embeddedSectionDuxo2;
                                        composer5.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer5.changedInstance(embeddedSectionDuxo5);
                                        Object objRememberedValue4 = composer5.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new MicrogramEmbeddedSection4(embeddedSectionDuxo5);
                                            composer5.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer5.endReplaceGroup();
                                        SduiActionHandler7.HandleMicrogramSduiActions((Function1) ((KFunction) objRememberedValue4), ComposableLambda3.rememberComposableLambda(-1349246641, true, new AnonymousClass2(embeddedSectionDuxo4, embeddedSectionDuxo2, modifier2), composer5, 54), composer5, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                                composer4.endReplaceGroup();
                            } else if (embeddedSectionDuxo4 instanceof EmbeddedSectionDuxo4.Loading) {
                                composer4.startReplaceGroup(1837085558);
                                function2M16540getLambda$1010926801$lib_microgram_sdui_externalDebug.invoke(composer4, Integer.valueOf((i3 >> 12) & 14));
                                composer4.endReplaceGroup();
                            } else {
                                if (!(embeddedSectionDuxo4 instanceof EmbeddedSectionDuxo4.Error)) {
                                    composer4.startReplaceGroup(-356434224);
                                    composer4.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer4.startReplaceGroup(1837182092);
                                if (BuildConfig.DEBUG) {
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    str5 = str4;
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw("Error loading Microgram content", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 6, 0, 16382);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(16)), composer4, 6);
                                    BentoText2.m20747BentoText38GnDrw(String.valueOf(embeddedSectionDuxo4), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16382);
                                    composer3 = composer4;
                                    composer3.endNode();
                                } else {
                                    str5 = str4;
                                    composer3 = composer4;
                                }
                                composer3.endReplaceGroup();
                                final Navigator navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                                final Context context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                final BentoToast2 current2 = BentoToast4.getLocalBentoToastHost().getCurrent(composer3, BentoToast3.$stable);
                                event = (Event) FlowExtKt.collectAsStateWithLifecycle(embeddedSectionDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7).getValue();
                                if (event != null) {
                                    if ((event.getData() instanceof EmbeddedSectionDuxo3) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                                        final EmbeddedSectionDuxo embeddedSectionDuxo5 = embeddedSectionDuxo2;
                                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$MicrogramEmbeddedSection$$inlined$consumeIfType$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                m16547invoke(obj);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m16547invoke(Object it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                EmbeddedSectionDuxo3 embeddedSectionDuxo32 = (EmbeddedSectionDuxo3) event.getData();
                                                if (embeddedSectionDuxo32 instanceof EmbeddedSectionDuxo3.OpenDeeplink) {
                                                    Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((EmbeddedSectionDuxo3.OpenDeeplink) embeddedSectionDuxo32).getUrl(), Boolean.FALSE, null, false, null, 56, null);
                                                    return;
                                                }
                                                if (embeddedSectionDuxo32 instanceof EmbeddedSectionDuxo3.PresentAlert) {
                                                    MicrogramAlertDialogFragment.Companion companion3 = MicrogramAlertDialogFragment.INSTANCE;
                                                    MicrogramLaunchId microgramLaunchId = embeddedSectionDuxo5.getMicrogramLaunchId();
                                                    Intrinsics.checkNotNull(microgramLaunchId);
                                                    ((MicrogramAlertDialogFragment) companion3.newInstance((Parcelable) new MicrogramAlertDialogFragmentKey(microgramLaunchId, ((EmbeddedSectionDuxo3.PresentAlert) embeddedSectionDuxo32).getAlertContent(), "embedded-section-router"))).show(childFragmentManager, "microgram-alert");
                                                    return;
                                                }
                                                if (embeddedSectionDuxo32 instanceof EmbeddedSectionDuxo3.PresentBottomSheet) {
                                                    MicrogramBottomSheetFragment.Companion companion4 = MicrogramBottomSheetFragment.INSTANCE;
                                                    MicrogramLaunchId microgramLaunchId2 = embeddedSectionDuxo5.getMicrogramLaunchId();
                                                    Intrinsics.checkNotNull(microgramLaunchId2);
                                                    ((MicrogramBottomSheetFragment) companion4.createDialogFragment((DialogFragmentKey) new MicrogramBottomSheetFragmentKey(microgramLaunchId2, ((EmbeddedSectionDuxo3.PresentBottomSheet) embeddedSectionDuxo32).getIdentifier(), null, null, null, 28, null))).show(childFragmentManager, "microgram-bottom-sheet");
                                                    return;
                                                }
                                                if (embeddedSectionDuxo32 instanceof EmbeddedSectionDuxo3.PresentRouter) {
                                                    Navigator navigator2 = navigator;
                                                    Context context2 = context;
                                                    MicrogramLaunchId microgramLaunchId3 = embeddedSectionDuxo5.getMicrogramLaunchId();
                                                    Intrinsics.checkNotNull(microgramLaunchId3);
                                                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, context2, new SharedMicrogramRouterFragmentKey(microgramLaunchId3, ((EmbeddedSectionDuxo3.PresentRouter) embeddedSectionDuxo32).getInitialScreenData(), null, 4, null), false, false, false, false, null, false, null, null, 1020, null);
                                                    return;
                                                }
                                                if (embeddedSectionDuxo32 instanceof EmbeddedSectionDuxo3.PresentSystemDefaultShareLink) {
                                                    ContextsUiExtensions.openShareIntent(context, ((EmbeddedSectionDuxo3.PresentSystemDefaultShareLink) embeddedSectionDuxo32).getLink());
                                                } else {
                                                    if (!(embeddedSectionDuxo32 instanceof EmbeddedSectionDuxo3.PresentToast)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    Toast2.showToast(current2, ((EmbeddedSectionDuxo3.PresentToast) embeddedSectionDuxo32).getToast(), new MicrogramEmbeddedSection6(embeddedSectionDuxo5), new MicrogramEmbeddedSection7(embeddedSectionDuxo5));
                                                }
                                            }
                                        });
                                    }
                                    Unit unit = Unit.INSTANCE;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                Function0<Unit> function05 = function03;
                                z3 = z2;
                                modifier3 = modifier2;
                                embeddedSectionDuxo3 = embeddedSectionDuxo2;
                                function04 = function05;
                                str6 = str3;
                                str7 = str5;
                            }
                            str5 = str4;
                            composer3 = composer4;
                            final Navigator navigator2 = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                            final Context context2 = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            final BentoToast2 current22 = BentoToast4.getLocalBentoToastHost().getCurrent(composer3, BentoToast3.$stable);
                            event = (Event) FlowExtKt.collectAsStateWithLifecycle(embeddedSectionDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7).getValue();
                            if (event != null) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Function0<Unit> function052 = function03;
                            z3 = z2;
                            modifier3 = modifier2;
                            embeddedSectionDuxo3 = embeddedSectionDuxo2;
                            function04 = function052;
                            str6 = str3;
                            str7 = str5;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return MicrogramEmbeddedSection3.MicrogramEmbeddedSection$lambda$7(source, childFragmentManager, modifier3, str6, function2M16540getLambda$1010926801$lib_microgram_sdui_externalDebug, function04, embeddedSectionDuxo3, z3, str7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function02 = function0;
                    if ((i & 1572864) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                            }
                            str4 = null;
                            if (i4 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            embeddedSectionDuxo2.setSource(source, str4, str3, z2);
                            Composer composer42 = composer2;
                            embeddedSectionDuxo4 = (EmbeddedSectionDuxo4) FlowExtKt.collectAsStateWithLifecycle(embeddedSectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7).getValue();
                            if (!(embeddedSectionDuxo4 instanceof EmbeddedSectionDuxo4.Success)) {
                            }
                            str5 = str4;
                            composer3 = composer42;
                            final Navigator navigator22 = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                            final Context context22 = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            final BentoToast2 current222 = BentoToast4.getLocalBentoToastHost().getCurrent(composer3, BentoToast3.$stable);
                            event = (Event) FlowExtKt.collectAsStateWithLifecycle(embeddedSectionDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7).getValue();
                            if (event != null) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Function0<Unit> function0522 = function03;
                            z3 = z2;
                            modifier3 = modifier2;
                            embeddedSectionDuxo3 = embeddedSectionDuxo2;
                            function04 = function0522;
                            str6 = str3;
                            str7 = str5;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function22 = function2;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function02 = function0;
                if ((i & 1572864) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str3 = str;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function22 = function2;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function02 = function0;
            if ((i & 1572864) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str3 = str;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function22 = function2;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function02 = function0;
        if ((i & 1572864) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] MicrogramEmbeddedSection$lambda$4$lambda$3(EmbeddedSectionDuxo4 embeddedSectionDuxo4, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        BufferedSource source = ((EmbeddedSectionDuxo4.Success) embeddedSectionDuxo4).getResourceLoader().fetch("/" + url).getSource();
        try {
            byte[] byteArray = source.readByteArray();
            Closeable.closeFinally(source, null);
            return byteArray;
        } finally {
        }
    }
}
