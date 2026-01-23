package com.robinhood.android.matcha.p177ui.search;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.p2p.common.ProfileAvatarState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SearchInputWithTags.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.search.SearchInputWithTagsKt$SearchInputWithTags$1$1$1$1$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SearchInputWithTags2 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
    final /* synthetic */ Function1<Integer, Unit> $onTagClick;
    final /* synthetic */ Function0<Unit> $onTagRemoveClick;
    final /* synthetic */ ImmutableList<ProfileTag> $profileTags;

    /* JADX WARN: Multi-variable type inference failed */
    SearchInputWithTags2(ImmutableList<ProfileTag> immutableList, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super Integer, Unit> function1, Function0<Unit> function0) {
        this.$profileTags = immutableList;
        this.$innerTextField = function2;
        this.$onTagClick = function1;
        this.$onTagRemoveClick = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1408509463, i, -1, "com.robinhood.android.matcha.ui.search.SearchInputWithTags.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchInputWithTags.kt:143)");
        }
        composer.startReplaceGroup(-662893650);
        ImmutableList<ProfileTag> immutableList = this.$profileTags;
        final Function1<Integer, Unit> function1 = this.$onTagClick;
        Function0<Unit> function0 = this.$onTagRemoveClick;
        int i2 = 0;
        for (ProfileTag profileTag : immutableList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ProfileTag profileTag2 = profileTag;
            final int i4 = i2;
            boolean zIsSelected = profileTag2.isSelected();
            ProfileAvatarState profile = profileTag2.getProfile();
            String name = profileTag2.getName();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changed(i4);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.search.SearchInputWithTagsKt$SearchInputWithTags$1$1$1$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchInputWithTags2.invoke$lambda$2$lambda$1$lambda$0(function1, i4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            MatchaSearchProfileTag.MatchaSearchProfileTag(zIsSelected, profile, name, (Function0) objRememberedValue, function0, null, composer, 0, 32);
            i2 = i3;
        }
        composer.endReplaceGroup();
        this.$innerTextField.invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
