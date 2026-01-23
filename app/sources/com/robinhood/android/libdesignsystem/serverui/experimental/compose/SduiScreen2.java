package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
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
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import io.noties.markwon.Markwon;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SduiScreen.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0095\u0001\u0010\u0016\u001a\u00020\u000f2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2'\u0010\u0010\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0019*\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a£\u0001\u0010%\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2'\u0010\u0010\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n2\b\b\u0002\u0010 \u001a\u00020\u001f2%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0\nH\u0001¢\u0006\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "components", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;", "bottomSheetHost", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lio/noties/markwon/Markwon;", "markwon", "Lkotlin/Function1;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lkotlin/ParameterName;", "name", "actionHandler", "", "topBar", "Landroidx/compose/ui/Modifier;", "modifier", "Landroid/net/Uri;", "uri", "onLaunchHttpLink", "SduiScreen", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;Lcom/robinhood/android/navigation/Navigator;Lio/noties/markwon/Markwon;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroid/os/Parcelable;", "ActionT", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ScreenRootState;", "rememberScreenRootState", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ScreenRootState;", "state", "hostFragment", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "GenericActionSduiScreenRoot-1YH7lEI", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ScreenRootState;Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;Lcom/robinhood/android/navigation/Navigator;Lio/noties/markwon/Markwon;Lkotlin/jvm/functions/Function3;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "GenericActionSduiScreenRoot", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiScreen2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericActionSduiScreenRoot_1YH7lEI$lambda$5(SduiScreen sduiScreen, RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, Navigator navigator, Markwon markwon, Function3 function3, long j, Function1 function1, Function3 function32, int i, int i2, Composer composer, int i3) {
        m16027GenericActionSduiScreenRoot1YH7lEI(sduiScreen, rhBottomSheetDialogFragmentHost, navigator, markwon, function3, j, function1, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiScreen$lambda$0(ImmutableList immutableList, RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, Navigator navigator, Markwon markwon, Function3 function3, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        SduiScreen(immutableList, rhBottomSheetDialogFragmentHost, navigator, markwon, function3, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiScreen(final ImmutableList<? extends UIComponent<? extends GenericAction>> components, final RhBottomSheetDialogFragmentHost bottomSheetHost, final Navigator navigator, final Markwon markwon, final Function3<? super SduiActionHandler<? super GenericAction>, ? super Composer, ? super Integer, Unit> topBar, Modifier modifier, Function1<? super Uri, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super Uri, Unit> function12;
        final Function1<? super Uri, Unit> function13;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(bottomSheetHost, "bottomSheetHost");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(topBar, "topBar");
        Composer composerStartRestartGroup = composer.startRestartGroup(892208243);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(components) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(bottomSheetHost) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(markwon) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(topBar) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    final Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    Function1<? super Uri, Unit> function14 = i4 == 0 ? null : function12;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(892208243, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreen (SduiScreen.kt:58)");
                    }
                    m16027GenericActionSduiScreenRoot1YH7lEI(rememberScreenRootState(composerStartRestartGroup, 0), bottomSheetHost, navigator, markwon, topBar, 0L, function14, ComposableLambda3.rememberComposableLambda(-876458050, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt.SduiScreen.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                            invoke(paddingValues, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer2, int i6) {
                            ComponentCallbacks2 componentCallbacks2;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i6 |= composer2.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-876458050, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreen.<anonymous> (SduiScreen.kt:69)");
                            }
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(modifier4, paddingValues), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            float f = 8;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f));
                            ImmutableList<UIComponent<GenericAction>> immutableList = components;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer2.startReplaceGroup(-884408345);
                            for (UIComponent<GenericAction> uIComponent : immutableList) {
                                HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                                composer2.startReplaceGroup(655834815);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                ProvidedValue<Class<?>> providedValueProvides = UtilKt.getLocalActionClass().provides(GenericAction.class);
                                AutoLoggingCompositionLocals4 localEventLogger = AutoLoggingCompositionLocals.getLocalEventLogger();
                                Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                if (context instanceof Application) {
                                    componentCallbacks2 = (Application) context;
                                } else {
                                    Context applicationContext = context.getApplicationContext();
                                    Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                                    componentCallbacks2 = (Application) applicationContext;
                                }
                                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providedValueProvides, localEventLogger.provides(((AutoLoggingCompositionLocals2) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).eventLogger())}, ComposableLambda3.rememberComposableLambda(1969517439, true, new SduiComponent3.C207381(uIComponent, companion2, horizontalPadding), composer2, 54), composer2, ProvidedValue.$stable | 48);
                                composer2.endReplaceGroup();
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), composer2, 6);
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 112) | 12582912 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 3670016), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function13 = function14;
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function13 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiScreen2.SduiScreen$lambda$0(components, bottomSheetHost, navigator, markwon, topBar, modifier3, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            function12 = function1;
            if ((599187 & i3) != 599186) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                m16027GenericActionSduiScreenRoot1YH7lEI(rememberScreenRootState(composerStartRestartGroup, 0), bottomSheetHost, navigator, markwon, topBar, 0L, function14, ComposableLambda3.rememberComposableLambda(-876458050, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt.SduiScreen.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i6) {
                        ComponentCallbacks2 componentCallbacks2;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer2.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-876458050, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreen.<anonymous> (SduiScreen.kt:69)");
                        }
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(modifier4, paddingValues), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        float f = 8;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f));
                        ImmutableList<UIComponent<GenericAction>> immutableList = components;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer2.startReplaceGroup(-884408345);
                        for (UIComponent<GenericAction> uIComponent : immutableList) {
                            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                            composer2.startReplaceGroup(655834815);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            ProvidedValue<Class<?>> providedValueProvides = UtilKt.getLocalActionClass().provides(GenericAction.class);
                            AutoLoggingCompositionLocals4 localEventLogger = AutoLoggingCompositionLocals.getLocalEventLogger();
                            Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            if (context instanceof Application) {
                                componentCallbacks2 = (Application) context;
                            } else {
                                Context applicationContext = context.getApplicationContext();
                                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                                componentCallbacks2 = (Application) applicationContext;
                            }
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providedValueProvides, localEventLogger.provides(((AutoLoggingCompositionLocals2) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).eventLogger())}, ComposableLambda3.rememberComposableLambda(1969517439, true, new SduiComponent3.C207381(uIComponent, companion2, horizontalPadding), composer2, 54), composer2, ProvidedValue.$stable | 48);
                            composer2.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), composer2, 6);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 112) | 12582912 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 3670016), 32);
                if (ComposerKt.isTraceInProgress()) {
                }
                function13 = function14;
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* renamed from: GenericActionSduiScreenRoot-1YH7lEI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16027GenericActionSduiScreenRoot1YH7lEI(final SduiScreen<GenericAction> state, final RhBottomSheetDialogFragmentHost hostFragment, final Navigator navigator, final Markwon markwon, final Function3<? super SduiActionHandler<? super GenericAction>, ? super Composer, ? super Integer, Unit> topBar, long j, Function1<? super Uri, Unit> function1, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        long jM21371getBg0d7_KjU;
        Function1<? super Uri, Unit> function12;
        Function1<? super Uri, Unit> function13;
        long j2;
        Context context;
        boolean z;
        Object objRememberedValue;
        GenericAlertContent genericAlertContent;
        Function1<? super Uri, Unit> function14;
        Composer composer2;
        boolean z2;
        Composer composer3;
        final Function1<? super Uri, Unit> function15;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(hostFragment, "hostFragment");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(topBar, "topBar");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-327833889);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(hostFragment) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(markwon) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(topBar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                jM21371getBg0d7_KjU = j;
                int i4 = composerStartRestartGroup.changed(jM21371getBg0d7_KjU) ? 131072 : 65536;
                i3 |= i4;
            } else {
                jM21371getBg0d7_KjU = j;
            }
            i3 |= i4;
        } else {
            jM21371getBg0d7_KjU = j;
        }
        int i5 = i2 & 64;
        if (i5 == 0) {
            if ((1572864 & i) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 32) != 0) {
                        jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                        i3 &= -458753;
                    }
                    if (i5 == 0) {
                        function13 = null;
                        j2 = jM21371getBg0d7_KjU;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-327833889, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiScreenRoot (SduiScreen.kt:117)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (i3 & 14) == 4;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new SduiScreen5(state, navigator, context, function13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SduiScreen5 sduiScreen5 = (SduiScreen5) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    genericAlertContent = (GenericAlertContent) state.getBottomSheetToPresent$lib_sdui_externalRelease().getValue();
                    composerStartRestartGroup.startReplaceGroup(-1515730003);
                    if (genericAlertContent != null) {
                        function14 = function13;
                        composer2 = composerStartRestartGroup;
                        z2 = true;
                    } else {
                        if (state.getBottomSheetIsActive$lib_sdui_externalRelease().getValue().booleanValue()) {
                            function14 = function13;
                            composer2 = composerStartRestartGroup;
                            z2 = true;
                        } else {
                            state.getBottomSheetIsActive$lib_sdui_externalRelease().setValue(Boolean.TRUE);
                            state.getBottomSheetToPresent$lib_sdui_externalRelease().setValue(null);
                            Function1<? super Uri, Unit> function16 = function13;
                            SduiAlert sduiAlert = SduiAlert.INSTANCE;
                            FragmentManager childFragmentManager = hostFragment.getChildFragmentManager();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(sduiScreen5);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new SduiScreen3(sduiScreen5);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function14 = function16;
                            composer2 = composerStartRestartGroup;
                            z2 = true;
                            hostFragment.setSheetListener(sduiAlert.sheetListener(childFragmentManager, markwon, genericAlertContent, sduiScreen5, (Function0<Unit>) ((KFunction) objRememberedValue2), (Function1<? super String, Unit>) ((2016 & 32) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SduiAlert.sheetListener$lambda$16((String) obj2);
                                }
                            } : null), (Function1<? super String, Unit>) ((2016 & 64) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SduiAlert.sheetListener$lambda$17((String) obj2);
                                }
                            } : null), (2016 & 128) != 0 ? false : false, (2016 & 256) != 0 ? false : false, (2016 & 512) != 0, (2016 & 1024) != 0 ? null : null));
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    Composer composer4 = composer2;
                    final long j3 = j2;
                    SduiActionHandler3.ProvideActionHandler(sduiScreen5, ComposableLambda3.rememberComposableLambda(-1932002048, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt$GenericActionSduiScreenRoot$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i6) {
                            if ((i6 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1932002048, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiScreenRoot.<anonymous> (SduiScreen.kt:149)");
                            }
                            Function2<Composer, Integer, Unit> value = state.getDialogToPresent$lib_sdui_externalRelease().getValue();
                            composer5.startReplaceGroup(-1228095000);
                            if (value != null) {
                                value.invoke(composer5, 0);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composer5.endReplaceGroup();
                            final Function3<SduiActionHandler<? super GenericAction>, Composer, Integer, Unit> function3 = topBar;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1341414084, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt$GenericActionSduiScreenRoot$2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i7) {
                                    if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1341414084, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiScreenRoot.<anonymous>.<anonymous> (SduiScreen.kt:151)");
                                    }
                                    function3.invoke(SduiActionHandler3.currentActionHandler(composer6, 0), composer6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54);
                            long j4 = j3;
                            final Function3<PaddingValues, Composer, Integer, Unit> function32 = content;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, j4, 0L, null, ComposableLambda3.rememberComposableLambda(310599247, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt$GenericActionSduiScreenRoot$2.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer6, Integer num) {
                                    invoke(paddingValues, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer6, int i7) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i7 & 6) == 0) {
                                        i7 |= composer6.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(310599247, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiScreenRoot.<anonymous>.<anonymous> (SduiScreen.kt:154)");
                                    }
                                    function32.invoke(paddingValues, composer6, Integer.valueOf(i7 & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), composer5, 805306416, 445);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer4, 54), composer4, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM21371getBg0d7_KjU = j3;
                    composer3 = composer4;
                    function15 = function14;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                }
                j2 = jM21371getBg0d7_KjU;
                function13 = function12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 14) == 4) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = new SduiScreen5(state, navigator, context, function13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    SduiScreen5 sduiScreen52 = (SduiScreen5) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    genericAlertContent = (GenericAlertContent) state.getBottomSheetToPresent$lib_sdui_externalRelease().getValue();
                    composerStartRestartGroup.startReplaceGroup(-1515730003);
                    if (genericAlertContent != null) {
                    }
                    composer2.endReplaceGroup();
                    Composer composer42 = composer2;
                    final long j32 = j2;
                    SduiActionHandler3.ProvideActionHandler(sduiScreen52, ComposableLambda3.rememberComposableLambda(-1932002048, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt$GenericActionSduiScreenRoot$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i6) {
                            if ((i6 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1932002048, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiScreenRoot.<anonymous> (SduiScreen.kt:149)");
                            }
                            Function2<Composer, Integer, Unit> value = state.getDialogToPresent$lib_sdui_externalRelease().getValue();
                            composer5.startReplaceGroup(-1228095000);
                            if (value != null) {
                                value.invoke(composer5, 0);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composer5.endReplaceGroup();
                            final Function3<? super SduiActionHandler<? super GenericAction>, ? super Composer, ? super Integer, Unit> function3 = topBar;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1341414084, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt$GenericActionSduiScreenRoot$2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i7) {
                                    if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1341414084, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiScreenRoot.<anonymous>.<anonymous> (SduiScreen.kt:151)");
                                    }
                                    function3.invoke(SduiActionHandler3.currentActionHandler(composer6, 0), composer6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54);
                            long j4 = j32;
                            final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32 = content;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, j4, 0L, null, ComposableLambda3.rememberComposableLambda(310599247, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt$GenericActionSduiScreenRoot$2.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer6, Integer num) {
                                    invoke(paddingValues, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer6, int i7) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i7 & 6) == 0) {
                                        i7 |= composer6.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(310599247, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiScreenRoot.<anonymous>.<anonymous> (SduiScreen.kt:154)");
                                    }
                                    function32.invoke(paddingValues, composer6, Integer.valueOf(i7 & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), composer5, 805306416, 445);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer42, 54), composer42, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    jM21371getBg0d7_KjU = j32;
                    composer3 = composer42;
                    function15 = function14;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                function15 = function12;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final long j4 = jM21371getBg0d7_KjU;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiScreen2.GenericActionSduiScreenRoot_1YH7lEI$lambda$5(state, hostFragment, navigator, markwon, topBar, j4, function15, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        function12 = function1;
        if ((i2 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 32) != 0) {
                }
                if (i5 == 0) {
                    j2 = jM21371getBg0d7_KjU;
                    function13 = function12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 14) == 4) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final <ActionT extends Parcelable> SduiScreen<ActionT> rememberScreenRootState(Composer composer, int i) {
        composer.startReplaceGroup(585948967);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(585948967, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.rememberScreenRootState (SduiScreen.kt:98)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SduiScreen();
            composer.updateRememberedValue(objRememberedValue);
        }
        SduiScreen<ActionT> sduiScreen = (SduiScreen) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sduiScreen;
    }
}
