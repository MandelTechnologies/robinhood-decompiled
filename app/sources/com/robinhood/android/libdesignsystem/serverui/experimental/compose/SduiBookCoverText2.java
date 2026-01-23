package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.BookCoverText;
import com.robinhood.models.serverdriven.experimental.api.BookCoverTextStyle;
import com.robinhood.models.serverdriven.experimental.api.Font;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiBookCoverText.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"SduiBookCoverText", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/BookCoverText;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/BookCoverText;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease", "positionInWindow", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiBookCoverTextKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiBookCoverText2 {

    /* compiled from: SduiBookCoverText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiBookCoverTextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BookCoverTextStyle.values().length];
            try {
                iArr[BookCoverTextStyle.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookCoverTextStyle.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookCoverTextStyle.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BookCoverTextStyle.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Font.values().length];
            try {
                iArr2[Font.CAPSULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Font.NIB.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Font.MARTINA_PLANTINJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiBookCoverText$lambda$7(BookCoverText bookCoverText, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiBookCoverText(bookCoverText, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiBookCoverText(final BookCoverText<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        TextStyle bookCoverCapsuleLarge;
        boolean z;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer.Companion companion2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(775632171);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(775632171, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiBookCoverText (SduiBookCoverText.kt:27)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$1[component.getFont().ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(-65827295);
                    int i6 = WhenMappings.$EnumSwitchMapping$0[component.getStyle().ordinal()];
                    if (i6 == 1) {
                        composerStartRestartGroup.startReplaceGroup(-1941783680);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleLarge();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i6 == 2) {
                        composerStartRestartGroup.startReplaceGroup(-1941780959);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleMedium();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i6 == 3) {
                        composerStartRestartGroup.startReplaceGroup(-1941778240);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleSmall();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i6 != 4) {
                            composerStartRestartGroup.startReplaceGroup(-1941786111);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1941775488);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleSmall();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-65434959);
                    int i7 = WhenMappings.$EnumSwitchMapping$0[component.getStyle().ordinal()];
                    if (i7 == 1) {
                        composerStartRestartGroup.startReplaceGroup(-1941771012);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverNibLarge();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i7 == 2) {
                        composerStartRestartGroup.startReplaceGroup(-1941768419);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverNibMedium();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i7 == 3) {
                        composerStartRestartGroup.startReplaceGroup(-1941765828);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverNibSmall();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i7 != 4) {
                            composerStartRestartGroup.startReplaceGroup(-1941773455);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1941763204);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverNibSmall();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 != 3) {
                    composerStartRestartGroup.startReplaceGroup(-64655743);
                    int i8 = WhenMappings.$EnumSwitchMapping$0[component.getStyle().ordinal()];
                    if (i8 == 1) {
                        composerStartRestartGroup.startReplaceGroup(-1941745888);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleLarge();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i8 == 2) {
                        composerStartRestartGroup.startReplaceGroup(-1941743167);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleMedium();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i8 == 3) {
                        composerStartRestartGroup.startReplaceGroup(-1941740448);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleSmall();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i8 != 4) {
                            composerStartRestartGroup.startReplaceGroup(-1941748319);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1941737696);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleSmall();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-65044607);
                    int i9 = WhenMappings.$EnumSwitchMapping$0[component.getStyle().ordinal()];
                    if (i9 == 1) {
                        composerStartRestartGroup.startReplaceGroup(-1941758432);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverMartinaLarge();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i9 == 2) {
                        composerStartRestartGroup.startReplaceGroup(-1941755711);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverMartinaMedium();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i9 == 3) {
                        composerStartRestartGroup.startReplaceGroup(-1941752992);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverMartinaSmall();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i9 != 4) {
                            composerStartRestartGroup.startReplaceGroup(-1941760863);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1941750240);
                        bookCoverCapsuleLarge = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverMartinaSmall();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bookCoverCapsuleLarge, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, UtilKt.getComposeTextAlign(component.getAlignment()), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                LocalDecoratorOverride localDecoratorOverride = (LocalDecoratorOverride) composerStartRestartGroup.consume(SduiDecoratorKt.getLocalSduiDecoratorModifiers());
                z = localDecoratorOverride == null && localDecoratorOverride.getLocalComponentGoldSparkle();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    companion2 = companion;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    companion2 = companion;
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String text = component.getText();
                Color composeColor = SduiColors2.toComposeColor(component.getColor(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1941726845);
                long jM21425getFg0d7_KjU = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1941724200);
                if (z) {
                    textStyleM7655copyp1EtxEg$default = TextStyle.m7654copyNs73l9s$default(textStyleM7655copyp1EtxEg$default, GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, SduiBookCoverText$lambda$1(snapshotState), null, composerStartRestartGroup, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1941716480);
                Modifier modifierThen = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier4);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiBookCoverTextKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiBookCoverText2.SduiBookCoverText$lambda$6$lambda$5$lambda$4(snapshotState, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierThen = OnGloballyPositionedModifier3.onGloballyPositioned(modifierThen, (Function1) objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(text, modifierThen, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textStyleM7655copyp1EtxEg$default, composer2, 0, 0, 8184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiBookCoverTextKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiBookCoverText2.SduiBookCoverText$lambda$7(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$1[component.getFont().ordinal()];
            if (i4 != 1) {
            }
            TextStyle textStyleM7655copyp1EtxEg$default2 = TextStyle.m7655copyp1EtxEg$default(bookCoverCapsuleLarge, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, UtilKt.getComposeTextAlign(component.getAlignment()), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
            LocalDecoratorOverride localDecoratorOverride2 = (LocalDecoratorOverride) composerStartRestartGroup.consume(SduiDecoratorKt.getLocalSduiDecoratorModifiers());
            if (localDecoratorOverride2 == null) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String text2 = component.getText();
                Color composeColor2 = SduiColors2.toComposeColor(component.getColor(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1941726845);
                long jM21425getFg0d7_KjU2 = composeColor2 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor2.getValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1941724200);
                if (z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1941716480);
                Modifier modifierThen2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier4);
                if (z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(text2, modifierThen2, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textStyleM7655copyp1EtxEg$default2, composer2, 0, 0, 8184);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SduiBookCoverText$lambda$2(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiBookCoverText$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
        Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
        SduiBookCoverText$lambda$2(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
        return Unit.INSTANCE;
    }

    private static final long SduiBookCoverText$lambda$1(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }
}
