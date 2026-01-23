package com.robinhood.android.privacysettings.p217ui.blocked;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import coil.transform.CircleCropTransformation;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.privacysettings.C25869R;
import com.robinhood.android.privacysettings.p217ui.blocked.BlockedProfilesComposable;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.social.p351ui.SocialBlockedUser;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: BlockedProfilesComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\u001am\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0011H\u0003¢\u0006\u0002\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0011H\u0003¢\u0006\u0002\u0010\u0017\u001a?\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0003¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"blockedSocialUserLoadingMock", "Lcom/robinhood/models/social/ui/SocialBlockedUser;", "BlockedProfilesComposable", "", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "showUnblockDialog", "", "isLoading", "blockedUsers", "", "unblockDialogFullName", "", "onUnblockDialogPrimaryButtonClicked", "Lkotlin/Function0;", "dismissUnblockDialog", "onRowClicked", "Lkotlin/Function1;", "(Lcom/robinhood/shared/security/auth/token/AuthTokenManager;ZZLjava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "BlockedList", "(Lcom/robinhood/shared/security/auth/token/AuthTokenManager;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "BlockedListRow", "user", "(Lcom/robinhood/shared/security/auth/token/AuthTokenManager;Lcom/robinhood/models/social/ui/SocialBlockedUser;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "UnblockDialog", "fullName", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "onDismissRequest", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-privacy-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BlockedProfilesComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedList$lambda$4(AuthTokenManager authTokenManager, List list, Function1 function1, int i, Composer composer, int i2) {
        BlockedList(authTokenManager, list, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedListRow$lambda$7(AuthTokenManager authTokenManager, SocialBlockedUser socialBlockedUser, Function1 function1, int i, Composer composer, int i2) {
        BlockedListRow(authTokenManager, socialBlockedUser, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedProfilesComposable$lambda$0(AuthTokenManager authTokenManager, boolean z, boolean z2, List list, String str, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) throws Resources.NotFoundException {
        BlockedProfilesComposable(authTokenManager, z, z2, list, str, function0, function02, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnblockDialog$lambda$8(String str, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) throws Resources.NotFoundException {
        UnblockDialog(str, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SocialBlockedUser blockedSocialUserLoadingMock() {
        return new SocialBlockedUser(new UUID(0L, 0L), new SocialBlockedUser.ProfileInfo("------------", "------------", "------------", null));
    }

    public static final void BlockedProfilesComposable(final AuthTokenManager authTokenManager, final boolean z, final boolean z2, final List<SocialBlockedUser> blockedUsers, final String str, final Function0<Unit> onUnblockDialogPrimaryButtonClicked, final Function0<Unit> dismissUnblockDialog, final Function1<? super SocialBlockedUser, Unit> onRowClicked, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        String str2;
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(blockedUsers, "blockedUsers");
        Intrinsics.checkNotNullParameter(onUnblockDialogPrimaryButtonClicked, "onUnblockDialogPrimaryButtonClicked");
        Intrinsics.checkNotNullParameter(dismissUnblockDialog, "dismissUnblockDialog");
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-208767487);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(authTokenManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(blockedUsers) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onUnblockDialogPrimaryButtonClicked) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(dismissUnblockDialog) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRowClicked) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208767487, i3, -1, "com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposable (BlockedProfilesComposable.kt:55)");
            }
            composerStartRestartGroup.startReplaceGroup(1237920140);
            if (z) {
                Intrinsics.checkNotNull(str2);
                UnblockDialog(str2, onUnblockDialogPrimaryButtonClicked, dismissUnblockDialog, dismissUnblockDialog, composerStartRestartGroup, ((i3 >> 12) & 1008) | ((i3 >> 9) & 7168));
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-278865091);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-190535073, true, new C258801(authTokenManager), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-278604040);
                BlockedList(authTokenManager, blockedUsers, onRowClicked, composerStartRestartGroup, (i3 & 14) | ((i3 >> 6) & 112) | ((i3 >> 15) & 896));
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlockedProfilesComposable.BlockedProfilesComposable$lambda$0(authTokenManager, z, z2, blockedUsers, str, onUnblockDialogPrimaryButtonClicked, dismissUnblockDialog, onRowClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: BlockedProfilesComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$BlockedProfilesComposable$1 */
    static final class C258801 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AuthTokenManager $authTokenManager;

        C258801(AuthTokenManager authTokenManager) {
            this.$authTokenManager = authTokenManager;
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
                ComposerKt.traceEventStart(-190535073, i, -1, "com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposable.<anonymous> (BlockedProfilesComposable.kt:67)");
            }
            AuthTokenManager authTokenManager = this.$authTokenManager;
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, 3);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
            Iterator<Integer> it = primitiveRanges2Until.iterator();
            while (it.hasNext()) {
                ((PrimitiveIterators6) it).nextInt();
                arrayList.add(BlockedProfilesComposable.blockedSocialUserLoadingMock());
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$BlockedProfilesComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlockedProfilesComposable.C258801.invoke$lambda$2$lambda$1((SocialBlockedUser) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BlockedProfilesComposable.BlockedList(authTokenManager, arrayList, (Function1) objRememberedValue, composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(SocialBlockedUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BlockedList(final AuthTokenManager authTokenManager, final List<SocialBlockedUser> list, final Function1<? super SocialBlockedUser, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-86826447);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(authTokenManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-86826447, i2, -1, "com.robinhood.android.privacysettings.ui.blocked.BlockedList (BlockedProfilesComposable.kt:87)");
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(authTokenManager) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlockedProfilesComposable.BlockedList$lambda$3$lambda$2(list, authTokenManager, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlockedProfilesComposable.BlockedList$lambda$4(authTokenManager, list, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedList$lambda$3$lambda$2(final List list, final AuthTokenManager authTokenManager, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-185159098, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$BlockedList$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-185159098, i, -1, "com.robinhood.android.privacysettings.ui.blocked.BlockedList.<anonymous>.<anonymous>.<anonymous> (BlockedProfilesComposable.kt:90)");
                }
                String strStringResource = StringResources_androidKt.stringResource(C25869R.string.blocked_profiles_title, composer, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25869R.string.blocked_profiles_subtitle, composer, 0), PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8188);
                if (list.isEmpty()) {
                    String strStringResource2 = StringResources_androidKt.stringResource(C25869R.string.blocked_profile_empty_label, composer, 0);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                    int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8120);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final C25872x20e884a0 c25872x20e884a0 = new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$BlockedList$lambda$3$lambda$2$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(SocialBlockedUser socialBlockedUser) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((SocialBlockedUser) obj);
            }
        };
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$BlockedList$lambda$3$lambda$2$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c25872x20e884a0.invoke(list.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$BlockedList$lambda$3$lambda$2$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                SocialBlockedUser socialBlockedUser = (SocialBlockedUser) list.get(i);
                composer.startReplaceGroup(-747505827);
                BlockedProfilesComposable.BlockedListRow(authTokenManager, socialBlockedUser, function1, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BlockedListRow(final AuthTokenManager authTokenManager, final SocialBlockedUser socialBlockedUser, final Function1<? super SocialBlockedUser, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-803987277);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(authTokenManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(socialBlockedUser) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-803987277, i2, -1, "com.robinhood.android.privacysettings.ui.blocked.BlockedListRow (BlockedProfilesComposable.kt:140)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(socialBlockedUser);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlockedProfilesComposable.BlockedListRow$lambda$6$lambda$5(function1, socialBlockedUser);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null), null, ComposableLambda3.rememberComposableLambda(-18237329, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt.BlockedListRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-18237329, i3, -1, "com.robinhood.android.privacysettings.ui.blocked.BlockedListRow.<anonymous> (BlockedProfilesComposable.kt:146)");
                    }
                    if (socialBlockedUser.getProfileInfo().getProfilePicture() != null) {
                        composer3.startReplaceGroup(-2142306977);
                        ImageRequest.Builder builderData = new ImageRequest.Builder((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(socialBlockedUser.getProfileInfo().getProfilePicture());
                        String authorizationHeader = authTokenManager.getAuthorizationHeader();
                        if (authorizationHeader != null) {
                            builderData.addHeader("Authorization", authorizationHeader);
                        }
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(builderData.transformations(new CircleCropTransformation()).build(), null, null, null, 0, null, composer3, 0, 62), (String) null, SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(48)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-2141572463);
                        BentoPogKt.m20686BentoTextPogTYpPzmw(socialBlockedUser.getInitials(), null, false, false, null, null, null, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1286907408, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt.BlockedListRow.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1286907408, i3, -1, "com.robinhood.android.privacysettings.ui.blocked.BlockedListRow.<anonymous> (BlockedProfilesComposable.kt:167)");
                    }
                    BentoText2.m20747BentoText38GnDrw(socialBlockedUser.getFullName(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1739389809, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt.BlockedListRow.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1739389809, i3, -1, "com.robinhood.android.privacysettings.ui.blocked.BlockedListRow.<anonymous> (BlockedProfilesComposable.kt:170)");
                    }
                    String username = socialBlockedUser.getProfileInfo().getUsername();
                    if (username != null) {
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(username, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextS(), composer3, 0, 0, 8186);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, BlockedProfilesComposable3.INSTANCE.m17739getLambda$797950349$feature_privacy_settings_externalDebug(), false, false, false, null, composer2, 1600896, 0, 1954);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlockedProfilesComposable.BlockedListRow$lambda$7(authTokenManager, socialBlockedUser, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedListRow$lambda$6$lambda$5(Function1 function1, SocialBlockedUser socialBlockedUser) {
        function1.invoke(socialBlockedUser);
        return Unit.INSTANCE;
    }

    private static final void UnblockDialog(String str, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i) throws Resources.NotFoundException {
        final String str2;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1838958095);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1838958095, i2, -1, "com.robinhood.android.privacysettings.ui.blocked.UnblockDialog (BlockedProfilesComposable.kt:194)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C25869R.string.blocked_profiles_unblock_dialog_title, new Object[]{str2}, composerStartRestartGroup, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C25869R.string.blocked_profiles_unblock_dialog_body, composerStartRestartGroup, 0));
            BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C25869R.string.blocked_profiles_unblock, composerStartRestartGroup, 0), function0);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composerStartRestartGroup, 0), function02);
            int i3 = BentoAlertDialog2.Body.Text.$stable << 3;
            int i4 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function03, composerStartRestartGroup, i3 | (i4 << 6) | (i4 << 12) | ((i2 << 15) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlockedProfilesComposable.UnblockDialog$lambda$8(str2, function0, function02, function03, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
