package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketMatchOverviewCardWithChannels2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BracketMatchOverviewCardWithChannels.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0017\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0017\u0010)\u001a\u00020\u00012\b\b\u0001\u0010*\u001a\u00020+H\u0003¢\u0006\u0002\u0010,\"\u0016\u0010\u0019\u001a\u00020\u001aX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c\"\u0016\u0010\u001e\u001a\u00020\u001aX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001c\"\u0010\u0010 \u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d\"\u0010\u0010!\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d\"\u0010\u0010\"\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d\"\u0016\u0010#\u001a\u00020\u001aX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001c\"\u0016\u0010%\u001a\u00020\u001aX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b&\u0010\u001c\"\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"BracketMatchOverviewCardWithChannels", "", "displayInChannel", "", "displayOutChannelDirection", "Lcom/robinhood/android/futures/eventbrackets/ui/ChannelDirection;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;", "inChannelAlpha", "", "onCardClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLcom/robinhood/android/futures/eventbrackets/ui/ChannelDirection;Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;FLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "outChannelPath", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/draw/CacheDrawScope;", "startY", "size", "Landroidx/compose/ui/geometry/Size;", "outChannelPath-Ug5Nnss", "(Landroidx/compose/ui/draw/CacheDrawScope;FLcom/robinhood/android/futures/eventbrackets/ui/ChannelDirection;J)Landroidx/compose/ui/graphics/Path;", "inChannelPath", "inChannelY", "BracketCardHeight", "Landroidx/compose/ui/unit/Dp;", "getBracketCardHeight", "()F", "F", "BracketCardWidth", "getBracketCardWidth", "HorizontalOutChannelLength", "HorizontalInChannelLength", "ChannelOffsetFromTop", "TotalCardWidthWithChannels", "getTotalCardWidthWithChannels", "ChannelWidth", "getChannelWidth", "ChannelPathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "PreviewBracketMatchOverviewCardWithChannels", "params", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchOverviewCardWithChannelsPreviewParameterProvider$PreviewData;", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchOverviewCardWithChannelsPreviewParameterProvider$PreviewData;Landroidx/compose/runtime/Composer;I)V", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BracketMatchOverviewCardWithChannels {
    private static final float BracketCardHeight = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
    private static final float BracketCardWidth;
    private static final float ChannelOffsetFromTop;
    private static final PathEffect ChannelPathEffect;
    private static final float ChannelWidth;
    private static final float HorizontalInChannelLength;
    private static final float HorizontalOutChannelLength;
    private static final float TotalCardWidthWithChannels;

    /* compiled from: BracketMatchOverviewCardWithChannels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BracketMatchOverviewCardWithChannels3.values().length];
            try {
                iArr[BracketMatchOverviewCardWithChannels3.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BracketMatchOverviewCardWithChannels3.f4154UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BracketMatchOverviewCardWithChannels$lambda$4(boolean z, BracketMatchOverviewCardWithChannels3 bracketMatchOverviewCardWithChannels3, BracketGameOverviewCardData bracketGameOverviewCardData, float f, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BracketMatchOverviewCardWithChannels(z, bracketMatchOverviewCardWithChannels3, bracketGameOverviewCardData, f, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBracketMatchOverviewCardWithChannels$lambda$7(BracketMatchOverviewCardWithChannels2.PreviewData previewData, int i, Composer composer, int i2) {
        PreviewBracketMatchOverviewCardWithChannels(previewData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BracketMatchOverviewCardWithChannels(final boolean z, final BracketMatchOverviewCardWithChannels3 bracketMatchOverviewCardWithChannels3, final BracketGameOverviewCardData data, final float f, final Function0<Unit> onCardClick, Modifier modifier, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        final float f2;
        Modifier modifier2;
        final long borderColor;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(319390559);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(bracketMatchOverviewCardWithChannels3 == null ? -1 : bracketMatchOverviewCardWithChannels3.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(data) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardClick) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(319390559, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannels (BracketMatchOverviewCardWithChannels.kt:37)");
                }
                borderColor = BracketStyle.INSTANCE.getBorderColor(composerStartRestartGroup, 6);
                Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(modifier2, TotalCardWidthWithChannels, BracketCardHeight);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = ((i3 & 112) != 32) | ((i3 & 14) != 4) | composerStartRestartGroup.changed(borderColor) | ((i3 & 7168) == 2048);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BracketMatchOverviewCardWithChannels.BracketMatchOverviewCardWithChannels$lambda$2$lambda$1(bracketMatchOverviewCardWithChannels3, z2, borderColor, f2, (CacheDrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierDrawWithCache = DrawModifierKt.drawWithCache(modifierM5171sizeVpY3zN4, (Function1) objRememberedValue);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawWithCache);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BracketMatchOverviewCardKt.BracketMatchOverviewCard(data, onCardClick, OffsetKt.m5125offsetVpY3zN4$default(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BracketCardWidth), HorizontalInChannelLength, 0.0f, 2, null), composerStartRestartGroup, ((i3 >> 9) & 112) | ((i3 >> 6) & 14) | 384, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BracketMatchOverviewCardWithChannels.BracketMatchOverviewCardWithChannels$lambda$4(z, bracketMatchOverviewCardWithChannels3, data, f, onCardClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            borderColor = BracketStyle.INSTANCE.getBorderColor(composerStartRestartGroup, 6);
            Modifier modifierM5171sizeVpY3zN42 = SizeKt.m5171sizeVpY3zN4(modifier2, TotalCardWidthWithChannels, BracketCardHeight);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChanged = ((i3 & 112) != 32) | ((i3 & 14) != 4) | composerStartRestartGroup.changed(borderColor) | ((i3 & 7168) == 2048);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                Function1 function12 = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BracketMatchOverviewCardWithChannels.BracketMatchOverviewCardWithChannels$lambda$2$lambda$1(bracketMatchOverviewCardWithChannels3, z2, borderColor, f2, (CacheDrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue = function12;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierDrawWithCache2 = DrawModifierKt.drawWithCache(modifierM5171sizeVpY3zN42, (Function1) objRememberedValue);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawWithCache2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    BracketMatchOverviewCardKt.BracketMatchOverviewCard(data, onCardClick, OffsetKt.m5125offsetVpY3zN4$default(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BracketCardWidth), HorizontalInChannelLength, 0.0f, 2, null), composerStartRestartGroup, ((i3 >> 9) & 112) | ((i3 >> 6) & 14) | 384, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult BracketMatchOverviewCardWithChannels$lambda$2$lambda$1(BracketMatchOverviewCardWithChannels3 bracketMatchOverviewCardWithChannels3, boolean z, final long j, final float f, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float fMo5016toPx0680j_4 = drawWithCache.mo5016toPx0680j_4(ChannelOffsetFromTop);
        final Path pathM14634outChannelPathUg5Nnss = m14634outChannelPathUg5Nnss(drawWithCache, fMo5016toPx0680j_4, bracketMatchOverviewCardWithChannels3, drawWithCache.m6459getSizeNHjbRc());
        final Path pathInChannelPath = inChannelPath(drawWithCache, fMo5016toPx0680j_4, z);
        final Stroke stroke = new Stroke(drawWithCache.mo5016toPx0680j_4(ChannelWidth), 0.0f, 0, 0, ChannelPathEffect, 14, null);
        return drawWithCache.onDrawBehind(new Function1() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BracketMatchOverviewCardWithChannels.BracketMatchOverviewCardWithChannels$lambda$2$lambda$1$lambda$0(pathM14634outChannelPathUg5Nnss, j, stroke, pathInChannelPath, f, (DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BracketMatchOverviewCardWithChannels$lambda$2$lambda$1$lambda$0(Path path, long j, Stroke stroke, Path path2, float f, DrawScope onDrawBehind) {
        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
        DrawScope.m6955drawPathLG529CI$default(onDrawBehind, path, j, 0.0f, stroke, null, 0, 52, null);
        DrawScope.m6955drawPathLG529CI$default(onDrawBehind, path2, Color.m6705copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, stroke, null, 0, 52, null);
        return Unit.INSTANCE;
    }

    /* compiled from: BracketMatchOverviewCardWithChannels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsKt$PreviewBracketMatchOverviewCardWithChannels$1 */
    static final class C172081 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ BracketMatchOverviewCardWithChannels2.PreviewData $params;

        C172081(BracketMatchOverviewCardWithChannels2.PreviewData previewData) {
            this.$params = previewData;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1201588495, i, -1, "com.robinhood.android.futures.eventbrackets.ui.PreviewBracketMatchOverviewCardWithChannels.<anonymous> (BracketMatchOverviewCardWithChannels.kt:139)");
            }
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(BracketMatchOverviewCardWithChannels.getTotalCardWidthWithChannels() + C2002Dp.m7995constructorimpl(2)));
            Alignment center = Alignment.INSTANCE.getCenter();
            BracketMatchOverviewCardWithChannels2.PreviewData previewData = this.$params;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5174width3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean displayInChannel = previewData.getDisplayInChannel();
            BracketMatchOverviewCardWithChannels3 displayOutChannelDirection = previewData.getDisplayOutChannelDirection();
            BracketGameOverviewCardData card1 = SampleBracketData.getCard1();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsKt$PreviewBracketMatchOverviewCardWithChannels$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BracketMatchOverviewCardWithChannels.BracketMatchOverviewCardWithChannels(displayInChannel, displayOutChannelDirection, card1, 1.0f, (Function0) objRememberedValue, null, composer, 28032, 32);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: outChannelPath-Ug5Nnss, reason: not valid java name */
    private static final Path m14634outChannelPathUg5Nnss(CacheDrawScope cacheDrawScope, float f, BracketMatchOverviewCardWithChannels3 bracketMatchOverviewCardWithChannels3, long j) {
        float fIntBitsToFloat;
        float fMo5016toPx0680j_4 = cacheDrawScope.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(HorizontalInChannelLength + BracketCardWidth));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        int i = bracketMatchOverviewCardWithChannels3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bracketMatchOverviewCardWithChannels3.ordinal()];
        if (i == -1) {
            return AndroidPath_androidKt.Path();
        }
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fIntBitsToFloat = 0.0f;
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(fMo5016toPx0680j_4, f);
        Path.lineTo(fIntBitsToFloat2, f);
        Path.lineTo(fIntBitsToFloat2, fIntBitsToFloat);
        return Path;
    }

    private static final Path inChannelPath(CacheDrawScope cacheDrawScope, float f, boolean z) {
        float fMo5016toPx0680j_4 = cacheDrawScope.mo5016toPx0680j_4(HorizontalInChannelLength);
        Path Path = AndroidPath_androidKt.Path();
        if (z) {
            Path.moveTo(0.0f, f);
            Path.lineTo(fMo5016toPx0680j_4, f);
        }
        return Path;
    }

    public static final float getBracketCardHeight() {
        return BracketCardHeight;
    }

    public static final float getBracketCardWidth() {
        return BracketCardWidth;
    }

    public static final float getTotalCardWidthWithChannels() {
        return TotalCardWidthWithChannels;
    }

    public static final float getChannelWidth() {
        return ChannelWidth;
    }

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        BracketCardWidth = fM7995constructorimpl;
        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(40);
        HorizontalOutChannelLength = fM7995constructorimpl2;
        float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(24);
        HorizontalInChannelLength = fM7995constructorimpl3;
        ChannelOffsetFromTop = C2002Dp.m7995constructorimpl(63);
        TotalCardWidthWithChannels = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(fM7995constructorimpl3 + fM7995constructorimpl) + fM7995constructorimpl2);
        ChannelWidth = C2002Dp.m7995constructorimpl(1);
        ChannelPathEffect = PathEffect.INSTANCE.cornerPathEffect(10.0f);
    }

    private static final void PreviewBracketMatchOverviewCardWithChannels(final BracketMatchOverviewCardWithChannels2.PreviewData previewData, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1626221625);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(previewData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1626221625, i2, -1, "com.robinhood.android.futures.eventbrackets.ui.PreviewBracketMatchOverviewCardWithChannels (BracketMatchOverviewCardWithChannels.kt:137)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1201588495, true, new C172081(previewData), composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BracketMatchOverviewCardWithChannels.PreviewBracketMatchOverviewCardWithChannels$lambda$7(previewData, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
