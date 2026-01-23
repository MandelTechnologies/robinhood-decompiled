package com.robinhood.android.slip.onboarding.agreements.previouslysigned;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.rows.BentoAccordionRow;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlipPreviouslySignedAgreementsContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$expandableAgreements$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SlipPreviouslySignedAgreementsContent5 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ List<Tuples2<String, String>> $agreementsRow;
    final /* synthetic */ boolean $expandDefault;
    final /* synthetic */ int $index;
    final /* synthetic */ String $markdown;
    final /* synthetic */ String $title;

    SlipPreviouslySignedAgreementsContent5(List<Tuples2<String, String>> list, boolean z, int i, String str, String str2) {
        this.$agreementsRow = list;
        this.$expandDefault = z;
        this.$index = i;
        this.$title = str;
        this.$markdown = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotStateList invoke$lambda$2$lambda$1(List list, boolean z) {
        List<Tuples2> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Tuples2 tuples2 : list2) {
            arrayList.add(Boolean.valueOf(z));
        }
        return SnapshotStateKt.toMutableStateList(arrayList);
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-489831757, i, -1, "com.robinhood.android.slip.onboarding.agreements.previouslysigned.expandableAgreements.<anonymous>.<anonymous> (SlipPreviouslySignedAgreementsContent.kt:124)");
        }
        Object[] objArr = new Object[0];
        Saver saverSnapshotStateListSaver = SlipPreviouslySignedAgreementsContent3.snapshotStateListSaver();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$agreementsRow) | composer.changed(this.$expandDefault);
        final List<Tuples2<String, String>> list = this.$agreementsRow;
        final boolean z = this.$expandDefault;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$expandableAgreements$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SlipPreviouslySignedAgreementsContent5.invoke$lambda$2$lambda$1(list, z);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        final SnapshotStateList snapshotStateList = (SnapshotStateList) RememberSaveable.m6426rememberSaveable(objArr, saverSnapshotStateListSaver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.NumberPog(this.$index + 1), this.$title, (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        boolean zBooleanValue = ((Boolean) snapshotStateList.get(this.$index)).booleanValue();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(snapshotStateList) | composer.changed(this.$index);
        final int i2 = this.$index;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$expandableAgreements$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlipPreviouslySignedAgreementsContent5.invoke$lambda$4$lambda$3(snapshotStateList, i2, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        final String str = this.$markdown;
        BentoAccordionRow.BentoAccordionRow(null, zBooleanValue, bentoBaseRowState, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(857142314, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$expandableAgreements$1$1.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(857142314, i3, -1, "com.robinhood.android.slip.onboarding.agreements.previouslysigned.expandableAgreements.<anonymous>.<anonymous>.<anonymous> (SlipPreviouslySignedAgreementsContent.kt:135)");
                }
                BentoSpannedText.m21106BentoSpannedTextTHkziT8(Markdown3.rememberMarkdown(str, composer2, 0), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU()), null, 0, null, 0, 0, null, composer2, 0, 506);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, (BentoBaseRowState.$stable << 6) | 24576, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(SnapshotStateList snapshotStateList, int i, boolean z) {
        snapshotStateList.set(i, Boolean.valueOf(z));
        return Unit.INSTANCE;
    }
}
