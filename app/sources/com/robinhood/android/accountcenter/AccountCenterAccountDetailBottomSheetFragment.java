package com.robinhood.android.accountcenter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.accountcenter.AccountCenterAdapter;
import com.robinhood.android.accountcenter.views.AccountCenterBannerView2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem2;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AccountCenterAccountDetailBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\r\u0010\u0012\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0014JI\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 J?\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0003¢\u0006\u0002\u0010%JW\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001dH\u0003¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u001bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterAccountDetailBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "AccountBreakdown", "section", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$CollapsedSectionItem;", "accountCenterCallbacks", "onInfoImageClicked", "Lkotlin/Function1;", "", "onCloseClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$CollapsedSectionItem;Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountTypeHeader", "title", "subtitle", "infoActionContentDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AccountLineItem", AnnotatedPrivateKey.LABEL, "valueMarkdown", "labelColor", "Landroidx/compose/ui/graphics/Color;", "valueColor", "valueLoggingIdentifier", "onValueTextClicked", "AccountLineItem-pAZo6Ak", "(Ljava/lang/String;Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", InstantRetirementAgreementComponents.MarkdownTag, "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountCenterAccountDetailBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AccountCenterAdapter.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountCenterAccountDetailBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountBreakdown$lambda$13(AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment, UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem, AccountCenterAdapter.Callbacks callbacks, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        accountCenterAccountDetailBottomSheetFragment.AccountBreakdown(collapsedSectionItem, callbacks, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountLineItem_pAZo6Ak$lambda$19(AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment, String str, String str2, long j, long j2, Modifier modifier, String str3, Function0 function0, int i, int i2, Composer composer, int i3) {
        accountCenterAccountDetailBottomSheetFragment.m10840AccountLineItempAZo6Ak(str, str2, j, j2, modifier, str3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTypeHeader$lambda$17(AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment, String str, String str2, String str3, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        accountCenterAccountDetailBottomSheetFragment.AccountTypeHeader(str, str2, str3, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment, int i, Composer composer, int i2) {
        accountCenterAccountDetailBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountCenterAdapter.Callbacks getCallbacks() {
        return (AccountCenterAdapter.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setDraggable(false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(509774285);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(509774285, i2, -1, "com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment.ComposeContent (AccountCenterAccountDetailBottomSheetFragment.kt:59)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1854978914, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1854978914, i3, -1, "com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment.ComposeContent.<anonymous> (AccountCenterAccountDetailBottomSheetFragment.kt:61)");
                    }
                    AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment = AccountCenterAccountDetailBottomSheetFragment.this;
                    UiTypedAccountCenterItem.CollapsedSectionItem collapsedSection = ((AccountCenterAccountDetailBottomSheetFragmentKey) AccountCenterAccountDetailBottomSheetFragment.INSTANCE.getArgs((Fragment) accountCenterAccountDetailBottomSheetFragment)).getCollapsedSection();
                    AccountCenterAdapter.Callbacks callbacks = AccountCenterAccountDetailBottomSheetFragment.this.getCallbacks();
                    AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment2 = AccountCenterAccountDetailBottomSheetFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(accountCenterAccountDetailBottomSheetFragment2);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new AccountCenterAccountDetailBottomSheetFragment6(accountCenterAccountDetailBottomSheetFragment2);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Function1<? super String, Unit> function1 = (Function1) ((KFunction) objRememberedValue);
                    AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment3 = AccountCenterAccountDetailBottomSheetFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(accountCenterAccountDetailBottomSheetFragment3);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new AccountCenterAccountDetailBottomSheetFragment7(accountCenterAccountDetailBottomSheetFragment3);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    accountCenterAccountDetailBottomSheetFragment.AccountBreakdown(collapsedSection, callbacks, function1, (Function0) ((KFunction) objRememberedValue2), null, composer2, 0, 16);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountCenterAccountDetailBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AccountBreakdown(final UiTypedAccountCenterItem.CollapsedSectionItem section, final AccountCenterAdapter.Callbacks accountCenterCallbacks, final Function1<? super String, Unit> onInfoImageClicked, final Function0<Unit> onCloseClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final AppCompatActivity appCompatActivityFindActivityBaseContext;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(accountCenterCallbacks, "accountCenterCallbacks");
        Intrinsics.checkNotNullParameter(onInfoImageClicked, "onInfoImageClicked");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(592704383);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(section) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(accountCenterCallbacks) : composerStartRestartGroup.changedInstance(accountCenterCallbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInfoImageClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(this) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(592704383, i4, -1, "com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment.AccountBreakdown (AccountCenterAccountDetailBottomSheetFragment.kt:77)");
                }
                appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierWeight = column6.weight(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(section) | composerStartRestartGroup.changedInstance(this) | ((i4 & 896) != 256) | composerStartRestartGroup.changedInstance(appCompatActivityFindActivityBaseContext) | ((i4 & 112) != 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(accountCenterCallbacks)));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountCenterAccountDetailBottomSheetFragment.AccountBreakdown$lambda$12$lambda$11$lambda$10(section, this, onInfoImageClicked, appCompatActivityFindActivityBaseContext, accountCenterCallbacks, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                }
                Function1 function12 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                LazyDslKt.LazyColumn(modifierWeight, null, null, false, null, null, null, false, null, function12, composerStartRestartGroup, 0, 510);
                composerStartRestartGroup = composerStartRestartGroup;
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                BentoButtonKt.m20586BentoButtonEikTQX8(onCloseClicked, strStringResource, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 5, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i4 >> 9) & 14, 0, 8184);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountCenterAccountDetailBottomSheetFragment.AccountBreakdown$lambda$13(this.f$0, section, accountCenterCallbacks, onInfoImageClicked, onCloseClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i2 & 32) == 0) {
        }
        i4 = i3;
        if ((74899 & i4) == 74898) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifierWeight2 = column62.weight(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), 1.0f, false);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                if ((i4 & 112) != 32) {
                    zChangedInstance = composerStartRestartGroup.changedInstance(section) | composerStartRestartGroup.changedInstance(this) | ((i4 & 896) != 256) | composerStartRestartGroup.changedInstance(appCompatActivityFindActivityBaseContext) | ((i4 & 112) != 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(accountCenterCallbacks)));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        Function1 function13 = new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountCenterAccountDetailBottomSheetFragment.AccountBreakdown$lambda$12$lambda$11$lambda$10(section, this, onInfoImageClicked, appCompatActivityFindActivityBaseContext, accountCenterCallbacks, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function13);
                        objRememberedValue = function13;
                        Function1 function122 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        LazyDslKt.LazyColumn(modifierWeight2, null, null, false, null, null, null, false, null, function122, composerStartRestartGroup, 0, 510);
                        composerStartRestartGroup = composerStartRestartGroup;
                        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composerStartRestartGroup, 0);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i62 = BentoTheme.$stable;
                        BentoButtonKt.m20586BentoButtonEikTQX8(onCloseClicked, strStringResource2, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 5, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i4 >> 9) & 14, 0, 8184);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountBreakdown$lambda$12$lambda$11$lambda$10(UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem, final AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment, Function1 function1, final AppCompatActivity appCompatActivity, final AccountCenterAdapter.Callbacks callbacks, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.item("account-type-header", "account_type_header", ComposableLambda3.composableLambdaInstance(-1525166966, true, new AccountCenterAccountDetailBottomSheetFragment2(collapsedSectionItem, accountCenterAccountDetailBottomSheetFragment, function1)));
        final int i = 0;
        for (Object obj : collapsedSectionItem.getItemGroups()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final UiTypedAccountCenterItem.CollapsedSectionItem.ItemGroup itemGroup = (UiTypedAccountCenterItem.CollapsedSectionItem.ItemGroup) obj;
            LazyColumn.item("item_group_" + i, "line_item", ComposableLambda3.composableLambdaInstance(-1778400125, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$AccountBreakdown$1$1$1$2$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1778400125, i3, -1, "com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment.AccountBreakdown.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountCenterAccountDetailBottomSheetFragment.kt:107)");
                    }
                    String leadingLabel = itemGroup.getLeadingLabel();
                    if (leadingLabel != null) {
                        AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment2 = accountCenterAccountDetailBottomSheetFragment;
                        String trailingLabelMarkdown = itemGroup.getTrailingLabelMarkdown();
                        if (trailingLabelMarkdown == null) {
                            trailingLabelMarkdown = "";
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        accountCenterAccountDetailBottomSheetFragment2.m10840AccountLineItempAZo6Ak(leadingLabel, trailingLabelMarkdown, bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU(), null, null, null, composer, 0, 112);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            final List<UiTypedAccountCenterItem2> items = itemGroup.getItems();
            final Function1 function12 = new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AccountCenterAccountDetailBottomSheetFragment.AccountBreakdown$lambda$12$lambda$11$lambda$10$lambda$9$lambda$1(i, (UiTypedAccountCenterItem2) obj2);
                }
            };
            final Function1 function13 = new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AccountCenterAccountDetailBottomSheetFragment.AccountBreakdown$lambda$12$lambda$11$lambda$10$lambda$9$lambda$2((UiTypedAccountCenterItem2) obj2);
                }
            };
            LazyColumn.items(items.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$AccountBreakdown$lambda$12$lambda$11$lambda$10$lambda$9$$inlined$items$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i3) {
                    return function12.invoke(items.get(i3));
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$AccountBreakdown$lambda$12$lambda$11$lambda$10$lambda$9$$inlined$items$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i3) {
                    return function13.invoke(items.get(i3));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$AccountBreakdown$lambda$12$lambda$11$lambda$10$lambda$9$$inlined$items$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(LazyItemScope lazyItemScope, int i3, Composer composer, int i4) {
                    int i5;
                    Color colorM6701boximpl;
                    final GenericAction action;
                    String valueColor;
                    ResourceReferences4<Integer> resourceReferences4MapSimpleServerColor;
                    ResourceReferences4<ColorStateList> colorStateList;
                    if ((i4 & 6) == 0) {
                        i5 = i4 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i5 = i4;
                    }
                    if ((i4 & 48) == 0) {
                        i5 |= composer.changed(i3) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final UiTypedAccountCenterItem2 uiTypedAccountCenterItem2 = (UiTypedAccountCenterItem2) items.get(i3);
                    composer.startReplaceGroup(1445286713);
                    if (uiTypedAccountCenterItem2 instanceof UiTypedAccountCenterItem.ValueItem) {
                        composer.startReplaceGroup(1445356028);
                        AppCompatActivity appCompatActivity2 = appCompatActivity;
                        Function0 function0 = null;
                        if (appCompatActivity2 != null && (valueColor = ((UiTypedAccountCenterItem.ValueItem) uiTypedAccountCenterItem2).getValueColor()) != null && (resourceReferences4MapSimpleServerColor = ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(valueColor)) != null && (colorStateList = ResourceReferences5.toColorStateList(resourceReferences4MapSimpleServerColor)) != null) {
                            Resources.Theme theme = appCompatActivity2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            ColorStateList colorStateListResolve = colorStateList.resolve(theme);
                            if (colorStateListResolve != null) {
                                colorM6701boximpl = Color.m6701boximpl(Color2.Color(colorStateListResolve.getDefaultColor()));
                            }
                            AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment2 = accountCenterAccountDetailBottomSheetFragment;
                            UiTypedAccountCenterItem.ValueItem valueItem = (UiTypedAccountCenterItem.ValueItem) uiTypedAccountCenterItem2;
                            Color color = colorM6701boximpl;
                            String description = valueItem.getDescription();
                            String raw = valueItem.getValueMarkdown().getRaw();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i6).m21426getFg20d7_KjU();
                            composer.startReplaceGroup(-2031558170);
                            if (color != null) {
                            }
                            composer.endReplaceGroup();
                            long j = jM21425getFg0d7_KjU;
                            String id = valueItem.getId();
                            action = valueItem.getAction();
                            composer.startReplaceGroup(-2031552023);
                            if (action != null) {
                            }
                            Function0 function02 = function0;
                            composer.endReplaceGroup();
                            accountCenterAccountDetailBottomSheetFragment2.m10840AccountLineItempAZo6Ak(description, raw, jM21426getFg20d7_KjU, j, null, id, function02, composer, 0, 16);
                            composer.endReplaceGroup();
                        } else {
                            colorM6701boximpl = null;
                            AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment22 = accountCenterAccountDetailBottomSheetFragment;
                            UiTypedAccountCenterItem.ValueItem valueItem2 = (UiTypedAccountCenterItem.ValueItem) uiTypedAccountCenterItem2;
                            Color color2 = colorM6701boximpl;
                            String description2 = valueItem2.getDescription();
                            String raw2 = valueItem2.getValueMarkdown().getRaw();
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i62 = BentoTheme.$stable;
                            long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composer, i62).m21426getFg20d7_KjU();
                            composer.startReplaceGroup(-2031558170);
                            long jM21425getFg0d7_KjU = color2 != null ? bentoTheme2.getColors(composer, i62).m21425getFg0d7_KjU() : color2.getValue();
                            composer.endReplaceGroup();
                            long j2 = jM21425getFg0d7_KjU;
                            String id2 = valueItem2.getId();
                            action = valueItem2.getAction();
                            composer.startReplaceGroup(-2031552023);
                            if (action != null) {
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(callbacks) | composer.changedInstance(action);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final AccountCenterAdapter.Callbacks callbacks2 = callbacks;
                                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$AccountBreakdown$1$1$1$2$4$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            callbacks2.onValueTextClicked(action);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                            }
                            Function0 function022 = function0;
                            composer.endReplaceGroup();
                            accountCenterAccountDetailBottomSheetFragment22.m10840AccountLineItempAZo6Ak(description2, raw2, jM21426getFg20d7_KjU2, j2, null, id2, function022, composer, 0, 16);
                            composer.endReplaceGroup();
                        }
                    } else {
                        if (!(uiTypedAccountCenterItem2 instanceof UiTypedAccountCenterItem.InfoBannerItem)) {
                            composer.startReplaceGroup(-2031587830);
                            composer.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(1446768729);
                        UiTypedAccountCenterItem.InfoBannerItem infoBannerItem = (UiTypedAccountCenterItem.InfoBannerItem) uiTypedAccountCenterItem2;
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(callbacks) | composer.changedInstance(uiTypedAccountCenterItem2);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final AccountCenterAdapter.Callbacks callbacks3 = callbacks;
                            objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$AccountBreakdown$1$1$1$2$4$2$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    callbacks3.onBannerClicked(((UiTypedAccountCenterItem.InfoBannerItem) uiTypedAccountCenterItem2).getAction());
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        AccountCenterBannerView2.AccountCenterInfoBanner(infoBannerItem, null, (Function0) objRememberedValue2, composer, 0, 2);
                        composer.endReplaceGroup();
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            LazyColumn.item("divider_" + i, StatisticsSection2.DIVIDER, AccountCenterAccountDetailBottomSheetFragment8.INSTANCE.getLambda$1481746412$feature_account_center_externalDebug());
            i = i2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AccountBreakdown$lambda$12$lambda$11$lambda$10$lambda$9$lambda$1(int i, UiTypedAccountCenterItem2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId() + "_" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AccountBreakdown$lambda$12$lambda$11$lambda$10$lambda$9$lambda$2(UiTypedAccountCenterItem2 itemType) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        if (itemType instanceof UiTypedAccountCenterItem.ValueItem) {
            return "value_line_item";
        }
        if (itemType instanceof UiTypedAccountCenterItem.InfoBannerItem) {
            return "info_banner_item";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AccountTypeHeader(final String str, final String str2, final String str3, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        String str4;
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2068461340);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str4 = str;
        } else if ((i & 6) == 0) {
            str4 = str;
            i3 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i2 & 16) == 0) {
                    if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                    } else {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2068461340, i3, -1, "com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment.AccountTypeHeader (AccountCenterAccountDetailBottomSheetFragment.kt:196)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 7, null);
                        Modifier modifier5 = modifier4;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM());
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        int i6 = i3;
                        BentoText2.m20747BentoText38GnDrw(str4, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, i3 & 14, 0, 8190);
                        composer2 = composerStartRestartGroup;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), str3, bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU(), ModifiersKt.autoLogEvents$default(companion3, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null), function0, false, composer2, BentoIcon4.Size24.$stable | ((i6 >> 3) & 112) | (i6 & 57344), 32);
                        composer2.endNode();
                        composer2.startReplaceGroup(-1121522042);
                        if (str2 != null) {
                            BentoText2.m20747BentoText38GnDrw(str2, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i5).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8184);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountCenterAccountDetailBottomSheetFragment.AccountTypeHeader$lambda$17(this.f$0, str, str2, str3, modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 7, null);
                    Modifier modifier52 = modifier4;
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21597getXxsmallD9Ej5fM());
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, centerVertically2, composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            int i62 = i3;
                            BentoText2.m20747BentoText38GnDrw(str4, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, i3 & 14, 0, 8190);
                            composer2 = composerStartRestartGroup;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), str3, bentoTheme2.getColors(composer2, i52).m21426getFg20d7_KjU(), ModifiersKt.autoLogEvents$default(companion32, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null), function0, false, composer2, BentoIcon4.Size24.$stable | ((i62 >> 3) & 112) | (i62 & 57344), 32);
                            composer2.endNode();
                            composer2.startReplaceGroup(-1121522042);
                            if (str2 != null) {
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 16) == 0) {
            }
            if ((i3 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
    /* renamed from: AccountLineItem-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10840AccountLineItempAZo6Ak(final String str, final String str2, final long j, final long j2, Modifier modifier, String str3, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        String str4;
        int i3;
        long j3;
        long j4;
        Modifier modifier2;
        int i4;
        String str5;
        int i5;
        Function0<Unit> function02;
        String str6;
        Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion;
        Modifier modifierAutoLogEvents$default;
        String str7;
        final Modifier modifier3;
        final Function0<Unit> function04;
        final String str8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1371959486);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str4 = str;
        } else {
            str4 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j3) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            j4 = j2;
        } else {
            j4 = j2;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(j4) ? 2048 : 1024;
            }
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    str5 = str3;
                    i3 |= composerStartRestartGroup.changed(str5) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) != 599186 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        str8 = str5;
                        function04 = function02;
                    } else {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        str6 = i4 == 0 ? null : str5;
                        function03 = i5 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1371959486, i3, -1, "com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment.AccountLineItem (AccountCenterAccountDetailBottomSheetFragment.kt:244)");
                        }
                        Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Modifier modifier5 = modifier4;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        companion = Modifier.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(str4, Row5.weight$default(row6, companion, 1.0f, false, 2, null), Color.m6701boximpl(j3), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i3 & 910, 0, 16376);
                        if (function03 != null || str6 == null) {
                            modifierAutoLogEvents$default = companion;
                            str7 = str6;
                        } else {
                            String str9 = str6;
                            str7 = str9;
                            modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ACCOUNT_CENTER, null, null, null, 14, null), UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.BUTTON, str9, null, 4, null), null, 41, null), false, false, false, true, false, null, 110, null);
                        }
                        int i7 = i3 >> 3;
                        Function0<Unit> function05 = function03;
                        BentoMarkdownText2.BentoMarkdownText(str2, modifierAutoLogEvents$default, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, j4, 0L, false, composerStartRestartGroup, (i7 & 896) | (BentoMarkdownText.$stable << 15), 27), function05, (Function1<? super String, Unit>) null, composerStartRestartGroup, (i7 & 14) | (MarkdownStyle.$stable << 6) | ((i3 >> 9) & 7168), 16);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        function04 = function05;
                        str8 = str7;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountCenterAccountDetailBottomSheetFragment.AccountLineItem_pAZo6Ak$lambda$19(this.f$0, str, str2, j, j2, modifier3, str8, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                function02 = function0;
                if ((i3 & 599187) != 599186) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Modifier modifier52 = modifier4;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        companion = Modifier.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(str4, Row5.weight$default(row62, companion, 1.0f, false, 2, null), Color.m6701boximpl(j3), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i3 & 910, 0, 16376);
                        if (function03 != null) {
                            modifierAutoLogEvents$default = companion;
                            str7 = str6;
                            int i72 = i3 >> 3;
                            Function0<Unit> function052 = function03;
                            BentoMarkdownText2.BentoMarkdownText(str2, modifierAutoLogEvents$default, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, j4, 0L, false, composerStartRestartGroup, (i72 & 896) | (BentoMarkdownText.$stable << 15), 27), function052, (Function1<? super String, Unit>) null, composerStartRestartGroup, (i72 & 14) | (MarkdownStyle.$stable << 6) | ((i3 >> 9) & 7168), 16);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                            function04 = function052;
                            str8 = str7;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str5 = str3;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i3 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        str5 = str3;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i3 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInfoImageClicked(String markdown) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new AccountCenterInfoFragmentKey(markdown), false, true, false, false, null, false, null, null, 1012, null);
    }

    /* compiled from: AccountCenterAccountDetailBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterAccountDetailBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/accountcenter/AccountCenterAccountDetailBottomSheetFragment;", "Lcom/robinhood/android/accountcenter/AccountCenterAccountDetailBottomSheetFragmentKey;", "<init>", "()V", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<AccountCenterAccountDetailBottomSheetFragment, AccountCenterAccountDetailBottomSheetFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public AccountCenterAccountDetailBottomSheetFragment createDialogFragment(AccountCenterAccountDetailBottomSheetFragmentKey accountCenterAccountDetailBottomSheetFragmentKey) {
            return (AccountCenterAccountDetailBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, accountCenterAccountDetailBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountCenterAccountDetailBottomSheetFragmentKey getArgs(AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment) {
            return (AccountCenterAccountDetailBottomSheetFragmentKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountCenterAccountDetailBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountCenterAccountDetailBottomSheetFragment newInstance(AccountCenterAccountDetailBottomSheetFragmentKey accountCenterAccountDetailBottomSheetFragmentKey) {
            return (AccountCenterAccountDetailBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, accountCenterAccountDetailBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountCenterAccountDetailBottomSheetFragment accountCenterAccountDetailBottomSheetFragment, AccountCenterAccountDetailBottomSheetFragmentKey accountCenterAccountDetailBottomSheetFragmentKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountCenterAccountDetailBottomSheetFragment, accountCenterAccountDetailBottomSheetFragmentKey);
        }
    }
}
