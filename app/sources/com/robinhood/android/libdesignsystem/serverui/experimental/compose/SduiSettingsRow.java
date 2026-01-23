package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.SettingsRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.SettingsRowStacked;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SduiSettingsRow.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"SduiSettingsRowCondensed", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/SettingsRowCondensed;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lcom/robinhood/models/serverdriven/experimental/api/SettingsRowCondensed;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "SduiSettingsRowStacked", "Lcom/robinhood/models/serverdriven/experimental/api/SettingsRowStacked;", "(Lcom/robinhood/models/serverdriven/experimental/api/SettingsRowStacked;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiSettingsRowKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiSettingsRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiSettingsRowCondensed$lambda$0(SettingsRowCondensed settingsRowCondensed, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiSettingsRowCondensed(settingsRowCondensed, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiSettingsRowStacked$lambda$2(SettingsRowStacked settingsRowStacked, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiSettingsRowStacked(settingsRowStacked, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiSettingsRowCondensed(final SettingsRowCondensed<? extends ActionT> component, final Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(47109192);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.Default;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47109192, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiSettingsRowCondensed (SduiSettingsRow.kt:18)");
            }
            UtilKt.SduiHorizontalPadding(horizontalPadding, ComposableLambda3.rememberComposableLambda(-450128988, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiSettingsRowKt.SduiSettingsRowCondensed.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    BentoIcon4 bentoIcon;
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450128988, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiSettingsRowCondensed.<anonymous> (SduiSettingsRow.kt:20)");
                    }
                    Modifier modifier2 = modifier;
                    String label = component.getLabel();
                    String value = component.getValue();
                    Icon icon = component.getIcon();
                    BentoSettingsRowKt.BentoCondensedSettingsRow(modifier2, label, value, (icon == null || (bentoIcon = SduiIcon2.toBentoIcon(icon)) == null) ? null : bentoIcon.getAsset(), component.is_enabled(), false, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer2, 0), component.getAction()), composer2, 0, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final HorizontalPadding horizontalPadding2 = horizontalPadding;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiSettingsRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiSettingsRow.SduiSettingsRowCondensed$lambda$0(component, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <ActionT extends Parcelable> void SduiSettingsRowStacked(final SettingsRowStacked<? extends ActionT> component, final Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1642156232);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.Default;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1642156232, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiSettingsRowStacked (SduiSettingsRow.kt:36)");
            }
            composerStartRestartGroup.startReplaceGroup(1859149542);
            String metadata = component.getMetadata();
            final BentoSettingsRows.EndElement icon = null;
            if (metadata != null && !StringsKt.isBlank(metadata)) {
                String metadata2 = component.getMetadata();
                Intrinsics.checkNotNull(metadata2);
                icon = new BentoSettingsRows.EndElement.Metadata(metadata2, SduiColors2.toComposeColor(component.getMetadata_color(), composerStartRestartGroup, 0), null);
            } else if (component.getIcon() != null) {
                Icon icon2 = component.getIcon();
                Intrinsics.checkNotNull(icon2);
                ServerToBentoAssetMapper2 iconAsset = UtilKt.getIconAsset(icon2);
                if (iconAsset != null) {
                    icon = new BentoSettingsRows.EndElement.Icon(iconAsset, null, 2, null);
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            UtilKt.SduiHorizontalPadding(horizontalPadding, ComposableLambda3.rememberComposableLambda(1130110500, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiSettingsRowKt.SduiSettingsRowStacked.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1130110500, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiSettingsRowStacked.<anonymous> (SduiSettingsRow.kt:48)");
                    }
                    BentoSettingsRowKt.BentoSettingsRow(modifier, component.getLabel(), component.getValue(), (BentoSettingsRows.StartElement) null, icon, component.is_enabled(), false, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer2, 0), component.getAction()), composer2, BentoSettingsRows.EndElement.$stable << 12, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final HorizontalPadding horizontalPadding2 = horizontalPadding;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiSettingsRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiSettingsRow.SduiSettingsRowStacked$lambda$2(component, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
