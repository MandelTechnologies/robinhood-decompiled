package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.text.SpannableString;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyPaycheckModuleComposable;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.C20692R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoInfoBannerComposable;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRow;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.bonfire.RhyPaycheckModule;
import com.robinhood.models.serverdriven.experimental.api.DataRowStacked;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PaycheckSectionContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: RhyPaycheckModuleComposable.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f\u001a\u001f\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0014\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0003¢\u0006\u0002\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010\u001d\u001aA\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010$\u001a#\u0010%\u001a\u00020\u00012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180'2\u0006\u0010#\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010(\u001a\u001a\u0010)\u001a\u00020**\b\u0012\u0004\u0012\u00020+0 2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006,²\u0006\u0012\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010.X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020*X\u008a\u008e\u0002"}, m3636d2 = {"RhyPaycheckModuleComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "paycheckModule", "Lcom/robinhood/models/db/bonfire/RhyPaycheckModule;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "paycheckModuleInfoBannerDismissTimeoutsPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/db/bonfire/RhyPaycheckModule;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/prefs/StringToLongMapPreference;Landroidx/compose/runtime/Composer;II)V", "MainContent", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/db/bonfire/RhyPaycheckModule;Landroidx/compose/runtime/Composer;II)V", "MainColumnContent", "Title", "title", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Subtitle", "subtitle", "InfoRows", "infoRows", "", "Lcom/robinhood/models/serverdriven/experimental/api/DataRowStacked;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "PaycheckImage", MarkdownText4.TagImageUrl, "Lokhttp3/HttpUrl;", "(Landroidx/compose/ui/Modifier;Lokhttp3/HttpUrl;Landroidx/compose/runtime/Composer;II)V", "InfoBanner", "infoBanner", "Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "infoBannerDismissTimeout", "", "loggingContextScenario", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;Ljava/lang/Integer;Lcom/robinhood/prefs/StringToLongMapPreference;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ActionButton", "button", "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "(Lcom/robinhood/models/serverdriven/experimental/api/TextButton;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "shouldShow", "", "Landroid/os/Parcelable;", "feature-cash-rhy-tab_externalDebug", "alertState", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "bannerVisible"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyPaycheckModuleComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionButton$lambda$24(TextButton textButton, String str, int i, Composer composer, int i2) {
        ActionButton(textButton, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBanner$lambda$21(Modifier modifier, InfoBanner infoBanner, Integer num, StringToLongMapPreference stringToLongMapPreference, String str, int i, int i2, Composer composer, int i3) {
        InfoBanner(modifier, infoBanner, num, stringToLongMapPreference, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoRows$lambda$12(List list, int i, Composer composer, int i2) {
        InfoRows(list, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainColumnContent$lambda$8(Modifier modifier, RhyPaycheckModule rhyPaycheckModule, int i, int i2, Composer composer, int i3) {
        MainColumnContent(modifier, rhyPaycheckModule, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$6(Modifier modifier, RhyPaycheckModule rhyPaycheckModule, int i, int i2, Composer composer, int i3) {
        MainContent(modifier, rhyPaycheckModule, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaycheckImage$lambda$13(Modifier modifier, HttpUrl httpUrl, int i, int i2, Composer composer, int i3) {
        PaycheckImage(modifier, httpUrl, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyPaycheckModuleComposable$lambda$4(Modifier modifier, RhyPaycheckModule rhyPaycheckModule, Navigator navigator, StringToLongMapPreference stringToLongMapPreference, int i, int i2, Composer composer, int i3) {
        RhyPaycheckModuleComposable(modifier, rhyPaycheckModule, navigator, stringToLongMapPreference, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Subtitle$lambda$10(Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        Subtitle(modifier, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$9(Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        Title(modifier, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntSize InfoBanner$lambda$18$lambda$17(IntSize intSize) {
        return IntSize.m8055boximpl(IntSize.m8056constructorimpl((((int) (intSize.getPackedValue() >> 32)) << 32) | (0 & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntSize InfoBanner$lambda$20$lambda$19(IntSize intSize) {
        return IntSize.m8055boximpl(IntSize.m8056constructorimpl((((int) (intSize.getPackedValue() >> 32)) << 32) | (0 & 4294967295L)));
    }

    public static final void RhyPaycheckModuleComposable(Modifier modifier, final RhyPaycheckModule paycheckModule, final Navigator navigator, final StringToLongMapPreference paycheckModuleInfoBannerDismissTimeoutsPref, Composer composer, final int i, final int i2) {
        int i3;
        SnapshotState snapshotState;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(paycheckModule, "paycheckModule");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(paycheckModuleInfoBannerDismissTimeoutsPref, "paycheckModuleInfoBannerDismissTimeoutsPref");
        Composer composerStartRestartGroup = composer.startRestartGroup(1547254173);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(paycheckModule) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(paycheckModuleInfoBannerDismissTimeoutsPref) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1547254173, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposable (RhyPaycheckModuleComposable.kt:71)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(paycheckModule);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                SduiActionHandler sduiActionHandler = new SduiActionHandler() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$RhyPaycheckModuleComposable$actionHandler$1$1

                    /* compiled from: RhyPaycheckModuleComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$RhyPaycheckModuleComposable$actionHandler$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
                            try {
                                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(GenericAction action) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (action instanceof GenericAction.Deeplink) {
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
                            return true;
                        }
                        if (action instanceof GenericAction.Dismiss) {
                            RhyPaycheckModuleComposable.RhyPaycheckModuleComposable$lambda$2(snapshotState2, null);
                            return true;
                        }
                        if (action instanceof GenericAction.InfoAlert) {
                            EventLogger.DefaultImpls.logTap$default(current, null, new Screen(Screen.Name.RHY_SPENDING_HOME, null, null, null, 14, null), new Component(Component.ComponentType.PAYCHECK_SECTION, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaycheckSectionContext(paycheckModule.getLoggingContextScenario(), "data_row_info", null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -131073, -1, -1, -1, 16383, null), false, 41, null);
                            GenericAction.InfoAlert infoAlert = (GenericAction.InfoAlert) action;
                            if (WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()] == 1) {
                                RhyPaycheckModuleComposable.RhyPaycheckModuleComposable$lambda$2(snapshotState2, infoAlert.getValue2().getAlert());
                                return true;
                            }
                        }
                        return false;
                    }
                };
                snapshotState = snapshotState2;
                composerStartRestartGroup.updateRememberedValue(sduiActionHandler);
                objRememberedValue2 = sduiActionHandler;
            } else {
                snapshotState = snapshotState2;
            }
            SduiActionHandler sduiActionHandler2 = (SduiActionHandler) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            modifier2 = modifier3;
            SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, ComposableLambda3.rememberComposableLambda(-377926948, true, new C103721(modifier2, paycheckModule, snapshotState, sduiActionHandler2, paycheckModuleInfoBannerDismissTimeoutsPref), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyPaycheckModuleComposable.RhyPaycheckModuleComposable$lambda$4(modifier2, paycheckModule, navigator, paycheckModuleInfoBannerDismissTimeoutsPref, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean InfoBanner$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericAlertContent<GenericAction> RhyPaycheckModuleComposable$lambda$1(SnapshotState<GenericAlertContent<GenericAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: RhyPaycheckModuleComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$RhyPaycheckModuleComposable$1 */
    static final class C103721 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SduiActionHandler<GenericAction> $actionHandler;
        final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $alertState$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ RhyPaycheckModule $paycheckModule;
        final /* synthetic */ StringToLongMapPreference $paycheckModuleInfoBannerDismissTimeoutsPref;

        /* JADX WARN: Multi-variable type inference failed */
        C103721(Modifier modifier, RhyPaycheckModule rhyPaycheckModule, SnapshotState<GenericAlertContent<GenericAction>> snapshotState, SduiActionHandler<? super GenericAction> sduiActionHandler, StringToLongMapPreference stringToLongMapPreference) {
            this.$modifier = modifier;
            this.$paycheckModule = rhyPaycheckModule;
            this.$alertState$delegate = snapshotState;
            this.$actionHandler = sduiActionHandler;
            this.$paycheckModuleInfoBannerDismissTimeoutsPref = stringToLongMapPreference;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-377926948, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposable.<anonymous> (RhyPaycheckModuleComposable.kt:113)");
            }
            GenericAlertContent genericAlertContentRhyPaycheckModuleComposable$lambda$1 = RhyPaycheckModuleComposable.RhyPaycheckModuleComposable$lambda$1(this.$alertState$delegate);
            composer.startReplaceGroup(1884424023);
            if (genericAlertContentRhyPaycheckModuleComposable$lambda$1 != null) {
                SduiActionHandler<GenericAction> sduiActionHandler = this.$actionHandler;
                final SnapshotState<GenericAlertContent<GenericAction>> snapshotState = this.$alertState$delegate;
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                composer.startReplaceGroup(5004770);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$RhyPaycheckModuleComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhyPaycheckModuleComposable.C103721.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                sduiAlert.Dialog(genericAlertContentRhyPaycheckModuleComposable$lambda$1, sduiActionHandler, null, (Function0) objRememberedValue, composer, (SduiAlert.$stable << 12) | 3072, 4);
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 5, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaycheckSectionContext(this.$paycheckModule.getLoggingContextScenario(), "", null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -131073, -1, -1, -1, 16383, null), null, null, 55, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            RhyPaycheckModule rhyPaycheckModule = this.$paycheckModule;
            StringToLongMapPreference stringToLongMapPreference = this.$paycheckModuleInfoBannerDismissTimeoutsPref;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            RhyPaycheckModuleComposable.MainContent(Intrinsic3.height(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Intrinsic4.Min), rhyPaycheckModule, composer, 6, 0);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 5, null);
            InfoBanner<GenericAction> infoBanner = rhyPaycheckModule.getInfoBanner();
            Float infoBannerDismissTimeout = rhyPaycheckModule.getInfoBannerDismissTimeout();
            RhyPaycheckModuleComposable.InfoBanner(modifierM5146paddingqDBjuR0$default, infoBanner, infoBannerDismissTimeout != null ? Integer.valueOf((int) infoBannerDismissTimeout.floatValue()) : null, stringToLongMapPreference, rhyPaycheckModule.getLoggingContextScenario(), composer, 0, 0);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
            RhyPaycheckModuleComposable.ActionButton(rhyPaycheckModule.getActionButton(), rhyPaycheckModule.getLoggingContextScenario(), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
            RhyPaycheckModuleComposable.RhyPaycheckModuleComposable$lambda$2(snapshotState, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void RhyPaycheckModuleComposable$lambda$2(SnapshotState<GenericAlertContent<GenericAction>> snapshotState, GenericAlertContent<? extends GenericAction> genericAlertContent) {
        snapshotState.setValue(genericAlertContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent(Modifier modifier, final RhyPaycheckModule rhyPaycheckModule, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1809188395);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(rhyPaycheckModule) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1809188395, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.MainContent (RhyPaycheckModuleComposable.kt:167)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MainColumnContent(Row5.weight$default(row6, companion2, 3.0f, false, 2, null), rhyPaycheckModule, composerStartRestartGroup, i3 & 112, 0);
            PaycheckImage(SizeKt.fillMaxHeight$default(Row5.weight$default(row6, PaddingKt.m5146paddingqDBjuR0$default(companion2, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 2.0f, false, 2, null), 0.0f, 1, null), UtilKt.toImageUrl(rhyPaycheckModule.getImageSource(), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyPaycheckModuleComposable.MainContent$lambda$6(modifier3, rhyPaycheckModule, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MainColumnContent(final Modifier modifier, final RhyPaycheckModule rhyPaycheckModule, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1299246495);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(rhyPaycheckModule) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1299246495, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.MainColumnContent (RhyPaycheckModuleComposable.kt:181)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Title(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 6, null), rhyPaycheckModule.getTitle(), composerStartRestartGroup, 0, 0);
            Subtitle(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 4, null), rhyPaycheckModule.getSubtitle(), composerStartRestartGroup, 0, 0);
            InfoRows(rhyPaycheckModule.getInfoRows(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyPaycheckModuleComposable.MainColumnContent$lambda$8(modifier, rhyPaycheckModule, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Title(Modifier modifier, final String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374301667);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374301667, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.Title (RhyPaycheckModuleComposable.kt:205)");
            }
            modifier3 = modifier4;
            BentoText2.m20747BentoText38GnDrw(str, modifier3, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyPaycheckModuleComposable.Title$lambda$9(modifier3, str, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Subtitle(Modifier modifier, final String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2063592129);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2063592129, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.Subtitle (RhyPaycheckModuleComposable.kt:214)");
            }
            if (str == null || StringsKt.isBlank(str)) {
                modifier3 = modifier4;
            } else {
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(str, modifier3, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 0, 8188);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyPaycheckModuleComposable.Subtitle$lambda$10(modifier3, str, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InfoRows(final List<? extends DataRowStacked<? extends GenericAction>> list, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1969994996);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1969994996, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.InfoRows (RhyPaycheckModuleComposable.kt:225)");
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SduiDataRow.SduiStackedDataRow((DataRowStacked) it.next(), null, null, composerStartRestartGroup, 0, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyPaycheckModuleComposable.InfoRows$lambda$12(list, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PaycheckImage(final Modifier modifier, HttpUrl httpUrl, Composer composer, final int i, final int i2) {
        int i3;
        final HttpUrl httpUrl2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1292748328);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(httpUrl) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            httpUrl2 = httpUrl;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1292748328, i5, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.PaycheckImage (RhyPaycheckModuleComposable.kt:232)");
            }
            httpUrl2 = httpUrl;
            Modifier modifier2 = modifier;
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(httpUrl, null, null, null, 0, null, composerStartRestartGroup, (i5 >> 3) & 14, 62), StringResources_androidKt.stringResource(C20692R.string.feature_card_image_content_description, composerStartRestartGroup, 0), modifier2, Alignment.INSTANCE.getTopEnd(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i5 << 6) & 896) | 27648, 96);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyPaycheckModuleComposable.PaycheckImage$lambda$13(modifier, httpUrl2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InfoBanner(Modifier modifier, final InfoBanner<? extends GenericAction> infoBanner, final Integer num, final StringToLongMapPreference stringToLongMapPreference, final String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Integer num2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-528596381);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(infoBanner) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                num2 = num;
                i3 |= composerStartRestartGroup.changed(num2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(stringToLongMapPreference) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-528596381, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.InfoBanner (RhyPaycheckModuleComposable.kt:249)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(infoBanner != null && shouldShow(infoBanner, stringToLongMapPreference)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    boolean zInfoBanner$lambda$15 = InfoBanner$lambda$15(snapshotState);
                    EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhyPaycheckModuleComposable.InfoBanner$lambda$18$lambda$17((IntSize) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EnterTransition enterTransitionPlus = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.expandIn$default(null, null, false, (Function1) objRememberedValue2, 7, null));
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhyPaycheckModuleComposable.InfoBanner$lambda$20$lambda$19((IntSize) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    AnimatedVisibilityKt.AnimatedVisibility(zInfoBanner$lambda$15, (Modifier) null, enterTransitionPlus, EnterExitTransitionKt.shrinkOut$default(null, null, false, (Function1) objRememberedValue3, 7, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambda3.rememberComposableLambda(1460024123, true, new C103713(infoBanner, current, str, modifier5, num2, stringToLongMapPreference, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RhyPaycheckModuleComposable.InfoBanner$lambda$21(modifier3, infoBanner, num, stringToLongMapPreference, str, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                boolean zInfoBanner$lambda$152 = InfoBanner$lambda$15(snapshotState2);
                EnterTransition enterTransitionFadeIn$default2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                EnterTransition enterTransitionPlus2 = enterTransitionFadeIn$default2.plus(EnterExitTransitionKt.expandIn$default(null, null, false, (Function1) objRememberedValue2, 7, null));
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                AnimatedVisibilityKt.AnimatedVisibility(zInfoBanner$lambda$152, (Modifier) null, enterTransitionPlus2, EnterExitTransitionKt.shrinkOut$default(null, null, false, (Function1) objRememberedValue3, 7, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambda3.rememberComposableLambda(1460024123, true, new C103713(infoBanner, current2, str, modifier52, num2, stringToLongMapPreference, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        num2 = num;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InfoBanner$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: RhyPaycheckModuleComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$InfoBanner$3 */
    static final class C103713 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $bannerVisible$delegate;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ InfoBanner<GenericAction> $infoBanner;
        final /* synthetic */ Integer $infoBannerDismissTimeout;
        final /* synthetic */ String $loggingContextScenario;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ StringToLongMapPreference $paycheckModuleInfoBannerDismissTimeoutsPref;

        /* JADX WARN: Multi-variable type inference failed */
        C103713(InfoBanner<? extends GenericAction> infoBanner, EventLogger eventLogger, String str, Modifier modifier, Integer num, StringToLongMapPreference stringToLongMapPreference, SnapshotState<Boolean> snapshotState) {
            this.$infoBanner = infoBanner;
            this.$eventLogger = eventLogger;
            this.$loggingContextScenario = str;
            this.$modifier = modifier;
            this.$infoBannerDismissTimeout = num;
            this.$paycheckModuleInfoBannerDismissTimeoutsPref = stringToLongMapPreference;
            this.$bannerVisible$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1460024123, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.InfoBanner.<anonymous> (RhyPaycheckModuleComposable.kt:259)");
            }
            final InfoBanner<GenericAction> infoBanner = this.$infoBanner;
            if (infoBanner != null) {
                final EventLogger eventLogger = this.$eventLogger;
                final String str = this.$loggingContextScenario;
                Modifier modifier = this.$modifier;
                final Integer num = this.$infoBannerDismissTimeout;
                final StringToLongMapPreference stringToLongMapPreference = this.$paycheckModuleInfoBannerDismissTimeoutsPref;
                final SnapshotState<Boolean> snapshotState = this.$bannerVisible$delegate;
                GenericAction genericAction = (GenericAction) infoBanner.getCta_action();
                composer.startReplaceGroup(-1371120070);
                final Function0<Unit> function0Handling = genericAction == null ? null : SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer, 0), genericAction);
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changed(str) | composer.changedInstance(infoBanner) | composer.changed(function0Handling);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$InfoBanner$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhyPaycheckModuleComposable.C103713.invoke$lambda$6$lambda$2$lambda$1(eventLogger, str, infoBanner, function0Handling);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                SpannableString spannableString$default = IconExtensions.toSpannableString$default(infoBanner.getText(), (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), null, false, null, 14, null);
                Icon icon = infoBanner.getIcon();
                String serverValue = icon != null ? icon.getServerValue() : null;
                String cta_text = infoBanner.getCta_text();
                boolean can_dismiss = infoBanner.getCan_dismiss();
                composer.startReplaceGroup(-1224400529);
                boolean zChanged = composer.changed(num) | composer.changedInstance(eventLogger) | composer.changed(str) | composer.changedInstance(infoBanner) | composer.changedInstance(infoBanner) | composer.changedInstance(stringToLongMapPreference);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$InfoBanner$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhyPaycheckModuleComposable.C103713.invoke$lambda$6$lambda$5$lambda$4(num, eventLogger, str, infoBanner, infoBanner, stringToLongMapPreference, snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                ResourceReferences4<Integer> colorResource = SduiColors2.toColorResource(infoBanner.getStyle().getText_color());
                ResourceReferences4<Integer> colorResource2 = SduiColors2.toColorResource(infoBanner.getStyle().getBackground_color());
                int i2 = ResourceReferences4.$stable;
                BentoInfoBannerComposable.BentoInfoBannerComposable(modifier, spannableString$default, serverValue, cta_text, (Function0<Unit>) function0, can_dismiss, (Function0<Unit>) objRememberedValue2, colorResource, colorResource2, composer, (i2 << 24) | (i2 << 21), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$2$lambda$1(EventLogger eventLogger, String str, InfoBanner infoBanner, Function0 function0) {
            Screen screen = new Screen(Screen.Name.RHY_SPENDING_HOME, null, null, null, 14, null);
            Component component = new Component(Component.ComponentType.PAYCHECK_SECTION, null, null, 6, null);
            String logging_identifier = infoBanner.getLogging_identifier();
            if (logging_identifier == null) {
                logging_identifier = "";
            }
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaycheckSectionContext(str, logging_identifier, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -131073, -1, -1, -1, 16383, null), false, 41, null);
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(Integer num, EventLogger eventLogger, String str, InfoBanner infoBanner, InfoBanner infoBanner2, StringToLongMapPreference stringToLongMapPreference, SnapshotState snapshotState) {
            if (num != null && num.intValue() > 0) {
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.RHY_SPENDING_HOME, null, null, null, 14, null), new Component(Component.ComponentType.PAYCHECK_SECTION, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaycheckSectionContext(str, "dismiss_" + infoBanner.getLogging_identifier(), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -131073, -1, -1, -1, 16383, null), false, 41, null);
                String logging_identifier = infoBanner2.getLogging_identifier();
                if (logging_identifier != null) {
                    Map<String, Long> mutableMap = MapsKt.toMutableMap(stringToLongMapPreference.getValues());
                    mutableMap.put(logging_identifier, Long.valueOf(new Date().getTime() + (num.intValue() * 1000)));
                    stringToLongMapPreference.setValues(mutableMap);
                }
                RhyPaycheckModuleComposable.InfoBanner$lambda$16(snapshotState, false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ActionButton(final TextButton<? extends GenericAction> textButton, final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-623115065);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(textButton) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-623115065, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.ActionButton (RhyPaycheckModuleComposable.kt:313)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final String label = textButton.getLabel();
            final Function0<Unit> function0Handling = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), textButton.getAction());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | ((i2 & 112) == 32) | composerStartRestartGroup.changed(function0Handling);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyPaycheckModuleComposable.ActionButton$lambda$23$lambda$22(current, str, function0Handling);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1774613916, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt.ActionButton.1
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
                        ComposerKt.traceEventStart(1774613916, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.ActionButton.<anonymous> (RhyPaycheckModuleComposable.kt:332)");
                    }
                    boolean zIs_enabled = textButton.is_enabled();
                    BentoTextButton2.m20715BentoTextButtonPIknLig(function0, label, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, zIs_enabled, null, composer2, 0, 88);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyPaycheckModuleComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyPaycheckModuleComposable.ActionButton$lambda$24(textButton, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionButton$lambda$23$lambda$22(EventLogger eventLogger, String str, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.RHY_SPENDING_HOME, null, null, null, 14, null), new Component(Component.ComponentType.PAYCHECK_SECTION, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaycheckSectionContext(str, "main_cta", null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -131073, -1, -1, -1, 16383, null), false, 41, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final boolean shouldShow(InfoBanner<? extends Parcelable> infoBanner, StringToLongMapPreference stringToLongMapPreference) {
        String logging_identifier = infoBanner.getLogging_identifier();
        if (logging_identifier == null) {
            return false;
        }
        Long l = stringToLongMapPreference.getValues().get(logging_identifier);
        if (l == null) {
            return true;
        }
        return new Date().after(new Date(l.longValue()));
    }
}
