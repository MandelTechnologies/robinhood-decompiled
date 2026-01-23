package com.robinhood.android.transfers.p271ui.max;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.databinding.FragmentCreateTransferV2Binding;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.scarlet.ScarletManager;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CreateTransferFragmentBindings.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m3636d2 = {"bindDisclosure", "", "Lcom/robinhood/android/transfers/databinding/FragmentCreateTransferV2Binding;", "state", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState;", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "callbacks", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosureCallbacks;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferFragmentBindingsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferFragmentBindings {

    /* compiled from: CreateTransferFragmentBindings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferFragmentBindingsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AchTransferOption.values().length];
            try {
                iArr[AchTransferOption.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AchTransferOption.INSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bindDisclosure(FragmentCreateTransferV2Binding fragmentCreateTransferV2Binding, CreateTransferViewState state, final ScarletManager scarletManager, CreateTransferDisclosure2 callbacks, final Navigator navigator) {
        final List<UIComponent<GenericAction>> listListOf;
        UIComponent<GenericAction> disclosure_text;
        UIComponent<GenericAction> ach_disclosure_text;
        Intrinsics.checkNotNullParameter(fragmentCreateTransferV2Binding, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        fragmentCreateTransferV2Binding.disclosureSection.setVisibility(8);
        if (state.getTransferSummarySdui() != null) {
            listListOf = state.getTransferSummarySdui();
        } else if (state.getCanUseSduiForDisclosure()) {
            ApiDisclosureUIResponse disclosureContent = state.getDisclosureContent();
            AchTransferOption selectedAchTransferOption = state.getSelectedAchTransferOption();
            int i = selectedAchTransferOption == null ? -1 : WhenMappings.$EnumSwitchMapping$0[selectedAchTransferOption.ordinal()];
            if (i == -1) {
                listListOf = (disclosureContent != null || (disclosure_text = disclosureContent.getDisclosure_text()) == null) ? null : CollectionsKt.listOf(disclosure_text);
            } else if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (disclosureContent != null) {
                }
            } else if (disclosureContent != null && (ach_disclosure_text = disclosureContent.getAch_disclosure_text()) != null) {
                listListOf = CollectionsKt.listOf(ach_disclosure_text);
            }
        }
        if (listListOf != null) {
            fragmentCreateTransferV2Binding.disclosureSection.setVisibility(0);
            fragmentCreateTransferV2Binding.disclosureSection.setContent(ComposableLambda3.composableLambdaInstance(399964387, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragmentBindingsKt.bindDisclosure.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i2) {
                    if ((i2 & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(399964387, i2, -1, "com.robinhood.android.transfers.ui.max.bindDisclosure.<anonymous> (CreateTransferFragmentBindings.kt:53)");
                    }
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
                    final Navigator navigator2 = navigator;
                    final List<UIComponent<GenericAction>> list = listListOf;
                    BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1275151887, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragmentBindingsKt.bindDisclosure.1.1
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
                                ComposerKt.traceEventStart(-1275151887, i3, -1, "com.robinhood.android.transfers.ui.max.bindDisclosure.<anonymous>.<anonymous> (CreateTransferFragmentBindings.kt:54)");
                            }
                            final Navigator navigator3 = navigator2;
                            final List<UIComponent<GenericAction>> list2 = list;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1837825798, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragmentBindingsKt.bindDisclosure.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i4) {
                                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1837825798, i4, -1, "com.robinhood.android.transfers.ui.max.bindDisclosure.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragmentBindings.kt:55)");
                                    }
                                    Navigator navigator4 = navigator3;
                                    final List<UIComponent<GenericAction>> list3 = list2;
                                    GenericActionHandlerKt.GenericActionHandler(null, false, null, navigator4, ComposableLambda3.rememberComposableLambda(705764120, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragmentBindingsKt.bindDisclosure.1.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i5) {
                                            if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(705764120, i5, -1, "com.robinhood.android.transfers.ui.max.bindDisclosure.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragmentBindings.kt:58)");
                                            }
                                            ImmutableList immutableList = extensions2.toImmutableList(list3);
                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), null, false, 3, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                                            composer4.startReplaceGroup(-1772220517);
                                            SduiColumns.SduiColumn(immutableList, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer4, 100663296, 0);
                                            composer4.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 24576, 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        } else {
            fragmentCreateTransferV2Binding.disclosureSection.setVisibility(0);
            ComposeView disclosureSection = fragmentCreateTransferV2Binding.disclosureSection;
            Intrinsics.checkNotNullExpressionValue(disclosureSection, "disclosureSection");
            CreateTransferDisclosure3.bindDisclosureSection(disclosureSection, ScarletComposeInterop.themeChangesForCompose(scarletManager), state.getDisclosureText(), callbacks);
        }
    }
}
