package com.robinhood.android.matcha.p177ui.search;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.input.key.Key;
import androidx.compose.p011ui.input.key.KeyEvent;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.input.key.KeyInputModifier2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MatchaSearchFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaSearchFragment2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ SnapshotState4<MatchaSearchViewState> $state;
    final /* synthetic */ MatchaSearchFragment this$0;

    MatchaSearchFragment2(SnapshotState4<MatchaSearchViewState> snapshotState4, MatchaSearchFragment matchaSearchFragment, FocusRequester focusRequester, FocusManager focusManager) {
        this.$state = snapshotState4;
        this.this$0 = matchaSearchFragment;
        this.$focusRequester = focusRequester;
        this.$focusManager = focusManager;
    }

    private static final String invoke$lambda$6(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(MatchaSearchFragment matchaSearchFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaSearchFragment.getDuxo().updateQuery(StringsKt.trim(it).toString());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-385863922, i, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MatchaSearchFragment.kt:258)");
        }
        if (this.$state.getValue().isMultiuserUi()) {
            composer.startReplaceGroup(-1939515113);
            ImmutableList immutableList = extensions2.toImmutableList(this.$state.getValue().getTags());
            MatchaSearchFragment matchaSearchFragment = this.this$0;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(matchaSearchFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MatchaSearchFragment3(matchaSearchFragment);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            MatchaSearchFragment matchaSearchFragment2 = this.this$0;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(matchaSearchFragment2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new MatchaSearchFragment4(matchaSearchFragment2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            String string2 = this.this$0.getString(C21284R.string.matcha_search_input_hint);
            String searchText = this.$state.getValue().getSearchText();
            String str = searchText != null ? searchText : "";
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null), this.$focusRequester);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(this.$focusManager) | composer.changedInstance(this.this$0);
            final FocusManager focusManager = this.$focusManager;
            final MatchaSearchFragment matchaSearchFragment3 = this.this$0;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1<KeyEvent, Boolean>() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1$1$1$1$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m16428invokeZmokQxo(keyEvent.getNativeKeyEvent());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m16428invokeZmokQxo(android.view.KeyEvent it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (Key.m7078equalsimpl0(KeyEvent_androidKt.m7117getKeyZmokQxo(it), Key.INSTANCE.m7082getBackspaceEK5gGoQ())) {
                            FocusManager.clearFocus$default(focusManager, false, 1, null);
                            matchaSearchFragment3.getDuxo().onBackspace();
                        }
                        return Boolean.TRUE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Modifier modifierOnKeyEvent = KeyInputModifier2.onKeyEvent(modifierFocusRequester, (Function1) objRememberedValue3);
            Function1 function1 = (Function1) kFunction;
            Function0 function0 = (Function0) kFunction2;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(this.this$0);
            final MatchaSearchFragment matchaSearchFragment4 = this.this$0;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MatchaSearchFragment2.invoke$lambda$4$lambda$3(matchaSearchFragment4, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            SearchInputWithTags.SearchInputWithTags(immutableList, function1, function0, str, (Function1) objRememberedValue4, string2, modifierOnKeyEvent, composer, 0, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1938092988);
            composer.startReplaceGroup(1849434622);
            SnapshotState4<MatchaSearchViewState> snapshotState4 = this.$state;
            Object objRememberedValue5 = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue5 == companion2.getEmpty()) {
                String searchText2 = snapshotState4.getValue().getSearchText();
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(searchText2 != null ? searchText2 : "", null, 2, null);
                composer.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue5;
            composer.endReplaceGroup();
            BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, this.this$0.getString(C11048R.string.general_action_search), null, 4, null);
            String string3 = this.this$0.getString(C21284R.string.matcha_search_input_hint);
            String strInvoke$lambda$6 = invoke$lambda$6(snapshotState);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance5 = composer.changedInstance(this.this$0);
            final MatchaSearchFragment matchaSearchFragment5 = this.this$0;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MatchaSearchFragment2.invoke$lambda$9$lambda$8(matchaSearchFragment5, snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            BentoTextInput4.BentoTextInput(strInvoke$lambda$6, (Function1) objRememberedValue6, modifierM5146paddingqDBjuR0$default, null, string3, null, null, size24, null, null, null, null, null, false, false, composer, BentoTextInput8.Icon.Size24.$stable << 21, 0, 32616);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(MatchaSearchFragment matchaSearchFragment, SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        matchaSearchFragment.getDuxo().updateQuery(StringsKt.trim(it).toString());
        return Unit.INSTANCE;
    }
}
