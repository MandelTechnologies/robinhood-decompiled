package com.robinhood.microgram.sdui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker2;
import com.robinhood.android.microgramsdui.Colors4;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.microgram.sdui.MicrogramScreenDuxo2;
import com.robinhood.microgram.sdui.NavigationBarConfiguration;
import com.robinhood.models.serverdriven.experimental.api.ComponentState;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import microgram.p507ui.p508v1.AndroidAttributesDto;
import microgram.p507ui.p508v1.NavigationBarConfigurationDto;
import microgram.p507ui.p508v1.StandardScreenContentDto;
import microgram.p507ui.p508v1.screen_events.ScrollRequestDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: ListScreen.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0099\u0001\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u001e\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u0012\u0004\u0012\u00020\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0018\u001a]\u0010\u0019\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u001fX\u008a\u008e\u0002"}, m3636d2 = {"ListScreen", "", "screen", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/StandardScreen;", "Lmicrogram/ui/v1/StandardScreenContentDto;", "Lcom/robinhood/microgram/sdui/AnyStandardScreen;", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "onBackClick", "Lkotlin/Function0;", "onScrollRequestComplete", "onScrollReachedEnd", "modifier", "Landroidx/compose/ui/Modifier;", "scrollRequest", "Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest;", "shareScreenshotRequest", "Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;", "onStateChange", "Lkotlin/Function1;", "", "", "Lcom/robinhood/models/serverdriven/experimental/api/ComponentState;", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Lcom/robinhood/microgram/sdui/ScreenType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest;Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Content", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Lcom/robinhood/microgram/sdui/ScreenType;Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest;Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-microgram-sdui_externalDebug", "bodyHeight", "", "scrollReachedBottom", "", "isContentScrollable"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.ListScreenKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class ListScreen {

    /* compiled from: ListScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.ListScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ScrollRequestDto.AlignmentDto.values().length];
            try {
                iArr[ScrollRequestDto.AlignmentDto.ALIGNMENT_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollRequestDto.AlignmentDto.ALIGNMENT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScrollRequestDto.AlignmentDto.ALIGNMENT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScrollRequestDto.AlignmentDto.ALIGNMENT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RouterMessage5.values().length];
            try {
                iArr2[RouterMessage5.CENTERED_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RouterMessage5.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RouterMessage5.HTML_CANVAS_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$22(UiObject uiObject, RouterMessage5 routerMessage5, MicrogramScreenDuxo2.ScrollRequest scrollRequest, MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        Content(uiObject, routerMessage5, scrollRequest, shareScreenshotRequest, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListScreen$lambda$0(UiObject uiObject, RouterMessage5 routerMessage5, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, MicrogramScreenDuxo2.ScrollRequest scrollRequest, MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, Function1 function1, int i, int i2, Composer composer, int i3) {
        ListScreen(uiObject, routerMessage5, function0, function02, function03, modifier, scrollRequest, shareScreenshotRequest, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListScreen(final UiObject<StandardScreen, StandardScreenContentDto> screen, final RouterMessage5 screenType, final Function0<Unit> onBackClick, final Function0<Unit> onScrollRequestComplete, final Function0<Unit> onScrollReachedEnd, Modifier modifier, MicrogramScreenDuxo2.ScrollRequest scrollRequest, MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, final Function1<? super Map<String, ? extends ComponentState>, Unit> onStateChange, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        MicrogramScreenDuxo2.ScrollRequest scrollRequest2;
        int i5;
        final MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest2;
        final MicrogramScreenDuxo2.ScrollRequest scrollRequest3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onScrollRequestComplete, "onScrollRequestComplete");
        Intrinsics.checkNotNullParameter(onScrollReachedEnd, "onScrollReachedEnd");
        Intrinsics.checkNotNullParameter(onStateChange, "onStateChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(52407902);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(screen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(screenType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrollRequestComplete) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrollReachedEnd) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    scrollRequest2 = scrollRequest;
                    i3 |= composerStartRestartGroup.changed(scrollRequest2) ? 1048576 : 524288;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(shareScreenshotRequest) ? 8388608 : 4194304;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onStateChange) ? 67108864 : 33554432;
                }
                if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        scrollRequest2 = null;
                    }
                    shareScreenshotRequest2 = i5 == 0 ? null : shareScreenshotRequest;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(52407902, i3, -1, "com.robinhood.microgram.sdui.ListScreen (ListScreen.kt:49)");
                    }
                    UiObject<ThemedColor, ThemedColorDto> backgroundColor = StandardScreen4.getBackgroundColor(screen);
                    composerStartRestartGroup.startReplaceGroup(-1175598738);
                    Color composeColor = backgroundColor != null ? Colors4.toComposeColor(backgroundColor, composerStartRestartGroup, 0) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1175599458);
                    long jM21371getBg0d7_KjU = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                    final long j = jM21371getBg0d7_KjU;
                    final Modifier modifier4 = modifier2;
                    scrollRequest3 = scrollRequest2;
                    CompositionLocal3.CompositionLocalProvider(SduiStateHandler2.getLocalStateHandler().provides(new SduiStateHandler3(onStateChange)), ComposableLambda3.rememberComposableLambda(401302302, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.ListScreenKt.ListScreen.1

                        /* compiled from: ListScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.microgram.sdui.ListScreenKt$ListScreen$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[NavigationBarConfiguration.Style.values().length];
                                try {
                                    iArr[NavigationBarConfiguration.Style.STANDARD.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[NavigationBarConfiguration.Style.TRANSPARENT.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            NavigationBarConfiguration.Style style;
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(401302302, i7, -1, "com.robinhood.microgram.sdui.ListScreen.<anonymous> (ListScreen.kt:55)");
                            }
                            UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> navConfig = StandardScreen4.getNavConfig(screen);
                            if (navConfig == null || (style = StandardScreen4.getStyle(navConfig)) == null) {
                                style = NavigationBarConfiguration.Style.STANDARD;
                            }
                            int i8 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                            if (i8 == 1) {
                                composer2.startReplaceGroup(-1991963843);
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier4, j, null, 2, null);
                                UiObject<AndroidAttributes, AndroidAttributesDto> androidAttributes = StandardScreen4.getAndroidAttributes(screen);
                                if (!(androidAttributes != null ? Intrinsics.areEqual(AndroidAttributes2.getAddNavigationBarsPadding(androidAttributes), Boolean.FALSE) : false)) {
                                    modifierM4872backgroundbw27NRU$default = WindowInsetsPadding_androidKt.navigationBarsPadding(modifierM4872backgroundbw27NRU$default);
                                }
                                UiObject<StandardScreen, StandardScreenContentDto> uiObject = screen;
                                Function0<Unit> function0 = onBackClick;
                                RouterMessage5 routerMessage5 = screenType;
                                MicrogramScreenDuxo2.ScrollRequest scrollRequest4 = scrollRequest3;
                                MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest3 = shareScreenshotRequest2;
                                Function0<Unit> function02 = onScrollRequestComplete;
                                Function0<Unit> function03 = onScrollReachedEnd;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
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
                                NavigationBarKt.NavigationBar(uiObject, function0, false, StandardScreen4.getNavConfig(uiObject), null, composer2, 384, 16);
                                ListScreen.Content(uiObject, routerMessage5, scrollRequest4, shareScreenshotRequest3, function02, function03, composer2, 0);
                                composer2.endNode();
                                composer2.endReplaceGroup();
                            } else {
                                if (i8 != 2) {
                                    composer2.startReplaceGroup(-895542016);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(-1990913098);
                                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier4, j, null, 2, null);
                                UiObject<AndroidAttributes, AndroidAttributesDto> androidAttributes2 = StandardScreen4.getAndroidAttributes(screen);
                                if (!(androidAttributes2 != null ? Intrinsics.areEqual(AndroidAttributes2.getAddNavigationBarsPadding(androidAttributes2), Boolean.FALSE) : false)) {
                                    modifierM4872backgroundbw27NRU$default2 = WindowInsetsPadding_androidKt.navigationBarsPadding(modifierM4872backgroundbw27NRU$default2);
                                }
                                UiObject<StandardScreen, StandardScreenContentDto> uiObject2 = screen;
                                RouterMessage5 routerMessage52 = screenType;
                                MicrogramScreenDuxo2.ScrollRequest scrollRequest5 = scrollRequest3;
                                MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest4 = shareScreenshotRequest2;
                                Function0<Unit> function04 = onScrollRequestComplete;
                                Function0<Unit> function05 = onScrollReachedEnd;
                                Function0<Unit> function06 = onBackClick;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default2);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ListScreen.Content(uiObject2, routerMessage52, scrollRequest5, shareScreenshotRequest4, function04, function05, composer2, 0);
                                NavigationBarKt.NavigationBar(uiObject2, function06, true, StandardScreen4.getNavConfig(uiObject2), null, composer2, 384, 16);
                                composer2.endNode();
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    shareScreenshotRequest2 = shareScreenshotRequest;
                    modifier3 = modifier2;
                    scrollRequest3 = scrollRequest2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.microgram.sdui.ListScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ListScreen.ListScreen$lambda$0(screen, screenType, onBackClick, onScrollRequestComplete, onScrollReachedEnd, modifier3, scrollRequest3, shareScreenshotRequest2, onStateChange, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            scrollRequest2 = scrollRequest;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((38347923 & i3) != 38347922) {
                if (i6 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                UiObject<ThemedColor, ThemedColorDto> backgroundColor2 = StandardScreen4.getBackgroundColor(screen);
                composerStartRestartGroup.startReplaceGroup(-1175598738);
                if (backgroundColor2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1175599458);
                if (composeColor != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final long j2 = jM21371getBg0d7_KjU;
                final Modifier modifier42 = modifier2;
                scrollRequest3 = scrollRequest2;
                CompositionLocal3.CompositionLocalProvider(SduiStateHandler2.getLocalStateHandler().provides(new SduiStateHandler3(onStateChange)), ComposableLambda3.rememberComposableLambda(401302302, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.ListScreenKt.ListScreen.1

                    /* compiled from: ListScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.microgram.sdui.ListScreenKt$ListScreen$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[NavigationBarConfiguration.Style.values().length];
                            try {
                                iArr[NavigationBarConfiguration.Style.STANDARD.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[NavigationBarConfiguration.Style.TRANSPARENT.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        NavigationBarConfiguration.Style style;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(401302302, i7, -1, "com.robinhood.microgram.sdui.ListScreen.<anonymous> (ListScreen.kt:55)");
                        }
                        UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> navConfig = StandardScreen4.getNavConfig(screen);
                        if (navConfig == null || (style = StandardScreen4.getStyle(navConfig)) == null) {
                            style = NavigationBarConfiguration.Style.STANDARD;
                        }
                        int i8 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                        if (i8 == 1) {
                            composer2.startReplaceGroup(-1991963843);
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier42, j2, null, 2, null);
                            UiObject<AndroidAttributes, AndroidAttributesDto> androidAttributes = StandardScreen4.getAndroidAttributes(screen);
                            if (!(androidAttributes != null ? Intrinsics.areEqual(AndroidAttributes2.getAddNavigationBarsPadding(androidAttributes), Boolean.FALSE) : false)) {
                                modifierM4872backgroundbw27NRU$default = WindowInsetsPadding_androidKt.navigationBarsPadding(modifierM4872backgroundbw27NRU$default);
                            }
                            UiObject<StandardScreen, StandardScreenContentDto> uiObject = screen;
                            Function0<Unit> function0 = onBackClick;
                            RouterMessage5 routerMessage5 = screenType;
                            MicrogramScreenDuxo2.ScrollRequest scrollRequest4 = scrollRequest3;
                            MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest3 = shareScreenshotRequest2;
                            Function0<Unit> function02 = onScrollRequestComplete;
                            Function0<Unit> function03 = onScrollReachedEnd;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
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
                            NavigationBarKt.NavigationBar(uiObject, function0, false, StandardScreen4.getNavConfig(uiObject), null, composer2, 384, 16);
                            ListScreen.Content(uiObject, routerMessage5, scrollRequest4, shareScreenshotRequest3, function02, function03, composer2, 0);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        } else {
                            if (i8 != 2) {
                                composer2.startReplaceGroup(-895542016);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-1990913098);
                            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier42, j2, null, 2, null);
                            UiObject<AndroidAttributes, AndroidAttributesDto> androidAttributes2 = StandardScreen4.getAndroidAttributes(screen);
                            if (!(androidAttributes2 != null ? Intrinsics.areEqual(AndroidAttributes2.getAddNavigationBarsPadding(androidAttributes2), Boolean.FALSE) : false)) {
                                modifierM4872backgroundbw27NRU$default2 = WindowInsetsPadding_androidKt.navigationBarsPadding(modifierM4872backgroundbw27NRU$default2);
                            }
                            UiObject<StandardScreen, StandardScreenContentDto> uiObject2 = screen;
                            RouterMessage5 routerMessage52 = screenType;
                            MicrogramScreenDuxo2.ScrollRequest scrollRequest5 = scrollRequest3;
                            MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest4 = shareScreenshotRequest2;
                            Function0<Unit> function04 = onScrollRequestComplete;
                            Function0<Unit> function05 = onScrollReachedEnd;
                            Function0<Unit> function06 = onBackClick;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default2);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ListScreen.Content(uiObject2, routerMessage52, scrollRequest5, shareScreenshotRequest4, function04, function05, composer2, 0);
                            NavigationBarKt.NavigationBar(uiObject2, function06, true, StandardScreen4.getNavConfig(uiObject2), null, composer2, 384, 16);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        scrollRequest2 = scrollRequest;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((38347923 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final boolean Content$lambda$21$lambda$19$lambda$13(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean Content$lambda$21$lambda$19$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void Content(final UiObject<StandardScreen, StandardScreenContentDto> uiObject, final RouterMessage5 routerMessage5, final MicrogramScreenDuxo2.ScrollRequest scrollRequest, final MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        int i3;
        LocalDimensionTracker localDimensionTracker;
        boolean z;
        int i4;
        int i5;
        Modifier.Companion companion;
        Composer composer2;
        Unit unit;
        float height;
        Object obj;
        Arrangement arrangement;
        int i6;
        Alignment centerStart;
        float f;
        Modifier.Companion companion2;
        Composer composer3;
        Alignment centerStart2;
        Composer composerStartRestartGroup = composer.startRestartGroup(681438949);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uiObject) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(routerMessage5.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(scrollRequest) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(shareScreenshotRequest) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(681438949, i2, -1, "com.robinhood.microgram.sdui.Content (ListScreen.kt:115)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            ScreenshotUtils2.RegisterScreenshotRequests(shareScreenshotRequest, composerStartRestartGroup, (i2 >> 9) & 14);
            LocalDimensionTracker localDimensionTracker2 = (LocalDimensionTracker) composerStartRestartGroup.consume(LocalDimensionTracker2.getLocalDimensionTracker());
            boolean z2 = uiObject instanceof UiObject.Legacy;
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-873821410);
                ImmutableList immutableList = extensions2.toImmutableList(((StandardScreen) ((UiObject.Legacy) uiObject).getValue()).getHeader());
                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                composerStartRestartGroup.startReplaceGroup(-1772220517);
                i3 = i2;
                i4 = 0;
                z = z2;
                companion = companion3;
                i5 = 1849434622;
                localDimensionTracker = localDimensionTracker2;
                SduiColumns.SduiColumn(immutableList, MicrogramAction.class, companion, null, null, horizontalPadding, arrangement2.getTop(), companion4.getStart(), true, composerStartRestartGroup, 100859904, 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                composer2.endReplaceGroup();
            } else {
                i3 = i2;
                localDimensionTracker = localDimensionTracker2;
                z = z2;
                i4 = 0;
                i5 = 1849434622;
                if (!(uiObject instanceof UiObject.Idl)) {
                    composerStartRestartGroup.startReplaceGroup(-873822657);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-873814049);
                ImmutableList immutableList2 = extensions2.toImmutableList(((StandardScreenContentDto) ((UiObject.Idl) uiObject).getValue()).getHeader());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = ListScreen2.INSTANCE;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                HorizontalPadding horizontalPadding2 = HorizontalPadding.None;
                composerStartRestartGroup.startReplaceGroup(40010095);
                SduiColumnsIdl.SduiColumnIdl(immutableList2, (Function1) ((KFunction) objRememberedValue), MicrogramAction.class, companion3, null, null, horizontalPadding2, arrangement2.getTop(), companion4.getStart(), true, composerStartRestartGroup, 806879280, 0);
                companion = companion3;
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                composer2.endReplaceGroup();
            }
            composer2.startReplaceGroup(i5);
            Object objRememberedValue2 = composer2.rememberedValue();
            Composer.Companion companion6 = Composer.INSTANCE;
            if (objRememberedValue2 == companion6.getEmpty()) {
                objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(i4);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
            composer2.endReplaceGroup();
            Modifier.Companion companion7 = companion;
            Modifier modifierWeight$default = Column5.weight$default(column6, companion7, 1.0f, false, 2, null);
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == companion6.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.microgram.sdui.ListScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ListScreen.Content$lambda$21$lambda$6$lambda$5(snapshotIntState2, (IntSize) obj2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierWeight$default, (Function1) objRememberedValue3);
            boolean z3 = i4;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), z3);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, z3 ? 1 : 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierOnSizeChanged);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            MicrogramScreenDuxo2.ScrollRequest.ToItem toItem = scrollRequest instanceof MicrogramScreenDuxo2.ScrollRequest.ToItem ? (MicrogramScreenDuxo2.ScrollRequest.ToItem) scrollRequest : null;
            composer2.startReplaceGroup(729545024);
            MicrogramScreenDuxo2.ScrollRequest.ToItem toItem2 = toItem;
            if (toItem2 == null) {
                unit = null;
            } else {
                String identifier = ScreenScrollRequest2.getIdentifier(toItem2.getScrollRequest());
                ScrollRequestDto.AlignmentDto alignment = ScreenScrollRequest2.getAlignment(toItem2.getScrollRequest());
                LocalDimensionTracker.VerticalDimension verticalDimensionInRoot = localDimensionTracker.getVerticalDimensionInRoot(identifier);
                composer2.startReplaceGroup(729552605);
                if (verticalDimensionInRoot != null) {
                    int i7 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
                    if (i7 == 1 || i7 == 2) {
                        height = 0.0f;
                    } else if (i7 == 3) {
                        height = ((-snapshotIntState2.getIntValue()) / 2.0f) + (verticalDimensionInRoot.getHeight() / 2.0f);
                    } else {
                        if (i7 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        height = (-snapshotIntState2.getIntValue()) + verticalDimensionInRoot.getHeight();
                    }
                    Unit unit2 = Unit.INSTANCE;
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChanged = composer2.changed(lazyListStateRememberLazyListState) | composer2.changedInstance(verticalDimensionInRoot) | composer2.changed(height);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue4 == companion6.getEmpty()) {
                        objRememberedValue4 = new ListScreen3(lazyListStateRememberLazyListState, verticalDimensionInRoot, height, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 6);
                }
                composer2.endReplaceGroup();
                unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(729543608);
            if (unit == null) {
                if ((scrollRequest instanceof MicrogramScreenDuxo2.ScrollRequest.ToBottom ? (MicrogramScreenDuxo2.ScrollRequest.ToBottom) scrollRequest : null) != null) {
                    Unit unit3 = Unit.INSTANCE;
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChanged2 = composer2.changed(lazyListStateRememberLazyListState) | composer2.changedInstance(uiObject) | ((i3 & 57344) == 16384);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == companion6.getEmpty()) {
                        objRememberedValue5 = new ListScreen4(lazyListStateRememberLazyListState, uiObject, function0, null);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 6);
                }
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (objRememberedValue6 == companion6.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.microgram.sdui.ListScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(ListScreen.Content$lambda$21$lambda$19$lambda$12$lambda$11(lazyListStateRememberLazyListState));
                    }
                });
                composer2.updateRememberedValue(objRememberedValue6);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue6;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composer2.rememberedValue();
            if (objRememberedValue7 == companion6.getEmpty()) {
                objRememberedValue7 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue7);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue7;
            composer2.endReplaceGroup();
            if (lazyListStateRememberLazyListState.getCanScrollForward()) {
                Content$lambda$21$lambda$19$lambda$16(snapshotState, true);
            }
            composer2.startReplaceGroup(729594594);
            if (Content$lambda$21$lambda$19$lambda$15(snapshotState) && Content$lambda$21$lambda$19$lambda$13(snapshotState4)) {
                Unit unit4 = Unit.INSTANCE;
                composer2.startReplaceGroup(5004770);
                boolean z4 = (i3 & 458752) == 131072;
                Object objRememberedValue8 = composer2.rememberedValue();
                if (z4 || objRememberedValue8 == companion6.getEmpty()) {
                    obj = null;
                    objRememberedValue8 = new ListScreen5(function02, null);
                    composer2.updateRememberedValue(objRememberedValue8);
                } else {
                    obj = null;
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer2, 6);
            } else {
                obj = null;
            }
            composer2.endReplaceGroup();
            if (z) {
                composer2.startReplaceGroup(1142836155);
                ImmutableList immutableList3 = extensions2.toImmutableList(((StandardScreen) ((UiObject.Legacy) uiObject).getValue()).getBody());
                int i8 = WhenMappings.$EnumSwitchMapping$1[routerMessage5.ordinal()];
                if (i8 == 1) {
                    centerStart2 = companion4.getCenterStart();
                } else {
                    if (i8 != 2 && i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    centerStart2 = companion4.getTopStart();
                }
                Modifier modifierAlign = boxScopeInstance.align(companion7, centerStart2);
                composer2.startReplaceGroup(767440808);
                Composer composer4 = composer2;
                arrangement = arrangement2;
                i6 = 1;
                SduiColumns.SduiLazyColumn(immutableList3, MicrogramAction.class, modifierAlign, lazyListStateRememberLazyListState, null, null, HorizontalPadding.Default, true, composer4, 12582912, 0);
                composer3 = composer4;
                composer3.endReplaceGroup();
                composer3.endReplaceGroup();
                f = 0.0f;
                companion2 = companion7;
            } else {
                arrangement = arrangement2;
                i6 = 1;
                if (!(uiObject instanceof UiObject.Idl)) {
                    composer2.startReplaceGroup(729601403);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(1143484086);
                ImmutableList immutableList4 = extensions2.toImmutableList(((StandardScreenContentDto) ((UiObject.Idl) uiObject).getValue()).getBody());
                int i9 = WhenMappings.$EnumSwitchMapping$1[routerMessage5.ordinal()];
                if (i9 == 1) {
                    centerStart = companion4.getCenterStart();
                } else {
                    if (i9 != 2 && i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    centerStart = companion4.getTopStart();
                }
                Modifier modifierAlign2 = boxScopeInstance.align(companion7, centerStart);
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue9 = composer2.rememberedValue();
                if (objRememberedValue9 == companion6.getEmpty()) {
                    objRememberedValue9 = ListScreen6.INSTANCE;
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1370740990);
                f = 0.0f;
                Composer composer5 = composer2;
                companion2 = companion7;
                SduiColumnsIdl.SduiLazyColumn(immutableList4, MicrogramAction.class, (Function1) ((KFunction) objRememberedValue9), modifierAlign2, lazyListStateRememberLazyListState, null, null, HorizontalPadding.Default, true, composer5, 100663680, 0);
                composer3 = composer5;
                composer3.endReplaceGroup();
                composer3.endReplaceGroup();
            }
            composer3.endNode();
            composer3.startReplaceGroup(-873693457);
            if (StandardScreen4.getHasFooter(uiObject)) {
                if (z) {
                    composer3.startReplaceGroup(-873691049);
                    ImmutableList immutableList5 = extensions2.toImmutableList(((StandardScreen) ((UiObject.Legacy) uiObject).getValue()).getFooter());
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), i6, null);
                    composer3.startReplaceGroup(-1772220517);
                    Composer composer6 = composer3;
                    SduiColumns.SduiColumn(immutableList5, MicrogramAction.class, modifierM5144paddingVpY3zN4$default, null, null, HorizontalPadding.Default, arrangement.getTop(), companion4.getStart(), true, composer6, 100663296, 0);
                    composer3 = composer6;
                    composer3.endReplaceGroup();
                    composer3.endReplaceGroup();
                } else {
                    if (!(uiObject instanceof UiObject.Idl)) {
                        composer3.startReplaceGroup(-873692351);
                        composer3.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer3.startReplaceGroup(-873681732);
                    ImmutableList immutableList6 = extensions2.toImmutableList(((StandardScreenContentDto) ((UiObject.Idl) uiObject).getValue()).getFooter());
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue10 = composer3.rememberedValue();
                    if (objRememberedValue10 == companion6.getEmpty()) {
                        objRememberedValue10 = ListScreen7.INSTANCE;
                        composer3.updateRememberedValue(objRememberedValue10);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion2, f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), i6, null);
                    composer3.startReplaceGroup(40010095);
                    Composer composer7 = composer3;
                    SduiColumnsIdl.SduiColumnIdl(immutableList6, (Function1) ((KFunction) objRememberedValue10), MicrogramAction.class, modifierM5144paddingVpY3zN4$default2, null, null, HorizontalPadding.Default, arrangement.getTop(), companion4.getStart(), true, composer7, 805306416, 0);
                    composer3 = composer7;
                    composer3.endReplaceGroup();
                    composer3.endReplaceGroup();
                }
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.microgram.sdui.ListScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ListScreen.Content$lambda$22(uiObject, routerMessage5, scrollRequest, shareScreenshotRequest, function0, function02, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$21$lambda$6$lambda$5(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Content$lambda$21$lambda$19$lambda$12$lambda$11(LazyListState lazyListState) {
        return !lazyListState.getCanScrollForward();
    }

    private static final void Content$lambda$21$lambda$19$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }
}
