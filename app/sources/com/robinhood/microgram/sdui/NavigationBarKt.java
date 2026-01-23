package com.robinhood.microgram.sdui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.microgramsdui.Colors4;
import com.robinhood.android.shared.serverui.utils.AnyButton;
import com.robinhood.android.shared.serverui.utils.AnyThemedColor;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.ButtonIcon;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import microgram.p507ui.p508v1.NavigationBarConfigurationDto;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: NavigationBar.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003j\u0002`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003j\u0004\u0018\u0001`\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00012(\u0010\u0011\u001a$\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00150\u0003j\b\u0012\u0004\u0012\u00020\u0014`\u00160\u0012H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"NavigationBar", "", "screen", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/AnyScreen;", "onBackClick", "Lkotlin/Function0;", "transparent", "", "navConfig", "Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;", "Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "Lcom/robinhood/microgram/sdui/AnyNavigationBarConfiguration;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Lkotlin/jvm/functions/Function0;ZLcom/robinhood/android/shared/serverui/utils/UiObject;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Actions", "actions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "Lrh_server_driven_ui/v1/ButtonDto;", "Lcom/robinhood/android/shared/serverui/utils/AnyButton;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)V", "feature-microgram-sdui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class NavigationBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Actions$lambda$4(ImmutableList immutableList, int i, Composer composer, int i2) {
        Actions(immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBar$lambda$1(UiObject uiObject, Function0 function0, boolean z, UiObject uiObject2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NavigationBar(uiObject, function0, z, uiObject2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationBar(final UiObject<?, ?> screen, final Function0<Unit> onBackClick, final boolean z, final UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> uiObject, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(42918880);
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
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(uiObject) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(42918880, i3, -1, "com.robinhood.microgram.sdui.NavigationBar (NavigationBar.kt:40)");
                }
                final ImmutableList<UiObject<Button<MicrogramAction>, ButtonDto>> immutableListLeftButtons = uiObject == null ? StandardScreen4.leftButtons(uiObject) : null;
                final boolean z3 = (Intrinsics.areEqual(AnyScreen.getHidesBackButton(screen), Boolean.TRUE) && (immutableListLeftButtons == null || immutableListLeftButtons.isEmpty())) ? false : true;
                final ProgressBar progressBar = uiObject == null ? StandardScreen4.getProgressBar(uiObject) : null;
                composerStartRestartGroup.startReplaceGroup(-1704582840);
                ComposableLambda composableLambdaRememberComposableLambda = progressBar != null ? ComposableLambda3.rememberComposableLambda(-320619013, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.NavigationBarKt$NavigationBar$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                        invoke(boxScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope let, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(let, "$this$let");
                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-320619013, i5, -1, "com.robinhood.microgram.sdui.NavigationBar.<anonymous>.<anonymous> (NavigationBar.kt:73)");
                        }
                        BentoProgressBar2.m20698BentoProgressBarjB83MbM(progressBar.getProgress(), null, progressBar.getNumberOfSegments(), 0L, 0L, false, composer3, 0, 58);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54) : null;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1297205971, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.NavigationBarKt.NavigationBar.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1297205971, i5, -1, "com.robinhood.microgram.sdui.NavigationBar.<anonymous> (NavigationBar.kt:46)");
                        }
                        String title = AnyScreen.getTitle(screen);
                        if (title != null) {
                            boolean z4 = z3;
                            composer3.startReplaceGroup(1074424983);
                            Modifier modifierM5146paddingqDBjuR0$default = z4 ? PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null) : Modifier.INSTANCE;
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextL(), composer3, 0, 0, 8188);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifier2, ComposableLambda3.rememberComposableLambda(-561143041, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.NavigationBarKt.NavigationBar.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-561143041, i5, -1, "com.robinhood.microgram.sdui.NavigationBar.<anonymous> (NavigationBar.kt:60)");
                        }
                        if (z3) {
                            ImmutableList<UiObject<Button<MicrogramAction>, ButtonDto>> immutableList = immutableListLeftButtons;
                            if (immutableList == null || immutableList.isEmpty()) {
                                composer3.startReplaceGroup(-999105533);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-999417858);
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                ImmutableList<UiObject<Button<MicrogramAction>, ButtonDto>> immutableList2 = immutableListLeftButtons;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer3, 0);
                                composer3.startReplaceGroup(403296206);
                                if (!immutableList2.isEmpty()) {
                                    NavigationBarKt.Actions(extensions2.toPersistentList(immutableList2), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                composer3.endReplaceGroup();
                            }
                        } else {
                            composer3.startReplaceGroup(-999579926);
                            UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> uiObject2 = uiObject;
                            UiObject<ThemedColor, ThemedColorDto> tintColor = uiObject2 != null ? StandardScreen4.getTintColor(uiObject2) : null;
                            composer3.startReplaceGroup(1907420911);
                            Color composeColor = tintColor != null ? Colors4.toComposeColor(tintColor, composer3, 0) : null;
                            composer3.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, composeColor, onBackClick, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 3);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1247358462, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.NavigationBarKt.NavigationBar.4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1247358462, i5, -1, "com.robinhood.microgram.sdui.NavigationBar.<anonymous> (NavigationBar.kt:81)");
                        }
                        UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> uiObject2 = uiObject;
                        if (uiObject2 != null) {
                            NavigationBarKt.Actions(StandardScreen4.rightButtons(uiObject2), composer3, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda, z2, false, null, null, 0L, null, composer2, ((i3 >> 9) & 112) | 3462 | ((i3 << 9) & 458752), 0, 1984);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.microgram.sdui.NavigationBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationBarKt.NavigationBar$lambda$1(screen, onBackClick, z, uiObject, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (uiObject == null) {
            }
            if (Intrinsics.areEqual(AnyScreen.getHidesBackButton(screen), Boolean.TRUE)) {
                if (uiObject == null) {
                }
                composerStartRestartGroup.startReplaceGroup(-1704582840);
                ComposableLambda composableLambdaRememberComposableLambda2 = progressBar != null ? ComposableLambda3.rememberComposableLambda(-320619013, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.NavigationBarKt$NavigationBar$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                        invoke(boxScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope let, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(let, "$this$let");
                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-320619013, i5, -1, "com.robinhood.microgram.sdui.NavigationBar.<anonymous>.<anonymous> (NavigationBar.kt:73)");
                        }
                        BentoProgressBar2.m20698BentoProgressBarjB83MbM(progressBar.getProgress(), null, progressBar.getNumberOfSegments(), 0L, 0L, false, composer3, 0, 58);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54) : null;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1297205971, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.NavigationBarKt.NavigationBar.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1297205971, i5, -1, "com.robinhood.microgram.sdui.NavigationBar.<anonymous> (NavigationBar.kt:46)");
                        }
                        String title = AnyScreen.getTitle(screen);
                        if (title != null) {
                            boolean z4 = z3;
                            composer3.startReplaceGroup(1074424983);
                            Modifier modifierM5146paddingqDBjuR0$default = z4 ? PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null) : Modifier.INSTANCE;
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextL(), composer3, 0, 0, 8188);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifier2, ComposableLambda3.rememberComposableLambda(-561143041, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.NavigationBarKt.NavigationBar.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-561143041, i5, -1, "com.robinhood.microgram.sdui.NavigationBar.<anonymous> (NavigationBar.kt:60)");
                        }
                        if (z3) {
                            ImmutableList<UiObject<Button<MicrogramAction>, ButtonDto>> immutableList = immutableListLeftButtons;
                            if (immutableList == null || immutableList.isEmpty()) {
                                composer3.startReplaceGroup(-999105533);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-999417858);
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                ImmutableList<UiObject<Button<MicrogramAction>, ButtonDto>> immutableList2 = immutableListLeftButtons;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer3, 0);
                                composer3.startReplaceGroup(403296206);
                                if (!immutableList2.isEmpty()) {
                                    NavigationBarKt.Actions(extensions2.toPersistentList(immutableList2), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                composer3.endReplaceGroup();
                            }
                        } else {
                            composer3.startReplaceGroup(-999579926);
                            UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> uiObject2 = uiObject;
                            UiObject<ThemedColor, ThemedColorDto> tintColor = uiObject2 != null ? StandardScreen4.getTintColor(uiObject2) : null;
                            composer3.startReplaceGroup(1907420911);
                            Color composeColor = tintColor != null ? Colors4.toComposeColor(tintColor, composer3, 0) : null;
                            composer3.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, composeColor, onBackClick, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 3);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1247358462, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.NavigationBarKt.NavigationBar.4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1247358462, i5, -1, "com.robinhood.microgram.sdui.NavigationBar.<anonymous> (NavigationBar.kt:81)");
                        }
                        UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> uiObject2 = uiObject;
                        if (uiObject2 != null) {
                            NavigationBarKt.Actions(StandardScreen4.rightButtons(uiObject2), composer3, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda2, z2, false, null, null, 0L, null, composer2, ((i3 >> 9) & 112) | 3462 | ((i3 << 9) & 458752), 0, 1984);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Actions(final ImmutableList<? extends UiObject<Button<MicrogramAction>, ButtonDto>> immutableList, Composer composer, final int i) {
        int i2;
        Iterator<? extends UiObject<Button<MicrogramAction>, ButtonDto>> it;
        int i3;
        boolean z;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1102055663);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1102055663, i2, -1, "com.robinhood.microgram.sdui.Actions (NavigationBar.kt:89)");
            }
            Iterator<? extends UiObject<Button<MicrogramAction>, ButtonDto>> it2 = immutableList.iterator();
            int i5 = 0;
            int i6 = 0;
            while (it2.hasNext()) {
                UiObject<Button<MicrogramAction>, ButtonDto> next = it2.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                UiObject<Button<MicrogramAction>, ButtonDto> uiObject = next;
                SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, i5);
                UiObject action = AnyButton.getAction(uiObject);
                Function0<Unit> function0Handling = SduiActionHandler3.handling(sduiActionHandlerCurrentActionHandler, action != null ? MicrogramAction2.toMicrogramAction((UiObject<MicrogramAction, ActionDto>) action) : null);
                boolean z2 = true;
                if (!StringsKt.isBlank(AnyButton.getLabel(uiObject))) {
                    composerStartRestartGroup.startReplaceGroup(-1755270671);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    it = it2;
                    i3 = i6;
                    BentoText2.m20747BentoText38GnDrw(AnyButton.getLabel(uiObject), ClickableKt.m4891clickableO2vRcR0$default(companion, (InteractionSource3) objRememberedValue, RippleKt.m5937rippleH2RKhps$default(false, 0.0f, 0L, 6, null), false, null, Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c()), function0Handling, 12, null), null, null, FontWeight.INSTANCE.getSemiBold(), null, null, 0, false, 0, 0, null, 0, null, composer2, 24576, 0, 16364);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    it = it2;
                    i3 = i6;
                    composerStartRestartGroup.startReplaceGroup(-1754826286);
                    UiObject<ButtonIcon, ButtonDto.ButtonIconDto> icon = AnyButton.getIcon(uiObject);
                    BentoIcon4 bentoIcon = icon != null ? SduiIcon2.toBentoIcon(icon) : null;
                    if (bentoIcon != null) {
                        Composer composer3 = composerStartRestartGroup;
                        BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, AnyButton.getLabel(uiObject), AnyThemedColor.m18895toComposeColorDefaultediJQMabo(AnyButton.getTintColor(uiObject), 0L, composerStartRestartGroup, 0, 1), null, function0Handling, false, composer3, BentoIcon4.$stable, 40);
                        composerStartRestartGroup = composer3;
                        z = true;
                    } else {
                        z = false;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    z2 = z;
                }
                composerStartRestartGroup.startReplaceGroup(1781466634);
                if (!z2 || i3 == immutableList.size()) {
                    i4 = 0;
                } else {
                    i4 = 0;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                it2 = it;
                i5 = i4;
                i6 = i7;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.microgram.sdui.NavigationBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NavigationBarKt.Actions$lambda$4(immutableList, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
