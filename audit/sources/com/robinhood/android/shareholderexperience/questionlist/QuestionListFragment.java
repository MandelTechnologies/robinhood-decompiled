package com.robinhood.android.shareholderexperience.questionlist;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.ShareholderLogger;
import com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment;
import com.robinhood.android.shareholderexperience.databinding.FragmentQuestionListBinding;
import com.robinhood.android.shareholderexperience.questionlist.DropdownSelectionBottomSheetFragment;
import com.robinhood.android.shareholderexperience.questionlist.QuestionConfirmDeleteDialogFragment;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListAdapter;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListEvent;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListFragment;
import com.robinhood.android.shareholderexperience.questionlist.QuestionModalDialogFragment;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.experimental.api.ButtonIcon;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shareholderx.models.p401db.DropdownItem;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestionEmptyStateAction;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestionsResponse;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: QuestionListFragment.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002lmB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u000200H\u0016J\b\u00106\u001a\u000200H\u0016J\b\u00107\u001a\u000200H\u0016J\u0018\u00108\u001a\u0002002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u0002002\u0006\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u0002002\u0006\u0010G\u001a\u00020HH\u0016J&\u0010I\u001a\u0002002\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0OH\u0016J\u0010\u0010P\u001a\u0002002\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u0002002\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010T\u001a\u0002002\u0006\u0010Q\u001a\u00020RH\u0016J\u0018\u0010U\u001a\u0002002\u0006\u0010V\u001a\u00020K2\u0006\u0010>\u001a\u00020MH\u0016J\u0010\u0010W\u001a\u0002002\u0006\u0010X\u001a\u00020YH\u0016J\b\u0010Z\u001a\u000200H\u0016J\u0010\u0010[\u001a\u0002002\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010\\\u001a\u0002002\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010]\u001a\u0002002\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010^\u001a\u0002002\u0006\u0010Q\u001a\u00020RH\u0016J\u0012\u0010_\u001a\u0002002\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u0010\u0010b\u001a\u0002002\u0006\u0010c\u001a\u00020dH\u0002J\u0010\u0010e\u001a\u0002002\u0006\u0010G\u001a\u00020HH\u0002J\u0018\u0010f\u001a\u0002002\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020aH\u0002J\u0010\u0010j\u001a\u0002002\u0006\u0010k\u001a\u00020aH\u0002R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR+\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b,\u0010-¨\u0006n"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$Callbacks;", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionConfirmDeleteDialogFragment$Callbacks;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionActionCallbacks;", "Landroidx/core/view/MenuProvider;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "shareholderLogger", "Lcom/robinhood/android/shareholderexperience/ShareholderLogger;", "getShareholderLogger", "()Lcom/robinhood/android/shareholderexperience/ShareholderLogger;", "setShareholderLogger", "(Lcom/robinhood/android/shareholderexperience/ShareholderLogger;)V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionListBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListDuxo;", "getDuxo", "()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListFragment$Config;", "config", "getConfig", "()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListFragment$Config;", "setConfig", "(Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListFragment$Config;)V", "config$delegate", "Lkotlin/properties/ReadWriteProperty;", "adapter", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "onStop", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onMenuItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onDialogDismissed", "id", "", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onEventInfoClicked", "metadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "onDropdownChipClicked", "type", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownType;", "activeItem", "Lcom/robinhood/shareholderx/models/db/DropdownItem;", "options", "", "onVoteClicked", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "onCardClicked", "onQuestionCardCornerActionClicked", "onItemSelected", "dropdownType", "onEmptyStateActionClicked", "state", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse$EmptyState;", "onRetryClicked", "onDeleteClicked", "onShareClicked", "onDeleteQuestionConfirmed", "onQuestionBound", "showSnackbar", "snackbarText", "", "bindViewState", "viewState", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListViewState;", "bindFooter", "onCtaClicked", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", AnnotatedPrivateKey.LABEL, "handleDeeplinkAppendingEventInfo", "uri", "Config", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class QuestionListFragment extends BaseFragment implements QuestionListAdapter.Callbacks, DropdownSelectionBottomSheetFragment.Callbacks, QuestionConfirmDeleteDialogFragment.Callbacks, QuestionActionCallbacks, MenuProvider {
    private static final String ANSWERED_QUESTIONS_TAG = "answeredQuestions";
    private static final String DELETE_QUESTION_TAG = "deleteQuestion";
    private static final String DROPDOWN_TAG = "questionsListDropdown";
    private static final String METADATA_FAILED_TAG = "metadataFailed";
    private static final String MULTI_ACTION_TAG = "questionMultiAction";
    private static final String QUERY_EVENT_SLUG = "event_slug";
    private static final String QUERY_INSTRUMENT_ID = "instrument_id";
    private static final String QUESTION_MODAL_TAG = "questionModal";
    private final QuestionListAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: config$delegate, reason: from kotlin metadata */
    private final Interfaces3 config;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public ShareholderLogger shareholderLogger;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionListFragment.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionListBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(QuestionListFragment.class, "config", "getConfig()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListFragment$Config;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: QuestionListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareholderQuestionEmptyStateAction.values().length];
            try {
                iArr[ShareholderQuestionEmptyStateAction.DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareholderQuestionEmptyStateAction.RESET_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareholderQuestionEmptyStateAction.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        super.onMenuClosed(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onPrepareMenu(Menu menu) {
        super.onPrepareMenu(menu);
    }

    public QuestionListFragment() {
        super(C28477R.layout.fragment_question_list);
        this.useDesignSystemToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, QuestionListFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, QuestionListDuxo.class);
        this.config = (Interfaces3) BindSavedState2.savedParcelable(this, new Config(false, null, null, null, 15, null)).provideDelegate(this, $$delegatedProperties[1]);
        this.adapter = new QuestionListAdapter(this);
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionListFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    public final ShareholderLogger getShareholderLogger() {
        ShareholderLogger shareholderLogger = this.shareholderLogger;
        if (shareholderLogger != null) {
            return shareholderLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shareholderLogger");
        return null;
    }

    public final void setShareholderLogger(ShareholderLogger shareholderLogger) {
        Intrinsics.checkNotNullParameter(shareholderLogger, "<set-?>");
        this.shareholderLogger = shareholderLogger;
    }

    private final FragmentQuestionListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentQuestionListBinding) value;
    }

    private final QuestionListDuxo getDuxo() {
        return (QuestionListDuxo) this.duxo.getValue();
    }

    private final Config getConfig() {
        return (Config) this.config.getValue(this, $$delegatedProperties[1]);
    }

    private final void setConfig(Config config) {
        this.config.setValue(this, $$delegatedProperties[1], config);
    }

    /* compiled from: QuestionListFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListFragment$Config;", "Landroid/os/Parcelable;", "shareEnabled", "", "foregroundIsDark", "shareCopy", "", "instrumentId", "Ljava/util/UUID;", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/UUID;)V", "getShareEnabled", "()Z", "getForegroundIsDark", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShareCopy", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/UUID;)Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListFragment$Config;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Config implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Config> CREATOR = new Creator();
        private final Boolean foregroundIsDark;
        private final UUID instrumentId;
        private final String shareCopy;
        private final boolean shareEnabled;

        /* compiled from: QuestionListFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Config(z, boolValueOf, parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i) {
                return new Config[i];
            }
        }

        public Config() {
            this(false, null, null, null, 15, null);
        }

        public static /* synthetic */ Config copy$default(Config config, boolean z, Boolean bool, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = config.shareEnabled;
            }
            if ((i & 2) != 0) {
                bool = config.foregroundIsDark;
            }
            if ((i & 4) != 0) {
                str = config.shareCopy;
            }
            if ((i & 8) != 0) {
                uuid = config.instrumentId;
            }
            return config.copy(z, bool, str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShareEnabled() {
            return this.shareEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getForegroundIsDark() {
            return this.foregroundIsDark;
        }

        /* renamed from: component3, reason: from getter */
        public final String getShareCopy() {
            return this.shareCopy;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Config copy(boolean shareEnabled, Boolean foregroundIsDark, String shareCopy, UUID instrumentId) {
            return new Config(shareEnabled, foregroundIsDark, shareCopy, instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return this.shareEnabled == config.shareEnabled && Intrinsics.areEqual(this.foregroundIsDark, config.foregroundIsDark) && Intrinsics.areEqual(this.shareCopy, config.shareCopy) && Intrinsics.areEqual(this.instrumentId, config.instrumentId);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.shareEnabled) * 31;
            Boolean bool = this.foregroundIsDark;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.shareCopy;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            UUID uuid = this.instrumentId;
            return iHashCode3 + (uuid != null ? uuid.hashCode() : 0);
        }

        public String toString() {
            return "Config(shareEnabled=" + this.shareEnabled + ", foregroundIsDark=" + this.foregroundIsDark + ", shareCopy=" + this.shareCopy + ", instrumentId=" + this.instrumentId + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.shareEnabled ? 1 : 0);
            Boolean bool = this.foregroundIsDark;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
            dest.writeString(this.shareCopy);
            dest.writeSerializable(this.instrumentId);
        }

        public Config(boolean z, Boolean bool, String str, UUID uuid) {
            this.shareEnabled = z;
            this.foregroundIsDark = bool;
            this.shareCopy = str;
            this.instrumentId = uuid;
        }

        public /* synthetic */ Config(boolean z, Boolean bool, String str, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : uuid);
        }

        public final boolean getShareEnabled() {
            return this.shareEnabled;
        }

        public final Boolean getForegroundIsDark() {
            return this.foregroundIsDark;
        }

        public final String getShareCopy() {
            return this.shareCopy;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(QuestionListFragment questionListFragment) {
        return new ToolbarScrollAnimator(questionListFragment.requireToolbar(), questionListFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fragmentActivityRequireActivity.addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED);
        ShareholderLogger shareholderLogger = getShareholderLogger();
        Screen.Name name = Screen.Name.SHAREHOLDER_QUESTIONS_LIST;
        Companion companion = INSTANCE;
        ShareholderLogger.initialize$default(shareholderLogger, null, name, ((LegacyFragmentKey.ShareholderEventQuestionList) companion.getArgs((Fragment) this)).getInstrumentId(), ((LegacyFragmentKey.ShareholderEventQuestionList) companion.getArgs((Fragment) this)).getEventSlug(), ((LegacyFragmentKey.ShareholderEventQuestionList) companion.getArgs((Fragment) this)).getEntryPoint(), 1, null);
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        RecyclerView questionListRecyclerView = getBinding().questionListRecyclerView;
        Intrinsics.checkNotNullExpressionValue(questionListRecyclerView, "questionListRecyclerView");
        ToolbarScrollAnimator.subscribe$default(toolbarScrollAnimator, questionListRecyclerView, this, null, 4, null);
        getBinding().questionListRecyclerView.setAdapter(this.adapter);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C285201(this));
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListFragment.onStart.2
            @Override // io.reactivex.functions.Function
            public final Config apply(QuestionListViewState state) {
                String shareCopy;
                QaEventMetadata.Header header;
                QaEventMetadata.Header.Branding branding;
                Intrinsics.checkNotNullParameter(state, "state");
                boolean eventIsShareable = state.getEventIsShareable();
                QaEventMetadata eventMetadata = state.getEventMetadata();
                Boolean foregroundIsDark = (eventMetadata == null || (header = eventMetadata.getHeader()) == null || (branding = header.getBranding()) == null) ? null : branding.getForegroundIsDark();
                QaEventMetadata eventMetadata2 = state.getEventMetadata();
                if (eventMetadata2 == null || (shareCopy = eventMetadata2.getShareCopy()) == null) {
                    shareCopy = "";
                }
                QaEventMetadata eventMetadata3 = state.getEventMetadata();
                return new Config(eventIsShareable, foregroundIsDark, shareCopy, eventMetadata3 != null ? eventMetadata3.getInstrumentId() : null);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListFragment.onStart$lambda$1(this.f$0, (QuestionListFragment.Config) obj);
            }
        });
    }

    /* compiled from: QuestionListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionListFragment$onStart$1 */
    /* synthetic */ class C285201 extends FunctionReferenceImpl implements Function1<QuestionListViewState, Unit> {
        C285201(Object obj) {
            super(1, obj, QuestionListFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(QuestionListViewState questionListViewState) {
            invoke2(questionListViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(QuestionListViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((QuestionListFragment) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(QuestionListFragment questionListFragment, Config config) {
        Intrinsics.checkNotNull(config);
        questionListFragment.setConfig(config);
        questionListFragment.requireBaseActivity().invalidateOptionsMenu();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        RecyclerView questionListRecyclerView = getBinding().questionListRecyclerView;
        Intrinsics.checkNotNullExpressionValue(questionListRecyclerView, "questionListRecyclerView");
        toolbarScrollAnimator.dispatchScroll(questionListRecyclerView);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setColorControlNormalOverride(null);
        }
        getShareholderLogger().logScreenDisappearance();
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater inflater) {
        int i;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (getConfig().getShareEnabled()) {
            inflater.inflate(C28477R.menu.menu_shareholder, menu);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Boolean foregroundIsDark = getConfig().getForegroundIsDark();
        if (foregroundIsDark != null) {
            if (foregroundIsDark.booleanValue()) {
                i = C20690R.attr.colorBlack;
            } else {
                i = C20690R.attr.colorWhite;
            }
            overrideMenuItemTint(Integer.valueOf(ThemeColors.getThemeColor(contextRequireContext, i)));
            ShareholderLogger.logAppearance$default(getShareholderLogger(), Component.ComponentType.BUTTON, UserInteractionEventData.Action.SHARE, null, 4, null);
        }
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != C28477R.id.share_shareholder_experience) {
            return false;
        }
        String shareCopy = getConfig().getShareCopy();
        if (shareCopy != null) {
            com.robinhood.android.shareholderexperience.UtilKt.share(this, shareCopy);
        }
        ShareholderLogger.logTap$default(getShareholderLogger(), Component.ComponentType.BUTTON, UserInteractionEventData.Action.SHARE, null, null, 12, null);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C28477R.id.dialog_id_fetch_metadata_failed) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ScarletManager2.overrideAttribute(toolbar.getLoadingView(), R.attr.indeterminateTint, ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_1());
        ResourceValue.Companion companion = ResourceValue.INSTANCE;
        ScarletManager2.overrideAttribute(toolbar, R.attr.backgroundTint, companion.getEMPTY());
        ScarletManager2.overrideAttribute(toolbar.getToolbar(), R$attr.colorControlNormal, companion.getEMPTY());
        ScarletManager2.overrideAttribute(toolbar.getToolbar(), R$attr.titleTextAppearance, companion.getEMPTY());
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionListHeaderView.Callbacks
    public void onEventInfoClicked(QaEventMetadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.ShareholderEventInfo(metadata, getConfig().getShareEnabled()), false, false, false, false, null, false, null, null, 1020, null);
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionListHeaderView.Callbacks
    public void onDropdownChipClicked(DropdownType type2, DropdownItem activeItem, List<DropdownItem> options) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(activeItem, "activeItem");
        Intrinsics.checkNotNullParameter(options, "options");
        DropdownSelectionBottomSheetFragment dropdownSelectionBottomSheetFragment = (DropdownSelectionBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(DropdownSelectionBottomSheetFragment.INSTANCE, new DropdownSelectionBottomSheetFragment.Args(type2, activeItem, options, null, 8, null), this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        dropdownSelectionBottomSheetFragment.show(parentFragmentManager, DROPDOWN_TAG);
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionActionCallbacks
    public void onVoteClicked(ShareholderQuestion question) {
        String tooltip;
        Intrinsics.checkNotNullParameter(question, "question");
        ShareholderQuestion.VoteButton voteButton = question.getVoteButton();
        if (voteButton != null && (tooltip = voteButton.getTooltip()) != null) {
            showSnackbar(tooltip);
        } else {
            getDuxo().onVoteClicked(question);
            ShareholderLogger.logTap$default(getShareholderLogger(), Component.ComponentType.BUTTON, UserInteractionEventData.Action.VOTE, null, question.getVoteButton(), 4, null);
        }
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionCardView.Callbacks
    public void onCardClicked(ShareholderQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        getDuxo().onCardClicked(question);
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionCardView.Callbacks
    public void onQuestionCardCornerActionClicked(ShareholderQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        if (question.getCanDelete()) {
            QuestionMultiActionBottomSheetFragment questionMultiActionBottomSheetFragment = (QuestionMultiActionBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(QuestionMultiActionBottomSheetFragment.INSTANCE, question, this, 0, 4, null);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            questionMultiActionBottomSheetFragment.show(parentFragmentManager, MULTI_ACTION_TAG);
            return;
        }
        onShareClicked(question);
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.DropdownSelectionBottomSheetFragment.Callbacks
    public void onItemSelected(DropdownType dropdownType, DropdownItem item) {
        Intrinsics.checkNotNullParameter(dropdownType, "dropdownType");
        Intrinsics.checkNotNullParameter(item, "item");
        getDuxo().setDropdownSelection(dropdownType, item);
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionListEmptyStateView.Callbacks
    public void onEmptyStateActionClicked(ShareholderQuestionsResponse.EmptyState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ShareholderQuestionEmptyStateAction actionType = state.getActionType();
        if (actionType == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()];
        if (i == 1) {
            String deeplink = state.getDeeplink();
            if (deeplink != null) {
                handleDeeplinkAppendingEventInfo(deeplink);
                return;
            } else {
                getDuxo().retry();
                return;
            }
        }
        if (i == 2) {
            getDuxo().resetFilter();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            getDuxo().retry();
        }
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionListEmptyStateView.Callbacks
    public void onRetryClicked() {
        getDuxo().retry();
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionActionCallbacks
    public void onDeleteClicked(ShareholderQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        QuestionConfirmDeleteDialogFragment questionConfirmDeleteDialogFragment = (QuestionConfirmDeleteDialogFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(QuestionConfirmDeleteDialogFragment.INSTANCE, question, this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        questionConfirmDeleteDialogFragment.show(parentFragmentManager, DELETE_QUESTION_TAG);
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionActionCallbacks
    public void onShareClicked(ShareholderQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        String shareCopy = question.getShareCopy();
        if (shareCopy != null) {
            com.robinhood.android.shareholderexperience.UtilKt.share(this, shareCopy);
        }
        ShareholderLogger.logTap$default(getShareholderLogger(), Component.ComponentType.BUTTON, UserInteractionEventData.Action.SHARE, null, question.getVoteButton(), 4, null);
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionConfirmDeleteDialogFragment.Callbacks
    public void onDeleteQuestionConfirmed(ShareholderQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        getDuxo().deleteQuestion(question);
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionListAdapter.Callbacks
    public void onQuestionBound(ShareholderQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        getShareholderLogger().logAppearance(Component.ComponentType.BUTTON, UserInteractionEventData.Action.SHARE, question);
    }

    private final void showSnackbar(String snackbarText) {
        if (snackbarText == null || snackbarText.length() == 0) {
            return;
        }
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        companion.make(root, snackbarText, 0).setAnchorView(getBinding().questionListFooter).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(QuestionListViewState viewState) {
        QaEventMetadata.Header header;
        this.adapter.submitList(viewState.getListItems());
        getBinding().questionListFooterCta.setLoading(viewState.getShowCtaLoading());
        RhToolbar rhToolbar = requireBaseActivity().getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(viewState.getShowNavBarLoading());
        }
        QaEventMetadata eventMetadata = viewState.getEventMetadata();
        if (eventMetadata != null) {
            bindFooter(eventMetadata);
        }
        QaEventMetadata eventMetadata2 = viewState.getEventMetadata();
        if (eventMetadata2 != null && (header = eventMetadata2.getHeader()) != null) {
            com.robinhood.android.shareholderexperience.UtilKt.bindToolbar(this, header);
        }
        UiEvent<QuestionListEvent> event = viewState.getEvent();
        QuestionListEvent questionListEventConsume = event != null ? event.consume() : null;
        if (questionListEventConsume instanceof QuestionListEvent.QuestionDeletionSucceeded) {
            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
            ConstraintLayout root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            companion.make(root, C28477R.string.delete_question_success, -1).setAnchorView(getBinding().questionListFooter).show();
        } else if (questionListEventConsume instanceof QuestionListEvent.ShowAnswersBottomSheet) {
            QuestionListEvent.ShowAnswersBottomSheet showAnswersBottomSheet = (QuestionListEvent.ShowAnswersBottomSheet) questionListEventConsume;
            AnsweredQuestionsBottomSheetFragment answeredQuestionsBottomSheetFragment = (AnsweredQuestionsBottomSheetFragment) AnsweredQuestionsBottomSheetFragment.INSTANCE.newInstance((Parcelable) new AnsweredQuestionsBottomSheetFragment.Args(showAnswersBottomSheet.getMetadata(), showAnswersBottomSheet.getQuestions(), showAnswersBottomSheet.getActiveQuestion()));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            answeredQuestionsBottomSheetFragment.show(childFragmentManager, ANSWERED_QUESTIONS_TAG);
        } else if (questionListEventConsume instanceof QuestionListEvent.ShowFirstTimeExperience) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            QaEventMetadata eventMetadata3 = ((QuestionListEvent.ShowFirstTimeExperience) questionListEventConsume).getEventMetadata();
            Companion companion2 = INSTANCE;
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.ShareholderExperienceIntro(eventMetadata3, ((LegacyFragmentKey.ShareholderEventQuestionList) companion2.getArgs((Fragment) this)).getQuestionId(), ((LegacyFragmentKey.ShareholderEventQuestionList) companion2.getArgs((Fragment) this)).getEntryPoint()), false, false, false, false, null, false, null, null, 1020, null);
            requireActivity().finish();
        } else if (questionListEventConsume instanceof QuestionListEvent.ShowQuestionModal) {
            QuestionListEvent.ShowQuestionModal showQuestionModal = (QuestionListEvent.ShowQuestionModal) questionListEventConsume;
            QuestionModalDialogFragment questionModalDialogFragment = (QuestionModalDialogFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(QuestionModalDialogFragment.INSTANCE, new QuestionModalDialogFragment.Args(showQuestionModal.getQuestion(), showQuestionModal.getEventMetadata()), this, 0, 4, null);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            questionModalDialogFragment.show(parentFragmentManager, QUESTION_MODAL_TAG);
        } else {
            QuestionListEvent questionListEvent = questionListEventConsume;
            if (questionListEvent instanceof QuestionListEvent.FetchMetadataFailed) {
                RhDialogFragment.Companion companion3 = RhDialogFragment.INSTANCE;
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                RhDialogFragment.Builder theme = companion3.create(contextRequireContext2).setId(C28477R.id.dialog_id_fetch_metadata_failed).setTitle(C28477R.string.question_error_dialog_title, new Object[0]).setMessage(C28477R.string.question_error_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_close, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                RhDialogFragment.Builder.show$default(theme, childFragmentManager2, METADATA_FAILED_TAG, false, 4, null);
            } else if (!(questionListEvent instanceof QuestionListEvent.QuestionDeletionFailed) && questionListEvent != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        QaEventMetadata eventMetadata4 = viewState.getEventMetadata();
        if (eventMetadata4 != null) {
            getShareholderLogger().setMetadata(eventMetadata4);
        }
        getShareholderLogger().logScreenAppearance();
    }

    private final void bindFooter(QaEventMetadata metadata) {
        Icon icon;
        FragmentQuestionListBinding binding = getBinding();
        final QaEventMetadata.Cta cta = metadata.getCta();
        binding.questionListFooterLabel.setText(cta.getActionText());
        binding.questionListFooterText.setText(cta.getDateText());
        final RdsButton rdsButton = binding.questionListFooterCta;
        boolean liveCall = metadata.getHeader().getLiveCall();
        Intrinsics.checkNotNull(rdsButton);
        Drawable drawable = null;
        ScarletManager2.overrideStyle$default(rdsButton, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, UtilKt.getButtonStyleAttr(cta.getButton().getType(), liveCall)), false, 2, null);
        rdsButton.setText(cta.getButton().getLabel());
        ButtonIcon icon2 = cta.getButton().getIcon();
        if (icon2 != null && (icon = icon2.getIcon()) != null) {
            int resourceId = IconExtensions.getResourceId(icon);
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            drawable = ViewsKt.getDrawable(root, resourceId);
        }
        rdsButton.setIcon(drawable);
        rdsButton.setActivated(cta.getButton().is_enabled());
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionListFragment.bindFooter$lambda$12$lambda$11$lambda$10(rdsButton, this, cta);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindFooter$lambda$12$lambda$11$lambda$10(RdsButton rdsButton, QuestionListFragment questionListFragment, QaEventMetadata.Cta cta) {
        if (rdsButton.isActivated()) {
            questionListFragment.onCtaClicked((GenericAction) cta.getButton().getAction(), cta.getButton().getLabel());
        } else {
            String popoverText = cta.getPopoverText();
            if (popoverText != null && popoverText.length() != 0) {
                questionListFragment.showSnackbar(cta.getPopoverText());
            }
        }
        return Unit.INSTANCE;
    }

    private final void onCtaClicked(GenericAction action, String label) {
        if (!(action instanceof GenericAction.Deeplink)) {
            if (!(action instanceof GenericAction.Dismiss) && !(action instanceof GenericAction.InfoAlert)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            handleDeeplinkAppendingEventInfo(((GenericAction.Deeplink) action).getValue2().getUri());
            ShareholderLogger.logTap$default(getShareholderLogger(), Component.ComponentType.BUTTON, UserInteractionEventData.Action.CONTINUE, label, null, 8, null);
        }
    }

    private final void handleDeeplinkAppendingEventInfo(String uri) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(uri).buildUpon().appendQueryParameter(QUERY_INSTRUMENT_ID, String.valueOf(getConfig().getInstrumentId())).appendQueryParameter(QUERY_EVENT_SLUG, ((LegacyFragmentKey.ShareholderEventQuestionList) INSTANCE.getArgs((Fragment) this)).getEventSlug()).build(), null, null, false, null, 60, null);
    }

    /* compiled from: QuestionListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventQuestionList;", "<init>", "()V", "DROPDOWN_TAG", "", "MULTI_ACTION_TAG", "DELETE_QUESTION_TAG", "ANSWERED_QUESTIONS_TAG", "QUESTION_MODAL_TAG", "METADATA_FAILED_TAG", "QUERY_INSTRUMENT_ID", "QUERY_EVENT_SLUG", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<QuestionListFragment, LegacyFragmentKey.ShareholderEventQuestionList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.ShareholderEventQuestionList shareholderEventQuestionList) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, shareholderEventQuestionList);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.ShareholderEventQuestionList getArgs(QuestionListFragment questionListFragment) {
            return (LegacyFragmentKey.ShareholderEventQuestionList) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, questionListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public QuestionListFragment newInstance(LegacyFragmentKey.ShareholderEventQuestionList shareholderEventQuestionList) {
            return (QuestionListFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, shareholderEventQuestionList);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(QuestionListFragment questionListFragment, LegacyFragmentKey.ShareholderEventQuestionList shareholderEventQuestionList) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, questionListFragment, shareholderEventQuestionList);
        }
    }
}
