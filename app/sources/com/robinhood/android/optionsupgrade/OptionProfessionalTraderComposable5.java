package com.robinhood.android.optionsupgrade;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionProfessionalTraderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt$OptionProfessionalTraderComposable$2, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionProfessionalTraderComposable5 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ String $description;
    final /* synthetic */ int $textAlign;
    final /* synthetic */ String $title;
    final /* synthetic */ float $titleTopSpacing;
    final /* synthetic */ boolean $useBulletPoints;
    final /* synthetic */ ImmutableList<String> $valueProps;

    OptionProfessionalTraderComposable5(float f, String str, int i, String str2, ImmutableList<String> immutableList, boolean z) {
        this.$titleTopSpacing = f;
        this.$title = str;
        this.$textAlign = i;
        this.$description = str2;
        this.$valueProps = immutableList;
        this.$useBulletPoints = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1887159546, i2, -1, "com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposable.<anonymous> (OptionProfessionalTraderComposable.kt:72)");
        }
        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(this.$titleTopSpacing) | composer.changed(this.$title) | composer.changed(this.$textAlign) | composer.changed(this.$description) | composer.changed(this.$valueProps) | composer.changed(this.$useBulletPoints);
        final ImmutableList<String> immutableList = this.$valueProps;
        final float f = this.$titleTopSpacing;
        final String str = this.$title;
        final int i3 = this.$textAlign;
        final String str2 = this.$description;
        final boolean z = this.$useBulletPoints;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt$OptionProfessionalTraderComposable$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionProfessionalTraderComposable5.invoke$lambda$2$lambda$1(immutableList, f, str, i3, str2, z, (LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(modifierPadding, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(final ImmutableList immutableList, final float f, final String str, final int i, final String str2, final boolean z, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-562703205, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt$OptionProfessionalTraderComposable$2$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i2 & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562703205, i2, -1, "com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionProfessionalTraderComposable.kt:78)");
                }
                BentoText2.m20747BentoText38GnDrw(str, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, f, 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(i), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleMedium(), composer, 0, 0, 8124);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(2126996242, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt$OptionProfessionalTraderComposable$2$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i2 & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2126996242, i2, -1, "com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionProfessionalTraderComposable.kt:86)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(str2, com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), null, null, null, null, TextAlign.m7912boximpl(i), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16316);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final C25113xfdf062ff c25113xfdf062ff = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt$OptionProfessionalTraderComposable$2$invoke$lambda$2$lambda$1$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(String str3) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((String) obj);
            }
        };
        LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt$OptionProfessionalTraderComposable$2$invoke$lambda$2$lambda$1$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                return c25113xfdf062ff.invoke(immutableList.get(i2));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposableKt$OptionProfessionalTraderComposable$2$invoke$lambda$2$lambda$1$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i4;
                BentoValuePropRow2 icon;
                if ((i3 & 6) == 0) {
                    i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                String str3 = (String) immutableList.get(i2);
                composer.startReplaceGroup(1349019981);
                if (z) {
                    icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.DOT_12, null, 2, null);
                } else {
                    icon = BentoValuePropRow2.Checkmark.INSTANCE;
                }
                BentoValuePropRow3.BentoValuePropRow((String) null, str3, icon, BentoValuePropRow.Top, (Modifier) null, composer, 3078, 16);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
