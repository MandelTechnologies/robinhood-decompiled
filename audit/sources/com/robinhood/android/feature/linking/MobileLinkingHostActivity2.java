package com.robinhood.android.feature.linking;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.feature.linking.MobileLinkingHostActivity;
import com.robinhood.android.linking.MobileLinkingGroupsComposable4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MobileLinkingHostActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$1$1$1$4, reason: use source file name */
/* loaded from: classes3.dex */
final class MobileLinkingHostActivity2 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState4<MobileLinkingHostState> $state$delegate;
    final /* synthetic */ MobileLinkingHostActivity this$0;

    MobileLinkingHostActivity2(SnapshotState4<MobileLinkingHostState> snapshotState4, MobileLinkingHostActivity mobileLinkingHostActivity) {
        this.$state$delegate = snapshotState4;
        this.this$0 = mobileLinkingHostActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(235014742, i, -1, "com.robinhood.android.feature.linking.MobileLinkingHostActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MobileLinkingHostActivity.kt:113)");
        }
        String selectedGroupId = MobileLinkingHostActivity.C167331.invoke$lambda$0(this.$state$delegate).getSelectedGroupId();
        if (selectedGroupId != null) {
            final MobileLinkingHostActivity mobileLinkingHostActivity = this.this$0;
            ImmutableList immutableList = extensions2.toImmutableList(MobileLinkingHostActivity.C167331.invoke$lambda$0(this.$state$delegate).getGroups());
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(mobileLinkingHostActivity);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$1$1$1$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MobileLinkingHostActivity2.invoke$lambda$4$lambda$1$lambda$0(mobileLinkingHostActivity, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(mobileLinkingHostActivity);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostActivity$onCreate$1$1$1$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MobileLinkingHostActivity2.invoke$lambda$4$lambda$3$lambda$2(mobileLinkingHostActivity);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            MobileLinkingGroupsComposable4.MobileLinkingGroupsComposable(selectedGroupId, immutableList, function1, (Function0) objRememberedValue2, null, composer, 0, 16);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(MobileLinkingHostActivity mobileLinkingHostActivity, String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        mobileLinkingHostActivity.getDuxo().setSelectedGroupId(groupId);
        mobileLinkingHostActivity.setShowSelectGroupSheet(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(MobileLinkingHostActivity mobileLinkingHostActivity) {
        mobileLinkingHostActivity.setShowSelectGroupSheet(false);
        return Unit.INSTANCE;
    }
}
