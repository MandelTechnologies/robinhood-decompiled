package com.robinhood.android.matcha.p177ui.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchViewState4;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.util.Money;
import com.robinhood.p2p.common.ProfileAvatar3;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaSearchAdapter.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001d\u001e\u001fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u0014*\u00060\u0017R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u0014*\u00060\u0017R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/matcha/ui/search/Row;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "callbacks", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter$Callbacks;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter$Callbacks;)V", "boldTypeface", "Landroid/graphics/Typeface;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "bindUser", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter$ViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/matcha/ui/search/Row$RhUser;", "bindContact", "row", "Lcom/robinhood/android/matcha/ui/search/Row$Contact;", "Callbacks", "ViewHolder", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaSearchAdapter extends ListAdapter<MatchaSearchViewState4, RecyclerView.ViewHolder> {
    public static final int VIEW_TYPE_CONTACT = 1;
    public static final int VIEW_TYPE_ENABLE_CONTACTS = 3;
    public static final int VIEW_TYPE_HEADER = 2;
    public static final int VIEW_TYPE_NO_RESULTS = 5;
    public static final int VIEW_TYPE_PLACEHOLDER = 6;
    public static final int VIEW_TYPE_RH_USER = 0;
    public static final int VIEW_TYPE_SHARE_QR = 7;
    private final Typeface boldTypeface;
    private final Callbacks callbacks;
    public static final int $stable = 8;

    /* compiled from: MatchaSearchAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter$Callbacks;", "", "showUnlicensedStateError", "", "onTransactorSelected", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "onContinuePressed", "launchUserProfile", "Lcom/robinhood/android/matcha/models/ui/Transactor$User;", "onContactsRequested", "onShareQrClick", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void launchUserProfile(Transactor.User transactor);

        void onContactsRequested();

        void onContinuePressed();

        void onShareQrClick();

        void onTransactorSelected(Transactor transactor);

        void showUnlicensedStateError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaSearchAdapter(Context context, Callbacks callbacks) {
        super(DiffCallbacks.Equality.INSTANCE);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.callbacks = callbacks;
        this.boldTypeface = RhTypeface.BOLD.load(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0 || viewType == 1) {
            return new ViewHolder(this, ViewGroups.inflate$default(parent, C21284R.layout.include_matcha_search_user_row, false, 2, null), this.callbacks);
        }
        if (viewType == 2) {
            return new SimpleViewHolder(RdsHeaderRowView.INSTANCE.inflate(parent));
        }
        if (viewType == 3) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C21284R.layout.include_matcha_enable_contacts_row, false, 2, null));
        }
        if (viewType == 5) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C21284R.layout.include_matcha_search_no_results_row, false, 2, null));
        }
        if (viewType == 6) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C21284R.layout.include_matcha_search_placeholder_row, false, 2, null));
        }
        if (viewType == 7) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C21284R.layout.include_matcha_search_share_qr_row, false, 2, null));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MatchaSearchViewState4 item = getItem(position);
        if (item instanceof MatchaSearchViewState4.RhUser) {
            bindUser((ViewHolder) holder, (MatchaSearchViewState4.RhUser) item);
            return;
        }
        if (item instanceof MatchaSearchViewState4.Contact) {
            bindContact((ViewHolder) holder, (MatchaSearchViewState4.Contact) item);
            return;
        }
        if (item instanceof MatchaSearchViewState4.Header) {
            View view = ((SimpleViewHolder) holder).itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsHeaderRowView");
            RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) view;
            StringResource text = ((MatchaSearchViewState4.Header) item).getText();
            Resources resources = rdsHeaderRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            RdsHeaderRowView.bind$default(rdsHeaderRowView, text.getText(resources), true, false, null, null, 28, null);
            return;
        }
        if (item instanceof MatchaSearchViewState4.EnableContacts) {
            View view2 = ((SimpleViewHolder) holder).itemView;
            View viewFindViewById = view2.findViewById(C21284R.id.enable_contacts_button);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            OnClickListeners.onClick(viewFindViewById, new MatchaSearchAdapter2(this.callbacks));
            View viewFindViewById2 = view2.findViewById(C21284R.id.enable_contacts_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            viewFindViewById2.setVisibility(((MatchaSearchViewState4.EnableContacts) item).getShowIllustration() ? 0 : 8);
            Intrinsics.checkNotNull(view2);
            return;
        }
        if (item instanceof MatchaSearchViewState4.ShareQr) {
            View view3 = ((SimpleViewHolder) holder).itemView;
            Intrinsics.checkNotNull(view3);
            OnClickListeners.onClick(view3, new MatchaSearchAdapter3(this.callbacks));
            ((RhTextView) view3.findViewById(C21284R.id.share_qr_text)).setText(ViewsKt.getString(view3, C21284R.string.matcha_qr_amount_share_detail, Money.format$default(((MatchaSearchViewState4.ShareQr) item).getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
            Intrinsics.checkNotNull(view3);
            return;
        }
        if (!Intrinsics.areEqual(item, MatchaSearchViewState4.Placeholder.INSTANCE) && !Intrinsics.areEqual(item, MatchaSearchViewState4.NoResults.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: MatchaSearchAdapter.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "callbacks", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter;Landroid/view/View;Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter$Callbacks;)V", "getCallbacks", "()Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter$Callbacks;", "selectUserCheckbox", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchCheckBox;", "getSelectUserCheckbox", "()Lcom/robinhood/android/matcha/ui/search/MatchaSearchCheckBox;", "profileAvatarView", "Landroidx/compose/ui/platform/ComposeView;", "getProfileAvatarView", "()Landroidx/compose/ui/platform/ComposeView;", "infoButton", "Lcom/robinhood/android/designsystem/button/RdsIconButton;", "getInfoButton", "()Lcom/robinhood/android/designsystem/button/RdsIconButton;", "loadingView", "Lcom/robinhood/android/designsystem/progress/RdsProgressBar;", "getLoadingView", "()Lcom/robinhood/android/designsystem/progress/RdsProgressBar;", "textContainer", "Lcom/robinhood/android/designsystem/row/component/RdsRowTextContainerView;", "bindText", "", "primaryText", "", "secondaryText", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final Callbacks callbacks;
        private final RdsIconButton infoButton;
        private final RdsProgressBar loadingView;
        private final ComposeView profileAvatarView;
        private final MatchaSearchCheckBox selectUserCheckbox;
        private final RdsRowTextContainerView textContainer;
        final /* synthetic */ MatchaSearchAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(MatchaSearchAdapter matchaSearchAdapter, View view, Callbacks callbacks) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(callbacks, "callbacks");
            this.this$0 = matchaSearchAdapter;
            this.callbacks = callbacks;
            View viewFindViewById = view.findViewById(C21284R.id.select_transactor_checkbox);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.selectUserCheckbox = (MatchaSearchCheckBox) viewFindViewById;
            View viewFindViewById2 = view.findViewById(C21284R.id.avatar_compose_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.profileAvatarView = (ComposeView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(C21284R.id.info_button);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.infoButton = (RdsIconButton) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(C21284R.id.loading_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.loadingView = (RdsProgressBar) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(C21284R.id.row_text_container);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.textContainer = (RdsRowTextContainerView) viewFindViewById5;
        }

        public final Callbacks getCallbacks() {
            return this.callbacks;
        }

        public final MatchaSearchCheckBox getSelectUserCheckbox() {
            return this.selectUserCheckbox;
        }

        public final ComposeView getProfileAvatarView() {
            return this.profileAvatarView;
        }

        public final RdsIconButton getInfoButton() {
            return this.infoButton;
        }

        public final RdsProgressBar getLoadingView() {
            return this.loadingView;
        }

        public final void bindText(String primaryText, String secondaryText) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            RdsRowTextContainerView rdsRowTextContainerView = this.textContainer;
            MatchaSearchAdapter matchaSearchAdapter = this.this$0;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(matchaSearchAdapter.boldTypeface);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) primaryText);
            spannableStringBuilder.setSpan(customTypefaceSpan, length, spannableStringBuilder.length(), 17);
            rdsRowTextContainerView.setPrimaryText(new SpannedString(spannableStringBuilder));
            this.textContainer.setSecondaryText(secondaryText);
        }
    }

    private final void bindUser(final ViewHolder viewHolder, final MatchaSearchViewState4.RhUser rhUser) {
        viewHolder.getProfileAvatarView().setContent(ComposableLambda3.composableLambdaInstance(-614027492, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.bindUser.1
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
                    ComposerKt.traceEventStart(-614027492, i, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.bindUser.<anonymous> (MatchaSearchAdapter.kt:139)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(viewHolder.getProfileAvatarView()));
                final MatchaSearchViewState4.RhUser rhUser2 = rhUser;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(978879402, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.bindUser.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(978879402, i2, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.bindUser.<anonymous>.<anonymous> (MatchaSearchAdapter.kt:140)");
                        }
                        ProfileAvatar3.ProfileAvatar(rhUser2.getAvatar(), Modifier.INSTANCE, BentoPogSize.Standard, null, composer2, 432, 8);
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
        viewHolder.bindText(rhUser.getPrimaryText(), rhUser.getSecondaryText());
        viewHolder.getInfoButton().setVisibility(0);
        OnClickListeners.onClick(viewHolder.getInfoButton(), new Function0() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaSearchAdapter.bindUser$lambda$3(viewHolder, rhUser);
            }
        });
        MatchaSearchCheckBox selectUserCheckbox = viewHolder.getSelectUserCheckbox();
        selectUserCheckbox.setVisibility(rhUser.isCheckboxVisible() ? 0 : 8);
        selectUserCheckbox.setChecked(rhUser.isCheckboxChecked());
        OnClickListeners.onClick(selectUserCheckbox, new Function0() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaSearchAdapter.bindUser$lambda$5$lambda$4(rhUser, viewHolder);
            }
        });
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchAdapter$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaSearchAdapter.bindUser$lambda$6(rhUser, viewHolder);
            }
        });
        viewHolder.getLoadingView().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindUser$lambda$3(ViewHolder viewHolder, MatchaSearchViewState4.RhUser rhUser) {
        viewHolder.getCallbacks().launchUserProfile(rhUser.getTransactor());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindUser$lambda$5$lambda$4(MatchaSearchViewState4.RhUser rhUser, ViewHolder viewHolder) {
        if (rhUser.getInRhyLicensedState()) {
            viewHolder.getCallbacks().onTransactorSelected(rhUser.getTransactor());
        } else {
            viewHolder.getCallbacks().showUnlicensedStateError();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindUser$lambda$6(MatchaSearchViewState4.RhUser rhUser, ViewHolder viewHolder) {
        if (rhUser.getInRhyLicensedState()) {
            viewHolder.getCallbacks().onTransactorSelected(rhUser.getTransactor());
        } else {
            viewHolder.getCallbacks().showUnlicensedStateError();
        }
        return Unit.INSTANCE;
    }

    private final void bindContact(final ViewHolder viewHolder, final MatchaSearchViewState4.Contact contact) {
        viewHolder.getProfileAvatarView().setContent(ComposableLambda3.composableLambdaInstance(-1517272234, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.bindContact.1
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
                    ComposerKt.traceEventStart(-1517272234, i, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.bindContact.<anonymous> (MatchaSearchAdapter.kt:182)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(viewHolder.getProfileAvatarView()));
                final MatchaSearchViewState4.Contact contact2 = contact;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-683073308, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.bindContact.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-683073308, i2, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.bindContact.<anonymous>.<anonymous> (MatchaSearchAdapter.kt:183)");
                        }
                        ProfileAvatar3.ProfileAvatar(contact2.getAvatar(), Modifier.INSTANCE, BentoPogSize.Standard, null, composer2, 432, 8);
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
        viewHolder.bindText(contact.getPrimaryText(), contact.getSecondaryText());
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaSearchAdapter.bindContact$lambda$7(viewHolder, contact);
            }
        });
        viewHolder.getLoadingView().setVisibility(contact.isInviteLoading() ? 0 : 8);
        viewHolder.getInfoButton().setVisibility(8);
        OnClickListeners.onClick(viewHolder.getInfoButton(), null);
        viewHolder.getSelectUserCheckbox().setVisibility(8);
        OnClickListeners.onClick(viewHolder.getSelectUserCheckbox(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindContact$lambda$7(ViewHolder viewHolder, MatchaSearchViewState4.Contact contact) {
        viewHolder.getCallbacks().onTransactorSelected(contact.getTransactor());
        return Unit.INSTANCE;
    }
}
