package com.robinhood.android.internalassettransfers.accountselection.accountlist;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import internal_asset_transfers.proto.p475v1.IATIneligibilityReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AccountSelectionListFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$SelectSourceSinkAccountCallbacks;", "getCallbacks", "()Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$SelectSourceSinkAccountCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "SelectSourceSinkAccountCallbacks", "Args", "AccountSelectionType", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AccountSelectionListFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(SelectSourceSinkAccountCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof AccountSelectionListFragment.SelectSourceSinkAccountCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountSelectionListFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$SelectSourceSinkAccountCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AccountSelectionListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$SelectSourceSinkAccountCallbacks;", "", "onAccountSelected", "", "selectionType", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "rhsAccountNumber", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface SelectSourceSinkAccountCallbacks {
        void onAccountSelected(AccountSelectionType selectionType, String rhsAccountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(AccountSelectionListFragment accountSelectionListFragment, int i, Composer composer, int i2) {
        accountSelectionListFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectSourceSinkAccountCallbacks getCallbacks() {
        return (SelectSourceSinkAccountCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getScreen() {
        return new Screen(Screen.Name.INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION_LIST, null, ((Args) INSTANCE.getArgs((Fragment) this)).getAccountSelectionType().getIdentifier(), null, 10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-541106656);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-541106656, i2, -1, "com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment.ComposeContent (AccountSelectionListFragment.kt:39)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getScreen(), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((Args) INSTANCE.getArgs((Fragment) this)).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, 0 == true ? 1 : 0), ComposableLambda3.rememberComposableLambda(1277038677, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment.ComposeContent.1

                /* compiled from: AccountSelectionListFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ AccountSelectionListFragment this$0;

                    AnonymousClass1(AccountSelectionListFragment accountSelectionListFragment) {
                        this.this$0 = accountSelectionListFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$1$lambda$0(AccountSelectionListFragment accountSelectionListFragment, String accountNumber) {
                        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                        accountSelectionListFragment.getCallbacks().onAccountSelected(((Args) AccountSelectionListFragment.INSTANCE.getArgs((Fragment) accountSelectionListFragment)).getAccountSelectionType(), accountNumber);
                        accountSelectionListFragment.dismiss();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3$lambda$2(AccountSelectionListFragment accountSelectionListFragment) {
                        accountSelectionListFragment.dismiss();
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-573695840, i, -1, "com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment.ComposeContent.<anonymous>.<anonymous> (AccountSelectionListFragment.kt:47)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        final AccountSelectionListFragment accountSelectionListFragment = this.this$0;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Companion companion3 = AccountSelectionListFragment.INSTANCE;
                        AccountSelectionType accountSelectionType = ((Args) companion3.getArgs((Fragment) accountSelectionListFragment)).getAccountSelectionType();
                        ImmutableList3 persistentList = extensions2.toPersistentList(((Args) companion3.getArgs((Fragment) accountSelectionListFragment)).getOptions());
                        Screen screen = accountSelectionListFragment.getScreen();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(accountSelectionListFragment);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountSelectionListFragment.C190241.AnonymousClass1.invoke$lambda$4$lambda$1$lambda$0(accountSelectionListFragment, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(accountSelectionListFragment);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountSelectionListFragment.C190241.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2(accountSelectionListFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        AccountSelectionListScreen.AccountSelectionListScreen(column6, accountSelectionType, persistentList, screen, function1, (Function0) objRememberedValue2, ModifiersKt.logScreenTransitions$default(companion, null, 1, null), composer, 6, 0);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

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
                        ComposerKt.traceEventStart(1277038677, i3, -1, "com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment.ComposeContent.<anonymous> (AccountSelectionListFragment.kt:46)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-573695840, true, new AnonymousClass1(AccountSelectionListFragment.this), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectionListFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountSelectionListFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$Args;", "Landroid/os/Parcelable;", "accountSelectionType", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "options", "", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$Args$AccountSelectionOption;", "source", "", "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;Ljava/util/List;Ljava/lang/String;)V", "getAccountSelectionType", "()Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "getOptions", "()Ljava/util/List;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AccountSelectionOption", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AccountSelectionType accountSelectionType;
        private final List<AccountSelectionOption> options;
        private final String source;

        /* compiled from: AccountSelectionListFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                AccountSelectionType accountSelectionTypeValueOf = AccountSelectionType.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AccountSelectionOption.CREATOR.createFromParcel(parcel));
                }
                return new Args(accountSelectionTypeValueOf, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, AccountSelectionType accountSelectionType, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                accountSelectionType = args.accountSelectionType;
            }
            if ((i & 2) != 0) {
                list = args.options;
            }
            if ((i & 4) != 0) {
                str = args.source;
            }
            return args.copy(accountSelectionType, list, str);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountSelectionType getAccountSelectionType() {
            return this.accountSelectionType;
        }

        public final List<AccountSelectionOption> component2() {
            return this.options;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(AccountSelectionType accountSelectionType, List<AccountSelectionOption> options, String source) {
            Intrinsics.checkNotNullParameter(accountSelectionType, "accountSelectionType");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(accountSelectionType, options, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.accountSelectionType == args.accountSelectionType && Intrinsics.areEqual(this.options, args.options) && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            return (((this.accountSelectionType.hashCode() * 31) + this.options.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Args(accountSelectionType=" + this.accountSelectionType + ", options=" + this.options + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountSelectionType.name());
            List<AccountSelectionOption> list = this.options;
            dest.writeInt(list.size());
            Iterator<AccountSelectionOption> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.source);
        }

        public Args(AccountSelectionType accountSelectionType, List<AccountSelectionOption> options, String source) {
            Intrinsics.checkNotNullParameter(accountSelectionType, "accountSelectionType");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(source, "source");
            this.accountSelectionType = accountSelectionType;
            this.options = options;
            this.source = source;
        }

        public final AccountSelectionType getAccountSelectionType() {
            return this.accountSelectionType;
        }

        public final List<AccountSelectionOption> getOptions() {
            return this.options;
        }

        public final String getSource() {
            return this.source;
        }

        /* compiled from: AccountSelectionListFragment.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$Args$AccountSelectionOption;", "Landroid/os/Parcelable;", "account", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "isEligible", "", "ineligibilityReason", "Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;ZLinternal_asset_transfers/proto/v1/IATIneligibilityReason;)V", "getAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "()Z", "getIneligibilityReason", "()Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountSelectionOption implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<AccountSelectionOption> CREATOR = new Creator();
            private final UiIatAccount account;
            private final IATIneligibilityReason ineligibilityReason;
            private final boolean isEligible;

            /* compiled from: AccountSelectionListFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountSelectionOption> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AccountSelectionOption createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AccountSelectionOption(UiIatAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : IATIneligibilityReason.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AccountSelectionOption[] newArray(int i) {
                    return new AccountSelectionOption[i];
                }
            }

            public static /* synthetic */ AccountSelectionOption copy$default(AccountSelectionOption accountSelectionOption, UiIatAccount uiIatAccount, boolean z, IATIneligibilityReason iATIneligibilityReason, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiIatAccount = accountSelectionOption.account;
                }
                if ((i & 2) != 0) {
                    z = accountSelectionOption.isEligible;
                }
                if ((i & 4) != 0) {
                    iATIneligibilityReason = accountSelectionOption.ineligibilityReason;
                }
                return accountSelectionOption.copy(uiIatAccount, z, iATIneligibilityReason);
            }

            /* renamed from: component1, reason: from getter */
            public final UiIatAccount getAccount() {
                return this.account;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsEligible() {
                return this.isEligible;
            }

            /* renamed from: component3, reason: from getter */
            public final IATIneligibilityReason getIneligibilityReason() {
                return this.ineligibilityReason;
            }

            public final AccountSelectionOption copy(UiIatAccount account, boolean isEligible, IATIneligibilityReason ineligibilityReason) {
                Intrinsics.checkNotNullParameter(account, "account");
                return new AccountSelectionOption(account, isEligible, ineligibilityReason);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccountSelectionOption)) {
                    return false;
                }
                AccountSelectionOption accountSelectionOption = (AccountSelectionOption) other;
                return Intrinsics.areEqual(this.account, accountSelectionOption.account) && this.isEligible == accountSelectionOption.isEligible && this.ineligibilityReason == accountSelectionOption.ineligibilityReason;
            }

            public int hashCode() {
                int iHashCode = ((this.account.hashCode() * 31) + Boolean.hashCode(this.isEligible)) * 31;
                IATIneligibilityReason iATIneligibilityReason = this.ineligibilityReason;
                return iHashCode + (iATIneligibilityReason == null ? 0 : iATIneligibilityReason.hashCode());
            }

            public String toString() {
                return "AccountSelectionOption(account=" + this.account + ", isEligible=" + this.isEligible + ", ineligibilityReason=" + this.ineligibilityReason + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.account.writeToParcel(dest, flags);
                dest.writeInt(this.isEligible ? 1 : 0);
                IATIneligibilityReason iATIneligibilityReason = this.ineligibilityReason;
                if (iATIneligibilityReason == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(iATIneligibilityReason.name());
                }
            }

            public AccountSelectionOption(UiIatAccount account, boolean z, IATIneligibilityReason iATIneligibilityReason) {
                Intrinsics.checkNotNullParameter(account, "account");
                this.account = account;
                this.isEligible = z;
                this.ineligibilityReason = iATIneligibilityReason;
            }

            public /* synthetic */ AccountSelectionOption(UiIatAccount uiIatAccount, boolean z, IATIneligibilityReason iATIneligibilityReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiIatAccount, z, (i & 4) != 0 ? null : iATIneligibilityReason);
            }

            public final UiIatAccount getAccount() {
                return this.account;
            }

            public final boolean isEligible() {
                return this.isEligible;
            }

            public final IATIneligibilityReason getIneligibilityReason() {
                return this.ineligibilityReason;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountSelectionListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "SOURCE", "SINK", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountSelectionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountSelectionType[] $VALUES;
        private final String identifier;
        public static final AccountSelectionType SOURCE = new AccountSelectionType("SOURCE", 0, "source");
        public static final AccountSelectionType SINK = new AccountSelectionType("SINK", 1, "destination");

        private static final /* synthetic */ AccountSelectionType[] $values() {
            return new AccountSelectionType[]{SOURCE, SINK};
        }

        public static EnumEntries<AccountSelectionType> getEntries() {
            return $ENTRIES;
        }

        private AccountSelectionType(String str, int i, String str2) {
            this.identifier = str2;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        static {
            AccountSelectionType[] accountSelectionTypeArr$values = $values();
            $VALUES = accountSelectionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountSelectionTypeArr$values);
        }

        public static AccountSelectionType valueOf(String str) {
            return (AccountSelectionType) Enum.valueOf(AccountSelectionType.class, str);
        }

        public static AccountSelectionType[] values() {
            return (AccountSelectionType[]) $VALUES.clone();
        }
    }

    /* compiled from: AccountSelectionListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment;", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AccountSelectionListFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AccountSelectionListFragment accountSelectionListFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, accountSelectionListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountSelectionListFragment newInstance(Args args) {
            return (AccountSelectionListFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountSelectionListFragment accountSelectionListFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, accountSelectionListFragment, args);
        }
    }
}
