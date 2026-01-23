package com.robinhood.shared.onboarding.lib.menuofoption;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.identi.ApiMenuOfOptionsHeaderCard;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes2;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes3;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes4;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsHeader;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsItem;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsPathItem;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsPathItemTimeline;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatExperienceV2;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: MenuOfOptionsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MenuOfOptionsPreviewProvider implements PreviewParameterProvider<MenuOfOptionsState> {
    public static final int $stable = 0;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<MenuOfOptionsState> getValues() {
        SortingHatTypes2 sortingHatTypes2 = SortingHatTypes2.FEATURED;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.ACCOUNT_SUMMARY_24;
        MenuOfOptionsState.MenuOfOptions menuOfOptions = new MenuOfOptionsState.MenuOfOptions(new SortingHatExperienceV2.MenuOfOptions(null, "Hero title", "Hero subtitle markdown", "logging state", "logging variant", CollectionsKt.listOf(new MenuOfOptionsItem(sortingHatTypes2, "Option 1", "sub 1", null, serverToBentoAssetMapper2, "", null)), new MenuOfOptionsHeader.Hero(SortingHatTypes.MONEY), null));
        MenuOfOptionsState.MenuOfOptions menuOfOptions2 = new MenuOfOptionsState.MenuOfOptions(new SortingHatExperienceV2.MenuOfOptions(null, "Hero title", "Hero subtitle markdown", "logging state", "logging variant", CollectionsKt.listOf((Object[]) new MenuOfOptionsItem[]{new MenuOfOptionsItem(sortingHatTypes2, "Option 1", "sub 1", null, serverToBentoAssetMapper2, "", null), new MenuOfOptionsItem(SortingHatTypes2.STANDARD, "Option 2", "sub 2", null, ServerToBentoAssetMapper2.CALENDAR_24, "", null), new MenuOfOptionsItem(SortingHatTypes2.INACTIVE, "Option 3", "sub 3", null, ServerToBentoAssetMapper2.TRASH_24, "", null)}), new MenuOfOptionsHeader.Path(CollectionsKt.listOf(new MenuOfOptionsPathItem(false, SortingHatTypes.WELCOME, "path title1", new MenuOfOptionsPathItemTimeline(SortingHatTypes4.ACTIVE, SortingHatTypes4.INACTIVE, SortingHatTypes3.COMPLETED)))), null));
        List listEmptyList = CollectionsKt.emptyList();
        ApiMenuOfOptionsHeaderCard.ThemedImage themedImage = new ApiMenuOfOptionsHeaderCard.ThemedImage("https://cdn.robinhood.com/app_assets/crypto/moo/illo_coins_circle_light_mode.svg", "https://cdn.robinhood.com/app_assets/crypto/moo/illo_coins_circle_dark_mode.svg");
        Color color = Color.ACCENT;
        return SequencesKt.sequenceOf(menuOfOptions, menuOfOptions2, new MenuOfOptionsState.MenuOfOptions(new SortingHatExperienceV2.MenuOfOptions(null, "", null, "logging state", "logging variant", listEmptyList, new MenuOfOptionsHeader.HeaderCard(new ApiMenuOfOptionsHeaderCard(themedImage, "Much messaging wow. Lets make this looong enough to wrap a few lines.", "Click me", new ThemedColor(color, color), "robinhood://crypto/home", "more-logging-identifier")), null)), MenuOfOptionsState.Loading.INSTANCE, MenuOfOptionsState.Error.INSTANCE);
    }
}
