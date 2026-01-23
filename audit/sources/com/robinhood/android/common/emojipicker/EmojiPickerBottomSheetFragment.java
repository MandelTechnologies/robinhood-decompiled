package com.robinhood.android.common.emojipicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResultCaller;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.emojipicker.CuratedListEmojiAdapter;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Activity;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EmojiPickerBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u00100\u001a\u00020\"H\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\u0015H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/EmojiPickerBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter$Callbacks;", "<init>", "()V", "callbacks", "getCallbacks", "()Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter$Callbacks;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "duxo", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerDuxo;", "getDuxo", "()Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "initialEmoji", "", "getInitialEmoji", "()Ljava/lang/String;", "initialEmoji$delegate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "emojiAdapter", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "onResume", "onEmojiItemClick", "clickedEmoji", "Lcom/robinhood/android/common/emojipicker/Emoji;", "onShowMoreClick", "key", "Companion", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class EmojiPickerBottomSheetFragment extends BaseBottomSheetDialogFragment implements CuratedListEmojiAdapter.Callbacks {
    private static final String ARG_INITIAL_EMOJI = "initial_emoji";
    private static final float BOTTOM_SHEET_HEIGHT_MULTIPLIER = 0.8f;
    private static final int SPAN_COUNT_EMOJI_EXPAND_FOOTER = 6;
    private static final int SPAN_COUNT_EMOJI_HEADER = 6;
    private static final int SPAN_COUNT_EMOJI_ITEM = 1;
    public static final String UPDATED_EMOJI_EXTRA = "emoji_result";
    public AnalyticsLogger analytics;
    private CuratedListEmojiAdapter emojiAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmojiPickerBottomSheetFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CuratedListEmojiPickerDuxo.class);

    /* renamed from: initialEmoji$delegate, reason: from kotlin metadata */
    private final Lazy initialEmoji = Fragments2.argument(this, ARG_INITIAL_EMOJI);

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView = bindView(C11149R.id.emoji_picker_recycler_view);

    private final CuratedListEmojiAdapter.Callbacks getCallbacks() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof CuratedListEmojiAdapter.Callbacks) {
            return (CuratedListEmojiAdapter.Callbacks) parentFragment;
        }
        return null;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CuratedListEmojiPickerDuxo getDuxo() {
        return (CuratedListEmojiPickerDuxo) this.duxo.getValue();
    }

    private final String getInitialEmoji() {
        return (String) this.initialEmoji.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.emojiAdapter = new CuratedListEmojiAdapter(this, getInitialEmoji());
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C11149R.layout.emoji_picker_bottom_sheet_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(requireActivity(), "requireActivity(...)");
        getRecyclerView().getLayoutParams().height = (int) (Activity.getDisplayMetrics(r3).heightPixels * 0.8f);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 6);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.robinhood.android.common.emojipicker.EmojiPickerBottomSheetFragment.onViewCreated.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int position) {
                CuratedListEmojiAdapter curatedListEmojiAdapter = EmojiPickerBottomSheetFragment.this.emojiAdapter;
                if (curatedListEmojiAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("emojiAdapter");
                    curatedListEmojiAdapter = null;
                }
                int itemViewType = curatedListEmojiAdapter.getItemViewType(position);
                if (itemViewType == 0) {
                    return 6;
                }
                if (itemViewType == 1) {
                    return 1;
                }
                if (itemViewType == 2) {
                    return 6;
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(itemViewType));
                throw new ExceptionsH();
            }
        });
        getRecyclerView().setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView = getRecyclerView();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        recyclerView.addItemDecoration(new CuratedListEmojiAdapter2(contextRequireContext));
        RecyclerView recyclerView2 = getRecyclerView();
        CuratedListEmojiAdapter curatedListEmojiAdapter = this.emojiAdapter;
        if (curatedListEmojiAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emojiAdapter");
            curatedListEmojiAdapter = null;
        }
        bindAdapter(recyclerView2, curatedListEmojiAdapter);
    }

    /* compiled from: EmojiPickerBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.emojipicker.EmojiPickerBottomSheetFragment$onResume$1", m3645f = "EmojiPickerBottomSheetFragment.kt", m3646l = {94}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.emojipicker.EmojiPickerBottomSheetFragment$onResume$1 */
    static final class C111471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C111471(Continuation<? super C111471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmojiPickerBottomSheetFragment.this.new C111471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C111471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CuratedListEmojiPickerViewState> stateFlow = EmojiPickerBottomSheetFragment.this.getDuxo().getStateFlow();
                final EmojiPickerBottomSheetFragment emojiPickerBottomSheetFragment = EmojiPickerBottomSheetFragment.this;
                FlowCollector<? super CuratedListEmojiPickerViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.common.emojipicker.EmojiPickerBottomSheetFragment.onResume.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CuratedListEmojiPickerViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CuratedListEmojiPickerViewState curatedListEmojiPickerViewState, Continuation<? super Unit> continuation) {
                        CuratedListEmojiAdapter curatedListEmojiAdapter = emojiPickerBottomSheetFragment.emojiAdapter;
                        if (curatedListEmojiAdapter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("emojiAdapter");
                            curatedListEmojiAdapter = null;
                        }
                        curatedListEmojiAdapter.submitList(curatedListEmojiPickerViewState.getEmojiList());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C111471(null));
    }

    @Override // com.robinhood.android.common.emojipicker.CuratedListEmojiAdapter.Callbacks
    public void onEmojiItemClick(Emoji clickedEmoji) {
        Intrinsics.checkNotNullParameter(clickedEmoji, "clickedEmoji");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_NEW_LIST, AnalyticsStrings.BUTTON_LIST_SELECT_EMOJI, clickedEmoji.getId(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        if (getCallbacks() != null) {
            CuratedListEmojiAdapter.Callbacks callbacks = getCallbacks();
            if (callbacks != null) {
                callbacks.onEmojiItemClick(clickedEmoji);
            }
            dismiss();
        }
        Intent intent = new Intent();
        intent.putExtra(UPDATED_EMOJI_EXTRA, clickedEmoji.getCharacter());
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(getTargetRequestCode(), -1, intent);
        }
        dismiss();
    }

    @Override // com.robinhood.android.common.emojipicker.CuratedListEmojiAdapter.Callbacks
    public void onShowMoreClick(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        getDuxo().expandEmojiGroup(key);
    }

    /* compiled from: EmojiPickerBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/EmojiPickerBottomSheetFragment$Companion;", "", "<init>", "()V", "UPDATED_EMOJI_EXTRA", "", "ARG_INITIAL_EMOJI", "SPAN_COUNT_EMOJI_HEADER", "", "SPAN_COUNT_EMOJI_ITEM", "SPAN_COUNT_EMOJI_EXPAND_FOOTER", "BOTTOM_SHEET_HEIGHT_MULTIPLIER", "", "newInstance", "Lcom/robinhood/android/common/emojipicker/EmojiPickerBottomSheetFragment;", "initialEmoji", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EmojiPickerBottomSheetFragment newInstance(String initialEmoji) {
            Intrinsics.checkNotNullParameter(initialEmoji, "initialEmoji");
            EmojiPickerBottomSheetFragment emojiPickerBottomSheetFragment = new EmojiPickerBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putString(EmojiPickerBottomSheetFragment.ARG_INITIAL_EMOJI, initialEmoji);
            emojiPickerBottomSheetFragment.setArguments(bundle);
            return emojiPickerBottomSheetFragment;
        }
    }
}
