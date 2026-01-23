package com.robinhood.android.matcha.p177ui.history.pending.row;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.databinding.MergeMatchaTransactionRowViewBinding;
import com.robinhood.android.matcha.models.p176ui.UiMatchaUser;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowView;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.matcha.MatchaUser;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction;
import com.robinhood.models.util.Money;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.p2p.common.ProfileAvatars;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: TransactionRowView.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002-.B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010 \u001a\u00020!H\u0014J\u001e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010&J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowDuxo;", "setDuxo", "(Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowDuxo;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "binding", "Lcom/robinhood/android/matcha/databinding/MergeMatchaTransactionRowViewBinding;", "getBinding", "()Lcom/robinhood/android/matcha/databinding/MergeMatchaTransactionRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowView$Callbacks;)V", "onAttachedToWindow", "", "setTransaction", "transaction", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "retryClaim", "Lcom/robinhood/udf/UiEvent;", "bindState", "state", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState;", "handleAction", "action", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action;", "Callbacks", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TransactionRowView extends Hammer_TransactionRowView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    public TransactionRowDuxo duxo;
    public Navigator navigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransactionRowView.class, "binding", "getBinding()Lcom/robinhood/android/matcha/databinding/MergeMatchaTransactionRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransactionRowView.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0012H&¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowView$Callbacks;", "", "onTransactionActionSuccess", "", "transactionId", "Ljava/util/UUID;", "successText", "Lcom/robinhood/utils/resource/StringResource;", "onTransactionActionFailure", "throwable", "", "reviewRequestPayment", "requestId", "transactor", "Lcom/robinhood/android/matcha/models/ui/UiMatchaUser;", "amount", "Lcom/robinhood/models/util/Money;", MemoInputActivity.EXTRA_MEMO, "", "handleVerification", "verificationRequired", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired;", "viewProfile", "userId", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void handleVerification(TransactionRowState.Action.VerificationRequired verificationRequired);

        void onTransactionActionFailure(Throwable throwable);

        void onTransactionActionSuccess(UUID transactionId, StringResource successText);

        void reviewRequestPayment(UUID requestId, UiMatchaUser transactor, Money amount, String memo);

        void viewProfile(String userId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, TransactionRowView3.INSTANCE);
        ViewGroups.inflate(this, C21284R.layout.merge_matcha_transaction_row_view, true);
    }

    public final TransactionRowDuxo getDuxo() {
        TransactionRowDuxo transactionRowDuxo = this.duxo;
        if (transactionRowDuxo != null) {
            return transactionRowDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(TransactionRowDuxo transactionRowDuxo) {
        Intrinsics.checkNotNullParameter(transactionRowDuxo, "<set-?>");
        this.duxo = transactionRowDuxo;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    private final MergeMatchaTransactionRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeMatchaTransactionRowViewBinding) value;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false).subscribeKotlin(new C213671(this));
    }

    /* compiled from: TransactionRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$onAttachedToWindow$1 */
    /* synthetic */ class C213671 extends FunctionReferenceImpl implements Function1<TransactionRowState, Unit> {
        C213671(Object obj) {
            super(1, obj, TransactionRowView.class, "bindState", "bindState(Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TransactionRowState transactionRowState) throws Resources.NotFoundException {
            invoke2(transactionRowState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TransactionRowState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TransactionRowView) this.receiver).bindState(p0);
        }
    }

    public final void setTransaction(UiMatchaPendingTransaction transaction, UiEvent<Unit> retryClaim) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        getDuxo().setTransaction(transaction, retryClaim);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(final TransactionRowState state) throws Resources.NotFoundException {
        CharSequence text;
        MergeMatchaTransactionRowViewBinding binding = getBinding();
        UiEvent<TransactionRowState.Action> actionEvent = state.getActionEvent();
        CharSequence text2 = null;
        TransactionRowState.Action actionConsume = actionEvent != null ? actionEvent.consume() : null;
        if (actionConsume != null) {
            handleAction(actionConsume);
        }
        UiEvent<Unit> retryPrimaryAction = state.getRetryPrimaryAction();
        if (retryPrimaryAction != null) {
            retryPrimaryAction.consumeWith(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransactionRowView.bindState$lambda$6$lambda$0(this.f$0, state, (Unit) obj);
                }
            });
        }
        TransactionRowState4 row = state.getRow();
        if (row == null) {
            return;
        }
        final UiMatchaPendingTransaction transaction = row.getTransaction();
        final MatchaUser transactor = transaction.getTransactor();
        binding.avatarComposeView.setContent(ComposableLambda3.composableLambdaInstance(-1871866402, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$bindState$1$2

            /* compiled from: TransactionRowView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$bindState$1$2$1 */
            static final class C213661 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ UiMatchaPendingTransaction $transaction;
                final /* synthetic */ MatchaUser $transactor;
                final /* synthetic */ TransactionRowView this$0;

                C213661(UiMatchaPendingTransaction uiMatchaPendingTransaction, MatchaUser matchaUser, TransactionRowView transactionRowView) {
                    this.$transaction = uiMatchaPendingTransaction;
                    this.$transactor = matchaUser;
                    this.this$0 = transactionRowView;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    Function0 function0;
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1213477616, i, -1, "com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView.bindState.<anonymous>.<anonymous>.<anonymous> (TransactionRowView.kt:93)");
                    }
                    ProfileAvatarState avatar = ProfileAvatars.getAvatar(this.$transaction.getTransactor());
                    BentoPogSize bentoPogSize = BentoPogSize.Standard;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ApiMatchaIdentifier2 type2 = this.$transactor.getIdentifier().getType();
                    composer.startReplaceGroup(2079122731);
                    if (type2 == ApiMatchaIdentifier2.USER_UUID) {
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$transactor);
                        final TransactionRowView transactionRowView = this.this$0;
                        final MatchaUser matchaUser = this.$transactor;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0068: CONSTRUCTOR (r5v4 'objRememberedValue' java.lang.Object) = 
                                  (r3v7 'transactionRowView' com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView A[DONT_INLINE])
                                  (r4v1 'matchaUser' com.robinhood.models.db.matcha.MatchaUser A[DONT_INLINE])
                                 A[MD:(com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView, com.robinhood.models.db.matcha.MatchaUser):void (m)] (LINE:100) call: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$bindState$1$2$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView, com.robinhood.models.db.matcha.MatchaUser):void type: CONSTRUCTOR in method: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$bindState$1$2.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes8.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$bindState$1$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 31 more
                                */
                            /*
                                this = this;
                                r0 = r9 & 3
                                r1 = 2
                                if (r0 != r1) goto L10
                                boolean r0 = r8.getSkipping()
                                if (r0 != 0) goto Lc
                                goto L10
                            Lc:
                                r8.skipToGroupEnd()
                                return
                            L10:
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L1f
                                r0 = -1
                                java.lang.String r1 = "com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView.bindState.<anonymous>.<anonymous>.<anonymous> (TransactionRowView.kt:93)"
                                r2 = -1213477616(0xffffffffb7abcd10, float:-2.0480278E-5)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r2, r9, r0, r1)
                            L1f:
                                com.robinhood.models.ui.matcha.UiMatchaPendingTransaction r9 = r7.$transaction
                                com.robinhood.models.db.matcha.MatchaUser r9 = r9.getTransactor()
                                com.robinhood.p2p.common.ProfileAvatarState r0 = com.robinhood.p2p.common.ProfileAvatars.getAvatar(r9)
                                com.robinhood.compose.bento.component.BentoPogSize r2 = com.robinhood.compose.bento.component.BentoPogSize.Standard
                                androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p011ui.Modifier.INSTANCE
                                com.robinhood.models.db.matcha.MatchaUser r9 = r7.$transactor
                                com.robinhood.android.models.matcha.api.ApiMatchaIdentifier r9 = r9.getIdentifier()
                                com.robinhood.android.models.matcha.api.ApiMatchaIdentifierType r9 = r9.getType()
                                r3 = 2079122731(0x7bece52b, float:2.4600603E36)
                                r8.startReplaceGroup(r3)
                                com.robinhood.android.models.matcha.api.ApiMatchaIdentifierType r3 = com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2.USER_UUID
                                if (r9 != r3) goto L75
                                r9 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                r8.startReplaceGroup(r9)
                                com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView r9 = r7.this$0
                                boolean r9 = r8.changedInstance(r9)
                                com.robinhood.models.db.matcha.MatchaUser r3 = r7.$transactor
                                boolean r3 = r8.changedInstance(r3)
                                r9 = r9 | r3
                                com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView r3 = r7.this$0
                                com.robinhood.models.db.matcha.MatchaUser r4 = r7.$transactor
                                java.lang.Object r5 = r8.rememberedValue()
                                if (r9 != 0) goto L66
                                androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r9 = r9.getEmpty()
                                if (r5 != r9) goto L6e
                            L66:
                                com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$bindState$1$2$1$$ExternalSyntheticLambda0 r5 = new com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$bindState$1$2$1$$ExternalSyntheticLambda0
                                r5.<init>(r3, r4)
                                r8.updateRememberedValue(r5)
                            L6e:
                                kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                                r8.endReplaceGroup()
                            L73:
                                r3 = r5
                                goto L86
                            L75:
                                com.robinhood.android.models.matcha.api.ApiMatchaIdentifierType r3 = com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2.EMAIL
                                if (r9 == r3) goto L84
                                com.robinhood.android.models.matcha.api.ApiMatchaIdentifierType r3 = com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2.PHONE_NUMBER
                                if (r9 != r3) goto L7e
                                goto L84
                            L7e:
                                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                                r8.<init>()
                                throw r8
                            L84:
                                r5 = 0
                                goto L73
                            L86:
                                r8.endReplaceGroup()
                                r5 = 432(0x1b0, float:6.05E-43)
                                r6 = 0
                                r4 = r8
                                com.robinhood.p2p.common.ProfileAvatar3.ProfileAvatar(r0, r1, r2, r3, r4, r5, r6)
                                boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r8 == 0) goto L99
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            L99:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowView2.C213661.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(TransactionRowView transactionRowView, MatchaUser matchaUser) {
                            TransactionRowView.Callbacks callbacks = transactionRowView.getCallbacks();
                            if (callbacks != null) {
                                callbacks.viewProfile(matchaUser.getIdentifier().getValue());
                            }
                            return Unit.INSTANCE;
                        }
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
                            ComposerKt.traceEventStart(-1871866402, i, -1, "com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView.bindState.<anonymous>.<anonymous> (TransactionRowView.kt:92)");
                        }
                        BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(this.this$0)), null, ComposableLambda3.rememberComposableLambda(-1213477616, true, new C213661(transaction, transactor, this.this$0), composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                RdsRowTextContainerView rdsRowTextContainerView = binding.rowTextContainer;
                StringResource primaryText = row.getPrimaryText();
                Resources resources = rdsRowTextContainerView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                rdsRowTextContainerView.setPrimaryText(primaryText.getText(resources));
                Resources resources2 = rdsRowTextContainerView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                rdsRowTextContainerView.setSecondaryText(row.getSecondaryText(resources2));
                RhTextView memoText = binding.memoText;
                Intrinsics.checkNotNullExpressionValue(memoText, "memoText");
                TextViewsKt.setVisibilityText(memoText, StringsKt.nullIfEmpty(transaction.getMemo()));
                RdsButton rdsButton = binding.primaryButton;
                Intrinsics.checkNotNull(rdsButton);
                StringResource primaryButtonText = row.getPrimaryButtonText();
                if (primaryButtonText != null) {
                    Resources resources3 = rdsButton.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                    text = primaryButtonText.getText(resources3);
                } else {
                    text = null;
                }
                TextViewsKt.setVisibilityText(rdsButton, text);
                TransactionRowState4.Button primaryButton = row.getPrimaryButton();
                rdsButton.setEnabled(primaryButton != null ? primaryButton.isEnabled() : false);
                rdsButton.setLoading(state.isPrimaryButtonLoading());
                OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TransactionRowView.bindState$lambda$6$lambda$3$lambda$2(this.f$0, state);
                    }
                });
                RdsButton rdsButton2 = binding.secondaryButton;
                Intrinsics.checkNotNull(rdsButton2);
                StringResource secondaryButtonText = row.getSecondaryButtonText();
                if (secondaryButtonText != null) {
                    Resources resources4 = rdsButton2.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                    text2 = secondaryButtonText.getText(resources4);
                }
                TextViewsKt.setVisibilityText(rdsButton2, text2);
                TransactionRowState4.Button secondaryButton = row.getSecondaryButton();
                rdsButton2.setEnabled(secondaryButton != null ? secondaryButton.isEnabled() : false);
                rdsButton2.setLoading(state.isSecondaryButtonLoading());
                OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TransactionRowView.bindState$lambda$6$lambda$5$lambda$4(this.f$0, state);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit bindState$lambda$6$lambda$0(TransactionRowView transactionRowView, TransactionRowState transactionRowState, Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                transactionRowView.getDuxo().onPrimaryButtonClick(transactionRowState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit bindState$lambda$6$lambda$3$lambda$2(TransactionRowView transactionRowView, TransactionRowState transactionRowState) {
                transactionRowView.getDuxo().onPrimaryButtonClick(transactionRowState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit bindState$lambda$6$lambda$5$lambda$4(TransactionRowView transactionRowView, TransactionRowState transactionRowState) {
                transactionRowView.getDuxo().onSecondaryButtonClick(transactionRowState);
                return Unit.INSTANCE;
            }

            private final void handleAction(TransactionRowState.Action action) {
                if (action instanceof TransactionRowState.Action.Completed) {
                    TransactionRowState.Action.Completed completed = (TransactionRowState.Action.Completed) action;
                    Object objM16351getResultd1pmJ48 = completed.m16351getResultd1pmJ48();
                    Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM16351getResultd1pmJ48);
                    if (thM28553exceptionOrNullimpl == null) {
                        UiMatchaPendingTransaction uiMatchaPendingTransaction = (UiMatchaPendingTransaction) objM16351getResultd1pmJ48;
                        Callbacks callbacks = this.callbacks;
                        if (callbacks != null) {
                            callbacks.onTransactionActionSuccess(uiMatchaPendingTransaction.getId(), completed.getSuccessText());
                            return;
                        }
                        return;
                    }
                    Callbacks callbacks2 = this.callbacks;
                    if (callbacks2 != null) {
                        callbacks2.onTransactionActionFailure(thM28553exceptionOrNullimpl);
                        return;
                    }
                    return;
                }
                if (action instanceof TransactionRowState.Action.ReviewRequest) {
                    Callbacks callbacks3 = this.callbacks;
                    if (callbacks3 != null) {
                        TransactionRowState.Action.ReviewRequest reviewRequest = (TransactionRowState.Action.ReviewRequest) action;
                        callbacks3.reviewRequestPayment(reviewRequest.getRequestId(), reviewRequest.getTransactor(), reviewRequest.getAmount(), reviewRequest.getMemo());
                        return;
                    }
                    return;
                }
                if (!(action instanceof TransactionRowState.Action.VerificationRequired)) {
                    throw new NoWhenBranchMatchedException();
                }
                Callbacks callbacks4 = this.callbacks;
                if (callbacks4 != null) {
                    callbacks4.handleVerification((TransactionRowState.Action.VerificationRequired) action);
                }
            }

            /* compiled from: TransactionRowView.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Inflater<TransactionRowView> {
                private final /* synthetic */ Inflater<TransactionRowView> $$delegate_0;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // com.robinhood.utils.p409ui.view.Inflater
                public TransactionRowView inflate(ViewGroup parent) {
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    return (TransactionRowView) this.$$delegate_0.inflate(parent);
                }

                private Companion() {
                    this.$$delegate_0 = Inflater.INSTANCE.include(C21284R.layout.include_matcha_transaction_row_view);
                }
            }
        }
