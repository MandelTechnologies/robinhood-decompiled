package com.robinhood.android.linking;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MobileLinkingGroupsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.linking.ComposableSingletons$MobileLinkingGroupsComposableKt$lambda$1128339128$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MobileLinkingGroupsComposable3 implements Function2<Composer, Integer, Unit> {
    public static final MobileLinkingGroupsComposable3 INSTANCE = new MobileLinkingGroupsComposable3();

    MobileLinkingGroupsComposable3() {
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
            ComposerKt.traceEventStart(1128339128, i, -1, "com.robinhood.android.linking.ComposableSingletons$MobileLinkingGroupsComposableKt.lambda$1128339128.<anonymous> (MobileLinkingGroupsComposable.kt:150)");
        }
        ImmutableList immutableList = extensions2.toImmutableList(MobileLinkingGroupsComposable4.mockGroups);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.linking.ComposableSingletons$MobileLinkingGroupsComposableKt$lambda$1128339128$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MobileLinkingGroupsComposable3.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.linking.ComposableSingletons$MobileLinkingGroupsComposableKt$lambda$1128339128$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        MobileLinkingGroupsComposable4.MobileLinkingGroupsComposable(Constants.SdidMigrationStatusCodes.ALREADY_SDID, immutableList, function1, (Function0) objRememberedValue2, null, composer, 3462, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
