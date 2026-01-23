package com.robinhood.compose.bento.component.cards;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.compose.C11917R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.cards.BentoCommunicationCard;
import com.robinhood.compose.bento.component.cards.BentoCommunicationCard7;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoCommunicationCard.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"BentoCommunicationCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "type", "Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$Type;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "ctaText", "", PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "onClick", "Lkotlin/Function0;", "onDismiss", "dismissIconType", "Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$DismissIconType;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$Type;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$DismissIconType;Landroidx/compose/runtime/Composer;II)V", "BentoCommunicationCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoCommunicationCard {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCommunicationCard$lambda$0(Modifier modifier, BentoCommunicationCard7.Type type2, AnnotatedString annotatedString, String str, Painter painter, Function0 function0, Function0 function02, BentoCommunicationCard7.DismissIconType dismissIconType, int i, int i2, Composer composer, int i3) {
        BentoCommunicationCard(modifier, type2, annotatedString, str, painter, function0, function02, dismissIconType, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCommunicationCardPreview$lambda$1(int i, Composer composer, int i2) {
        BentoCommunicationCardPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoCommunicationCard(Modifier modifier, BentoCommunicationCard7.Type type2, final AnnotatedString text, final String ctaText, final Painter painter, final Function0<Unit> onClick, final Function0<Unit> onDismiss, BentoCommunicationCard7.DismissIconType dismissIconType, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        BentoCommunicationCard7.Type type3;
        int i4;
        final BentoCommunicationCard7.Type type4;
        long jM21751getBackgroundColor0d7_KjU;
        Composer composer2;
        final BentoCommunicationCard7.DismissIconType dismissIconType2;
        final BentoCommunicationCard7.Type type5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1075101490);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                type3 = type2;
                i3 |= composerStartRestartGroup.changed(type3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(text) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(ctaText) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(painter) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onClick) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 1048576 : 524288;
                }
                i4 = i2 & 128;
                if (i4 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(dismissIconType == null ? -1 : dismissIconType.ordinal()) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    type4 = i6 == 0 ? BentoCommunicationCard7.Type.Standard.INSTANCE : type3;
                    BentoCommunicationCard7.DismissIconType dismissIconType3 = i4 == 0 ? BentoCommunicationCard7.DismissIconType.Light : dismissIconType;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1075101490, i3, -1, "com.robinhood.compose.bento.component.cards.BentoCommunicationCard (BentoCommunicationCard.kt:58)");
                    }
                    final CommunicationCardStyle communicationCard = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getCommunicationCard(composerStartRestartGroup, 0);
                    Modifier modifier4 = modifier2;
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, onClick, 7, null), communicationCard.getSizing().m21759getHeightD9Ej5fM());
                    Shape shape = communicationCard.getShape();
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    if (!(type4 instanceof BentoCommunicationCard7.Type.BrandMoment)) {
                        jM21751getBackgroundColor0d7_KjU = ((BentoCommunicationCard7.Type.BrandMoment) type4).m20878getBackgroundColor0d7_KjU();
                    } else {
                        if (!Intrinsics.areEqual(type4, BentoCommunicationCard7.Type.Standard.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jM21751getBackgroundColor0d7_KjU = communicationCard.getColors().m21751getBackgroundColor0d7_KjU();
                    }
                    long j = jM21751getBackgroundColor0d7_KjU;
                    int i7 = CardDefaults.$stable;
                    composer2 = composerStartRestartGroup;
                    final BentoCommunicationCard7.DismissIconType dismissIconType4 = dismissIconType3;
                    BentoCommunicationCard7.Type type6 = type4;
                    CardKt.Card(modifierM5156height3ABfNKs, shape, cardDefaults.m5729cardColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i7 << 12, 14), cardDefaults.m5730cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, i7 << 18, 63), communicationCard.getBorder(), ComposableLambda3.rememberComposableLambda(-273130204, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt.BentoCommunicationCard.1

                        /* compiled from: BentoCommunicationCard.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[BentoCommunicationCard7.DismissIconType.values().length];
                                try {
                                    iArr[BentoCommunicationCard7.DismissIconType.Dark.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[BentoCommunicationCard7.DismissIconType.Light.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                            invoke(column5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 Card, Composer composer3, int i8) {
                            final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                            final SnapshotState snapshotState;
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-273130204, i8, -1, "com.robinhood.compose.bento.component.cards.BentoCommunicationCard.<anonymous> (BentoCommunicationCard.kt:74)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Painter painter2 = painter;
                            final CommunicationCardStyle communicationCardStyle = communicationCard;
                            final Function0<Unit> function0 = onDismiss;
                            final BentoCommunicationCard7.Type type7 = type4;
                            final AnnotatedString annotatedString = text;
                            final Function0<Unit> function02 = onClick;
                            final String str = ctaText;
                            final BentoCommunicationCard7.DismissIconType dismissIconType5 = dismissIconType4;
                            composer3.startReplaceGroup(-1003410150);
                            composer3.startReplaceGroup(212064437);
                            composer3.endReplaceGroup();
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            Object objRememberedValue = composer3.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new Measurer2(density);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ConstraintLayoutScope();
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
                            Object objRememberedValue5 = composer3.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                            boolean zChangedInstance = composer3.changedInstance(measurer2);
                            final int i9 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                            boolean zChanged = zChangedInstance | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                            Object objRememberedValue6 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$2
                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i10);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i10);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i10);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i10);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    /* renamed from: measure-3p2s80s */
                                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j2) {
                                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        snapshotState3.getValue();
                                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j2, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i9);
                                        snapshotState2.getValue();
                                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                        final Measurer2 measurer22 = measurer2;
                                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                measurer22.performLayout(placementScope, list, linkedHashMap);
                                            }
                                        }, 4, null);
                                    }
                                };
                                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                snapshotState = snapshotState2;
                                composer3.updateRememberedValue(objRememberedValue6);
                            } else {
                                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                snapshotState = snapshotState2;
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                            Object objRememberedValue7 = composer3.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                        constraintSetForInlineDsl.setKnownDirty(true);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue7);
                            }
                            final Function0 function03 = (Function0) objRememberedValue7;
                            boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                            Object objRememberedValue8 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue8);
                            }
                            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i10) {
                                    long jM21752getDarkDismissIconTint0d7_KjU;
                                    long jM22031getColor0d7_KjU;
                                    TextStyle standardTextStyle;
                                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1200550679, i10, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                    }
                                    snapshotState3.setValue(Unit.INSTANCE);
                                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                    constraintLayoutScope.reset();
                                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                    composer4.startReplaceGroup(430709749);
                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = painter2 != null ? constraintLayoutScope2.createRef() : null;
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = constraintLayoutBaseScope4CreateRef != null ? ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4CreateRef, constraintLayoutBaseScope4Component3}, 0.0f, 2, null) : ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3}, 0.0f, 2, null);
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope2.createGuidelineFromEnd(painter2 != null ? 0.3f : 0.0f);
                                    String strStringResource = StringResources_androidKt.stringResource(C11917R.string.content_description_dismiss, composer4, 0);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(SizeKt.m5169size3ABfNKs(companion2, communicationCardStyle.getSizing().m21758getDismissTapTargetSizeD9Ej5fM()), false, null, null, function0, 7, null);
                                    composer4.startReplaceGroup(1849434622);
                                    Object objRememberedValue9 = composer4.rememberedValue();
                                    Composer.Companion companion3 = Composer.INSTANCE;
                                    if (objRememberedValue9 == companion3.getEmpty()) {
                                        objRememberedValue9 = BentoCommunicationCard2.INSTANCE;
                                        composer4.updateRememberedValue(objRememberedValue9);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM4893clickableXHw0xAI$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue9);
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer4.changed(strStringResource);
                                    Object objRememberedValue10 = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue10 == companion3.getEmpty()) {
                                        objRememberedValue10 = new BentoCommunicationCard3(strStringResource);
                                        composer4.updateRememberedValue(objRememberedValue10);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierZIndex = ZIndexModifier2.zIndex(SemanticsModifier6.semantics(modifierConstrainAs, true, (Function1) objRememberedValue10), 1.0f);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierZIndex);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24);
                                    int i11 = BentoCommunicationCard.C325591.WhenMappings.$EnumSwitchMapping$0[dismissIconType5.ordinal()];
                                    if (i11 == 1) {
                                        jM21752getDarkDismissIconTint0d7_KjU = communicationCardStyle.getColors().m21752getDarkDismissIconTint0d7_KjU();
                                    } else {
                                        if (i11 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        jM21752getDarkDismissIconTint0d7_KjU = communicationCardStyle.getColors().m21753getLightDismissIconTint0d7_KjU();
                                    }
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default;
                                    BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21752getDarkDismissIconTint0d7_KjU, null, null, false, composer4, 48, 56);
                                    composer4.endNode();
                                    composer4.startReplaceGroup(-817345780);
                                    if (painter2 != null && constraintLayoutBaseScope4CreateRef != null) {
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChanged3 = composer4.changed(verticalAnchorCreateGuidelineFromEnd);
                                        Object objRememberedValue11 = composer4.rememberedValue();
                                        if (zChanged3 || objRememberedValue11 == companion3.getEmpty()) {
                                            objRememberedValue11 = new BentoCommunicationCard4(verticalAnchorCreateGuidelineFromEnd);
                                            composer4.updateRememberedValue(objRememberedValue11);
                                        }
                                        composer4.endReplaceGroup();
                                        ImageKt.Image(painter2, (String) null, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4CreateRef, (Function1) objRememberedValue11), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer4, 24624, 104);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoCommunicationCard7.Type type8 = type7;
                                    composer4.startReplaceGroup(-817326302);
                                    if (type8 instanceof BentoCommunicationCard7.Type.BrandMoment) {
                                        jM22031getColor0d7_KjU = ((BentoCommunicationCard7.Type.BrandMoment) type7).m20879getTextColor0d7_KjU();
                                    } else {
                                        if (!Intrinsics.areEqual(type8, BentoCommunicationCard7.Type.Standard.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        jM22031getColor0d7_KjU = ((Styles) composer4.consume(Styles2.getLocalStyles())).getText(composer4, 0).m22031getColor0d7_KjU();
                                    }
                                    long j2 = jM22031getColor0d7_KjU;
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance3 = composer4.changedInstance(communicationCardStyle) | composer4.changed(constraintLayoutBaseScope4Component2) | composer4.changed(verticalAnchor) | composer4.changedInstance(painter2);
                                    Object objRememberedValue12 = composer4.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue12 == companion3.getEmpty()) {
                                        objRememberedValue12 = new BentoCommunicationCard5(communicationCardStyle, constraintLayoutBaseScope4Component2, verticalAnchor, painter2);
                                        composer4.updateRememberedValue(objRememberedValue12);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue12);
                                    BentoCommunicationCard7.Type type9 = type7;
                                    if (type9 instanceof BentoCommunicationCard7.Type.BrandMoment) {
                                        standardTextStyle = communicationCardStyle.getTypography().getBrandMomentTextStyle();
                                    } else {
                                        if (!Intrinsics.areEqual(type9, BentoCommunicationCard7.Type.Standard.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        standardTextStyle = communicationCardStyle.getTypography().getStandardTextStyle();
                                    }
                                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierConstrainAs2, Color.m6701boximpl(j2), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, communicationCardStyle.getTypography().getMaxLines(), 0, null, null, standardTextStyle, composer4, 12582912, 0, 7544);
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance4 = composer4.changedInstance(communicationCardStyle);
                                    Object objRememberedValue13 = composer4.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue13 == companion3.getEmpty()) {
                                        objRememberedValue13 = new BentoCommunicationCard6(communicationCardStyle);
                                        composer4.updateRememberedValue(objRememberedValue13);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoTextButton2.m20715BentoTextButtonPIknLig(function02, str, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue13), new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing), null, false, Color.m6701boximpl(j2), composer4, 0, 48);
                                    composer4.endReplaceGroup();
                                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                        EffectsKt.SideEffect(function03, composer4, 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), measurePolicy, composer3, 48, 0);
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 196608, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    dismissIconType2 = dismissIconType4;
                    type5 = type6;
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    type5 = type3;
                    dismissIconType2 = dismissIconType;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoCommunicationCard.BentoCommunicationCard$lambda$0(modifier3, type5, text, ctaText, painter, onClick, onDismiss, dismissIconType2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            i4 = i2 & 128;
            if (i4 != 0) {
            }
            if ((4793491 & i3) != 4793490) {
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final CommunicationCardStyle communicationCard2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getCommunicationCard(composerStartRestartGroup, 0);
                Modifier modifier42 = modifier2;
                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, onClick, 7, null), communicationCard2.getSizing().m21759getHeightD9Ej5fM());
                Shape shape2 = communicationCard2.getShape();
                CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                if (!(type4 instanceof BentoCommunicationCard7.Type.BrandMoment)) {
                }
                long j2 = jM21751getBackgroundColor0d7_KjU;
                int i72 = CardDefaults.$stable;
                composer2 = composerStartRestartGroup;
                final BentoCommunicationCard7.DismissIconType dismissIconType42 = dismissIconType3;
                BentoCommunicationCard7.Type type62 = type4;
                CardKt.Card(modifierM5156height3ABfNKs2, shape2, cardDefaults2.m5729cardColorsro_MJ88(j2, 0L, 0L, 0L, composerStartRestartGroup, i72 << 12, 14), cardDefaults2.m5730cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, i72 << 18, 63), communicationCard2.getBorder(), ComposableLambda3.rememberComposableLambda(-273130204, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt.BentoCommunicationCard.1

                    /* compiled from: BentoCommunicationCard.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BentoCommunicationCard7.DismissIconType.values().length];
                            try {
                                iArr[BentoCommunicationCard7.DismissIconType.Dark.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[BentoCommunicationCard7.DismissIconType.Light.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 Card, Composer composer3, int i8) {
                        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                        final SnapshotState snapshotState;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i8 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-273130204, i8, -1, "com.robinhood.compose.bento.component.cards.BentoCommunicationCard.<anonymous> (BentoCommunicationCard.kt:74)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Painter painter2 = painter;
                        final CommunicationCardStyle communicationCardStyle = communicationCard2;
                        final Function0 function0 = onDismiss;
                        final BentoCommunicationCard7.Type type7 = type4;
                        final AnnotatedString annotatedString = text;
                        final Function0 function02 = onClick;
                        final String str = ctaText;
                        final BentoCommunicationCard7.DismissIconType dismissIconType5 = dismissIconType42;
                        composer3.startReplaceGroup(-1003410150);
                        composer3.startReplaceGroup(212064437);
                        composer3.endReplaceGroup();
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        Object objRememberedValue = composer3.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Measurer2(density);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        final Measurer2 measurer2 = (Measurer2) objRememberedValue;
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ConstraintLayoutScope();
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                        boolean zChangedInstance = composer3.changedInstance(measurer2);
                        final int i9 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        boolean zChanged = zChangedInstance | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i10);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i10);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i10);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i10);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j22) {
                                    final Map linkedHashMap = new LinkedHashMap();
                                    snapshotState3.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j22, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i9);
                                    snapshotState2.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            snapshotState = snapshotState2;
                            composer3.updateRememberedValue(objRememberedValue6);
                        } else {
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            snapshotState = snapshotState2;
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                    constraintSetForInlineDsl.setKnownDirty(true);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        final Function0 function03 = (Function0) objRememberedValue7;
                        boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                        Object objRememberedValue8 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$4
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue8);
                        }
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i10) {
                                long jM21752getDarkDismissIconTint0d7_KjU;
                                long jM22031getColor0d7_KjU;
                                TextStyle standardTextStyle;
                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i10, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState3.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                composer4.startReplaceGroup(430709749);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = painter2 != null ? constraintLayoutScope2.createRef() : null;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = constraintLayoutBaseScope4CreateRef != null ? ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4CreateRef, constraintLayoutBaseScope4Component3}, 0.0f, 2, null) : ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3}, 0.0f, 2, null);
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope2.createGuidelineFromEnd(painter2 != null ? 0.3f : 0.0f);
                                String strStringResource = StringResources_androidKt.stringResource(C11917R.string.content_description_dismiss, composer4, 0);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(SizeKt.m5169size3ABfNKs(companion2, communicationCardStyle.getSizing().m21758getDismissTapTargetSizeD9Ej5fM()), false, null, null, function0, 7, null);
                                composer4.startReplaceGroup(1849434622);
                                Object objRememberedValue9 = composer4.rememberedValue();
                                Composer.Companion companion3 = Composer.INSTANCE;
                                if (objRememberedValue9 == companion3.getEmpty()) {
                                    objRememberedValue9 = BentoCommunicationCard2.INSTANCE;
                                    composer4.updateRememberedValue(objRememberedValue9);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM4893clickableXHw0xAI$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue9);
                                composer4.startReplaceGroup(5004770);
                                boolean zChanged2 = composer4.changed(strStringResource);
                                Object objRememberedValue10 = composer4.rememberedValue();
                                if (zChanged2 || objRememberedValue10 == companion3.getEmpty()) {
                                    objRememberedValue10 = new BentoCommunicationCard3(strStringResource);
                                    composer4.updateRememberedValue(objRememberedValue10);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierZIndex = ZIndexModifier2.zIndex(SemanticsModifier6.semantics(modifierConstrainAs, true, (Function1) objRememberedValue10), 1.0f);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierZIndex);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24);
                                int i11 = BentoCommunicationCard.C325591.WhenMappings.$EnumSwitchMapping$0[dismissIconType5.ordinal()];
                                if (i11 == 1) {
                                    jM21752getDarkDismissIconTint0d7_KjU = communicationCardStyle.getColors().m21752getDarkDismissIconTint0d7_KjU();
                                } else {
                                    if (i11 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    jM21752getDarkDismissIconTint0d7_KjU = communicationCardStyle.getColors().m21753getLightDismissIconTint0d7_KjU();
                                }
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default;
                                BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21752getDarkDismissIconTint0d7_KjU, null, null, false, composer4, 48, 56);
                                composer4.endNode();
                                composer4.startReplaceGroup(-817345780);
                                if (painter2 != null && constraintLayoutBaseScope4CreateRef != null) {
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChanged3 = composer4.changed(verticalAnchorCreateGuidelineFromEnd);
                                    Object objRememberedValue11 = composer4.rememberedValue();
                                    if (zChanged3 || objRememberedValue11 == companion3.getEmpty()) {
                                        objRememberedValue11 = new BentoCommunicationCard4(verticalAnchorCreateGuidelineFromEnd);
                                        composer4.updateRememberedValue(objRememberedValue11);
                                    }
                                    composer4.endReplaceGroup();
                                    ImageKt.Image(painter2, (String) null, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4CreateRef, (Function1) objRememberedValue11), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer4, 24624, 104);
                                }
                                composer4.endReplaceGroup();
                                BentoCommunicationCard7.Type type8 = type7;
                                composer4.startReplaceGroup(-817326302);
                                if (type8 instanceof BentoCommunicationCard7.Type.BrandMoment) {
                                    jM22031getColor0d7_KjU = ((BentoCommunicationCard7.Type.BrandMoment) type7).m20879getTextColor0d7_KjU();
                                } else {
                                    if (!Intrinsics.areEqual(type8, BentoCommunicationCard7.Type.Standard.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    jM22031getColor0d7_KjU = ((Styles) composer4.consume(Styles2.getLocalStyles())).getText(composer4, 0).m22031getColor0d7_KjU();
                                }
                                long j22 = jM22031getColor0d7_KjU;
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(-1224400529);
                                boolean zChangedInstance3 = composer4.changedInstance(communicationCardStyle) | composer4.changed(constraintLayoutBaseScope4Component2) | composer4.changed(verticalAnchor) | composer4.changedInstance(painter2);
                                Object objRememberedValue12 = composer4.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue12 == companion3.getEmpty()) {
                                    objRememberedValue12 = new BentoCommunicationCard5(communicationCardStyle, constraintLayoutBaseScope4Component2, verticalAnchor, painter2);
                                    composer4.updateRememberedValue(objRememberedValue12);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue12);
                                BentoCommunicationCard7.Type type9 = type7;
                                if (type9 instanceof BentoCommunicationCard7.Type.BrandMoment) {
                                    standardTextStyle = communicationCardStyle.getTypography().getBrandMomentTextStyle();
                                } else {
                                    if (!Intrinsics.areEqual(type9, BentoCommunicationCard7.Type.Standard.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    standardTextStyle = communicationCardStyle.getTypography().getStandardTextStyle();
                                }
                                BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierConstrainAs2, Color.m6701boximpl(j22), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, communicationCardStyle.getTypography().getMaxLines(), 0, null, null, standardTextStyle, composer4, 12582912, 0, 7544);
                                composer4.startReplaceGroup(5004770);
                                boolean zChangedInstance4 = composer4.changedInstance(communicationCardStyle);
                                Object objRememberedValue13 = composer4.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue13 == companion3.getEmpty()) {
                                    objRememberedValue13 = new BentoCommunicationCard6(communicationCardStyle);
                                    composer4.updateRememberedValue(objRememberedValue13);
                                }
                                composer4.endReplaceGroup();
                                BentoTextButton2.m20715BentoTextButtonPIknLig(function02, str, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue13), new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing), null, false, Color.m6701boximpl(j22), composer4, 0, 48);
                                composer4.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                    EffectsKt.SideEffect(function03, composer4, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), measurePolicy, composer3, 48, 0);
                        composer3.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 196608, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                dismissIconType2 = dismissIconType42;
                type5 = type62;
                modifier3 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        type3 = type2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void BentoCommunicationCardPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-44949139);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-44949139, i, -1, "com.robinhood.compose.bento.component.cards.BentoCommunicationCardPreview (BentoCommunicationCard.kt:217)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, BentoCommunicationCard8.INSTANCE.getLambda$949661877$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoCommunicationCard.BentoCommunicationCardPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
