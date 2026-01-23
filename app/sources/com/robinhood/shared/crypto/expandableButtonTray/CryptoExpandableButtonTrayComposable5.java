package com.robinhood.shared.crypto.expandableButtonTray;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoExpandableButtonTrayComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/crypto/expandableButtonTray/PreviewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Companion", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayPreviewParameterProvider, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoExpandableButtonTrayComposable5 implements PreviewParameterProvider<PreviewState> {
    private static final ExpandableButtonTrayState<Unit> MULTIPLE_BUTTON_STATE;
    private static final ExpandableButtonTrayState<Unit> MULTIPLE_BUTTON_STATE_WITH_SELECTOR;
    private static final ExpandableButtonTrayState<Unit> SINGLE_BUTTON_STATE;
    private static final ExpandableButtonTrayState<Unit> ZERO_BUTTON_STATE;
    private final Sequence<PreviewState> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public CryptoExpandableButtonTrayComposable5() {
        ExpandableButtonTrayState<Unit> expandableButtonTrayState = MULTIPLE_BUTTON_STATE;
        PreviewState previewState = new PreviewState(expandableButtonTrayState, false);
        PreviewState previewState2 = new PreviewState(expandableButtonTrayState, true);
        ExpandableButtonTrayState<Unit> expandableButtonTrayState2 = SINGLE_BUTTON_STATE;
        PreviewState previewState3 = new PreviewState(expandableButtonTrayState2, false);
        ExpandableButtonTrayState<Unit> expandableButtonTrayState3 = ZERO_BUTTON_STATE;
        PreviewState previewState4 = new PreviewState(expandableButtonTrayState3, false);
        ExpandableButtonTrayState<Unit> expandableButtonTrayState4 = MULTIPLE_BUTTON_STATE_WITH_SELECTOR;
        this.values = SequencesKt.sequenceOf(previewState, previewState2, previewState3, previewState4, new PreviewState(expandableButtonTrayState4, false), new PreviewState(expandableButtonTrayState4, true), new PreviewState(ExpandableButtonTrayState.copy$default(expandableButtonTrayState, null, null, null, true, false, null, null, 119, null), false), new PreviewState(ExpandableButtonTrayState.copy$default(expandableButtonTrayState, null, null, null, true, false, null, null, 119, null), true), new PreviewState(ExpandableButtonTrayState.copy$default(expandableButtonTrayState2, null, null, null, true, false, null, null, 119, null), false), new PreviewState(ExpandableButtonTrayState.copy$default(expandableButtonTrayState3, null, null, null, true, false, null, null, 119, null), false), new PreviewState(ExpandableButtonTrayState.copy$default(expandableButtonTrayState4, null, null, null, true, false, null, null, 119, null), false), new PreviewState(ExpandableButtonTrayState.copy$default(expandableButtonTrayState4, null, null, null, true, false, null, null, 119, null), true));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<PreviewState> getValues() {
        return this.values;
    }

    static {
        StringResource.Companion companion = StringResource.INSTANCE;
        ExpandableButtonTrayState.PrefixContentState.TitleState titleState = new ExpandableButtonTrayState.PrefixContentState.TitleState(companion.invoke("Market cap"), companion.invoke("25.25B"));
        ExpandableButtonTrayState.ExpandButton expandButton = new ExpandableButtonTrayState.ExpandButton(companion.invoke(DxFeedData.TYPE_TRADE), null, true, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        StringResource stringResourceInvoke = companion.invoke("Buy perpetuals");
        Unit unit = Unit.INSTANCE;
        MULTIPLE_BUTTON_STATE = new ExpandableButtonTrayState<>(expandButton, extensions2.persistentListOf(new ExpandableButtonTrayState.ActionButton.CustomButton(stringResourceInvoke, unit, null, null, null, null, false, false, null, 508, null), new ExpandableButtonTrayState.ActionButton.CustomButton(companion.invoke("Sell"), unit, null, null, null, null, false, false, null, 508, null), new ExpandableButtonTrayState.ActionButton.CustomButton(companion.invoke("Buy"), unit, null, null, null, null, false, false, null, 508, null)), titleState, false, false, null, null, 112, null);
        SINGLE_BUTTON_STATE = new ExpandableButtonTrayState<>(new ExpandableButtonTrayState.ExpandButton(companion.invoke(DxFeedData.TYPE_TRADE), null, true, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), extensions2.persistentListOf(new ExpandableButtonTrayState.ActionButton.CustomButton(companion.invoke("Buy perpetuals"), unit, null, null, null, null, false, false, null, 508, null)), new ExpandableButtonTrayState.PrefixContentState.TitleState(companion.invoke("Market cap"), companion.invoke("25.25B")), false, false, null, null, 112, null);
        ZERO_BUTTON_STATE = new ExpandableButtonTrayState<>(new ExpandableButtonTrayState.ExpandButton(companion.invoke(DxFeedData.TYPE_TRADE), null, true, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), extensions2.persistentListOf(), new ExpandableButtonTrayState.PrefixContentState.TitleState(companion.invoke("Market cap"), companion.invoke("25.25B")), false, false, null, null, 112, null);
        MULTIPLE_BUTTON_STATE_WITH_SELECTOR = new ExpandableButtonTrayState<>(new ExpandableButtonTrayState.ExpandButton(companion.invoke(DxFeedData.TYPE_TRADE), null, true, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), extensions2.persistentListOf(new ExpandableButtonTrayState.ActionButton.CustomButton(companion.invoke("Buy perpetuals"), unit, null, null, null, null, false, false, null, 508, null), new ExpandableButtonTrayState.ActionButton.CustomButton(companion.invoke("Sell"), unit, null, null, null, null, false, false, null, 508, null), new ExpandableButtonTrayState.ActionButton.CustomButton(companion.invoke("Buy"), unit, null, null, null, null, false, false, null, 508, null)), new ExpandableButtonTrayState.PrefixContentState.BottomSheetSelector(new BentoIcon4.Size24(ServerToBentoAssetMapper2.FINANCE_24), companion.invoke("Investing")), false, false, null, null, 112, null);
    }
}
