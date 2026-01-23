package com.withpersona.sdk2.inquiry.steps.p423ui.inputSelect;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner2;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.R$drawable;
import com.withpersona.sdk2.inquiry.shared.p422ui.BottomSheetUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2InputSelectBottomSheetBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.Supervisor3;

/* compiled from: InputSelectBottomSheetController.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0004\u0012\u00020\u00170\u0012J\u0016\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170 H\u0002J\u0006\u0010!\u001a\u00020\u0010J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0002J\b\u0010%\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\r\u0010\u000e*\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/inputSelect/InputSelectBottomSheetController;", "", "contentView", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "lazyBinding", "Lkotlin/Lazy;", "Lcom/withpersona/sdk2/inquiry/steps/ui/databinding/Pi2InputSelectBottomSheetBinding;", "Lkotlin/jvm/internal/EnhancedNullability;", "binding", "getBinding$delegate", "(Lcom/withpersona/sdk2/inquiry/steps/ui/inputSelect/InputSelectBottomSheetController;)Ljava/lang/Object;", "getBinding", "()Lcom/withpersona/sdk2/inquiry/steps/ui/databinding/Pi2InputSelectBottomSheetBinding;", "setup", "", "bottomSheetStateChangeListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "newState", "", "show", "component", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "onItemsSelectedListener", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "runAfterKeyboardShown", "callback", "Lkotlin/Function0;", "close", "setSearchBarVisible", "visible", "hasTitle", "setupIfNeeded", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class InputSelectBottomSheetController {
    private Function1<? super Integer, Unit> bottomSheetStateChangeListener;
    private final ViewGroup contentView;
    private final Lazy<Pi2InputSelectBottomSheetBinding> lazyBinding;
    private boolean setup;

    public InputSelectBottomSheetController(ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputSelectBottomSheetController.lazyBinding$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pi2InputSelectBottomSheetBinding lazyBinding$lambda$0(InputSelectBottomSheetController inputSelectBottomSheetController) {
        return Pi2InputSelectBottomSheetBinding.inflate(LayoutInflater.from(inputSelectBottomSheetController.contentView.getContext()), inputSelectBottomSheetController.contentView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pi2InputSelectBottomSheetBinding getBinding() {
        return this.lazyBinding.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void show(final InputSelectBoxComponent component, Function1<? super List<Option>, Unit> onItemsSelectedListener) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(onItemsSelectedListener, "onItemsSelectedListener");
        setupIfNeeded();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = onItemsSelectedListener;
        String label = component.getLabel();
        final boolean z = label == null || StringsKt.isBlank(label);
        final boolean z2 = !z;
        final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(getBinding().bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        Context context = getBinding().recyclerviewInquirySelectList.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final InputSelectListAdapter inputSelectListAdapter = new InputSelectListAdapter(context, component.getOptions(), component.getStyles(), component.getCanSelectMultipleValues(), component.getSelectedOptions(), new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputSelectBottomSheetController.show$lambda$1(component, objectRef, this, (Option) obj);
            }
        });
        this.bottomSheetStateChangeListener = new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputSelectBottomSheetController.show$lambda$2(objectRef, inputSelectListAdapter, this, ((Integer) obj).intValue());
            }
        };
        setSearchBarVisible(z, z2);
        getBinding().topAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$$ExternalSyntheticLambda3
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return InputSelectBottomSheetController.show$lambda$3(this.f$0, z2, menuItem);
            }
        });
        getBinding().textviewInputSelectSheetTitle.setText(component.getLabel());
        getBinding().recyclerviewInquirySelectList.setAdapter(inputSelectListAdapter);
        getBinding().shadow.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bottomSheetBehaviorFrom.setState(5);
            }
        });
        InputSelectBoxComponentStyle styles = component.getStyles();
        if (styles != null) {
            TextView textviewInputSelectSheetTitle = getBinding().textviewInputSelectSheetTitle;
            Intrinsics.checkNotNullExpressionValue(textviewInputSelectSheetTitle, "textviewInputSelectSheetTitle");
            TextStyling2.style$default(textviewInputSelectSheetTitle, styles.getTextBasedStyle(), null, 2, null);
            Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                int iIntValue = baseBackgroundColorValue.intValue();
                getBinding().listContent.setBackgroundColor(iIntValue);
                getBinding().recyclerviewInquirySelectList.setBackgroundColor(iIntValue);
            }
            Integer baseBorderColorValue = styles.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                getBinding().listContentSeparator.setBackgroundColor(baseBorderColorValue.intValue());
            }
            Integer headerCancelButtonColor = styles.getHeaderCancelButtonColor();
            if (headerCancelButtonColor != null) {
                int iIntValue2 = headerCancelButtonColor.intValue();
                getBinding().topAppBar.setNavigationIconTint(iIntValue2);
                getBinding().searchBarTextInput.setEndIconTintList(ColorStateList.valueOf(iIntValue2));
            }
            Integer baseTextColor = styles.getBaseTextColor();
            if (baseTextColor != null) {
                int iIntValue3 = baseTextColor.intValue();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(ColorUtils.setAlphaComponent(iIntValue3, 128));
                Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
                getBinding().searchBarEditText.setHintTextColor(colorStateListValueOf);
                getBinding().searchBarEditText.setTextColor(iIntValue3);
            }
        }
        getBinding().recyclerviewInquirySelectList.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext()));
        getBinding().recyclerviewInquirySelectList.setHasFixedSize(true);
        getBinding().searchBarEditText.addTextChangedListener(new TextWatcher() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController.show.5
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                inputSelectListAdapter.setQuery(String.valueOf(s));
            }
        });
        getBinding().topAppBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputSelectBottomSheetController.show$lambda$10(z2, this, view);
            }
        });
        getBinding().searchBarEditText.setText("");
        getBinding().bottomSheet.setTranslationY(0.0f);
        this.contentView.postDelayed(new Runnable() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                InputSelectBottomSheetController.show$lambda$12(z, this, bottomSheetBehaviorFrom);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$1(InputSelectBoxComponent inputSelectBoxComponent, Ref.ObjectRef objectRef, InputSelectBottomSheetController inputSelectBottomSheetController, Option selectedItem) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        if (!inputSelectBoxComponent.getCanSelectMultipleValues()) {
            Function1 function1 = (Function1) objectRef.element;
            if (function1 != null) {
                function1.invoke(CollectionsKt.listOf(selectedItem));
            }
            objectRef.element = null;
            inputSelectBottomSheetController.close();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$2(Ref.ObjectRef objectRef, InputSelectListAdapter inputSelectListAdapter, InputSelectBottomSheetController inputSelectBottomSheetController, int i) {
        if (i == 5) {
            Function1 function1 = (Function1) objectRef.element;
            if (function1 != null) {
                function1.invoke(CollectionsKt.toList(inputSelectListAdapter.getSelectedOptions()));
            }
            objectRef.element = null;
            Context context = inputSelectBottomSheetController.contentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ContextUtils3.hideKeyboard(context);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean show$lambda$3(InputSelectBottomSheetController inputSelectBottomSheetController, boolean z, MenuItem menuItem) {
        if (menuItem.getItemId() != R$id.expand_search_bar) {
            return false;
        }
        inputSelectBottomSheetController.setSearchBarVisible(true, z);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$10(boolean z, InputSelectBottomSheetController inputSelectBottomSheetController, View view) {
        if (z) {
            TextInputLayout searchBarTextInput = inputSelectBottomSheetController.getBinding().searchBarTextInput;
            Intrinsics.checkNotNullExpressionValue(searchBarTextInput, "searchBarTextInput");
            if (searchBarTextInput.getVisibility() == 0) {
                inputSelectBottomSheetController.setSearchBarVisible(false, z);
                return;
            }
        }
        inputSelectBottomSheetController.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$12(boolean z, InputSelectBottomSheetController inputSelectBottomSheetController, final BottomSheetBehavior bottomSheetBehavior) {
        if (z) {
            inputSelectBottomSheetController.runAfterKeyboardShown(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InputSelectBottomSheetController.show$lambda$12$lambda$11(bottomSheetBehavior);
                }
            });
        } else {
            bottomSheetBehavior.setState(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$12$lambda$11(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.setState(3);
        return Unit.INSTANCE;
    }

    private final void runAfterKeyboardShown(Function0<Unit> callback) {
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNull(context);
        AppCompatActivity activity = ContextUtils3.getActivity(context);
        if (activity == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(activity), null, null, new C437701(callback, null), 3, null);
    }

    /* compiled from: InputSelectBottomSheetController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1", m3645f = "InputSelectBottomSheetController.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1 */
    static final class C437701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callback;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C437701(Function0<Unit> function0, Continuation<? super C437701> continuation) {
            super(2, continuation);
            this.$callback = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437701 c437701 = InputSelectBottomSheetController.this.new C437701(this.$callback, continuation);
            c437701.L$0 = obj;
            return c437701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, completableJobSupervisorJob$default, null, new AnonymousClass1(completableJobSupervisorJob$default, InputSelectBottomSheetController.this, this.$callback, null), 2, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, completableJobSupervisorJob$default, null, new AnonymousClass2(InputSelectBottomSheetController.this, completableJobSupervisorJob$default, this.$callback, null), 2, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, completableJobSupervisorJob$default, null, new AnonymousClass3(completableJobSupervisorJob$default, this.$callback, null), 2, null);
            return Unit.INSTANCE;
        }

        /* compiled from: InputSelectBottomSheetController.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1", m3645f = "InputSelectBottomSheetController.kt", m3646l = {EnumC7081g.f2781x2ba65ba3, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callback;
            final /* synthetic */ CompletableJob $job;
            Object L$0;
            int label;
            final /* synthetic */ InputSelectBottomSheetController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CompletableJob completableJob, InputSelectBottomSheetController inputSelectBottomSheetController, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$job = completableJob;
                this.this$0 = inputSelectBottomSheetController;
                this.$callback = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$job, this.this$0, this.$callback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
            
                if (kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    InputSelectBottomSheetController inputSelectBottomSheetController = this.this$0;
                    this.L$0 = inputSelectBottomSheetController;
                    this.label = 1;
                    final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    FrameLayout root = inputSelectBottomSheetController.getBinding().getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                    InsetsUtils.onInsetsChanged(root, new Function1<WindowInsetsCompat, Unit>() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(WindowInsetsCompat windowInsetsCompat) {
                            invoke2(windowInsetsCompat);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(WindowInsetsCompat insets) {
                            Intrinsics.checkNotNullParameter(insets, "insets");
                            if (booleanRef.element) {
                                return;
                            }
                            Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
                            Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                            if (insets2.bottom > 0) {
                                booleanRef.element = true;
                                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                            }
                        }
                    });
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbes.probeCoroutineSuspended(this);
                    }
                    if (result != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Job.DefaultImpls.cancel$default(this.$job, null, 1, null);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$callback, null);
                this.L$0 = null;
                this.label = 2;
            }

            /* compiled from: InputSelectBottomSheetController.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$2", m3645f = "InputSelectBottomSheetController.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $callback;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$callback = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$callback, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$callback.invoke();
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: InputSelectBottomSheetController.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2", m3645f = "InputSelectBottomSheetController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callback;
            final /* synthetic */ CompletableJob $job;
            int label;
            final /* synthetic */ InputSelectBottomSheetController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InputSelectBottomSheetController inputSelectBottomSheetController, CompletableJob completableJob, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = inputSelectBottomSheetController;
                this.$job = completableJob;
                this.$callback = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$job, this.$callback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
            
                if (kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7) == r0) goto L21;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0 || i == 1) {
                    ResultKt.throwOnFailure(obj);
                    while (true) {
                        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.this$0.getBinding().getRoot());
                        if (rootWindowInsets == null || !rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime())) {
                            this.label = 1;
                            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                                break;
                            }
                        } else {
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, null);
                            this.label = 2;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Job.DefaultImpls.cancel$default(this.$job, null, 1, null);
                return Unit.INSTANCE;
            }

            /* compiled from: InputSelectBottomSheetController.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2$1", m3645f = "InputSelectBottomSheetController.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $callback;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$callback = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$callback, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$callback.invoke();
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: InputSelectBottomSheetController.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3", m3645f = "InputSelectBottomSheetController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 239}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callback;
            final /* synthetic */ CompletableJob $job;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CompletableJob completableJob, Function0<Unit> function0, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$job = completableJob;
                this.$callback = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$job, this.$callback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.delay(1000L, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Job.DefaultImpls.cancel$default(this.$job, null, 1, null);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, null);
                this.label = 2;
            }

            /* compiled from: InputSelectBottomSheetController.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3$1", m3645f = "InputSelectBottomSheetController.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $callback;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$callback = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$callback, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$callback.invoke();
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public final boolean close() {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(getBinding().bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ContextUtils3.hideKeyboard(context);
        this.contentView.postDelayed(new Runnable() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                bottomSheetBehaviorFrom.setState(5);
            }
        }, 100L);
        return bottomSheetBehaviorFrom.getState() != 5;
    }

    private final void setSearchBarVisible(boolean visible, boolean hasTitle) {
        if (visible) {
            getBinding().textviewInputSelectSheetTitle.setVisibility(8);
            getBinding().searchBarTextInput.setVisibility(0);
            getBinding().topAppBar.getMenu().setGroupVisible(0, false);
            getBinding().searchBarEditText.requestFocus();
            Context context = getBinding().searchBarEditText.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ContextUtils3.showKeyboard(context);
        } else {
            Context context2 = getBinding().searchBarEditText.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ContextUtils3.hideKeyboard(context2);
            getBinding().searchBarTextInput.setVisibility(8);
            getBinding().textviewInputSelectSheetTitle.setVisibility(0);
            getBinding().topAppBar.getMenu().setGroupVisible(0, true);
            getBinding().searchBarEditText.setText("");
        }
        if (visible && hasTitle) {
            getBinding().topAppBar.setNavigationIcon(R$drawable.pi2_shared_arrow_back_24);
        } else {
            getBinding().topAppBar.setNavigationIcon(R$drawable.pi2_shared_close_icon);
        }
    }

    private final void setupIfNeeded() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(getBinding().bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        bottomSheetBehaviorFrom.setUpdateImportantForAccessibilityOnSiblings(true);
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        FrameLayout bottomSheet = getBinding().bottomSheet;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        BottomSheetUtils.setup(bottomSheetBehaviorFrom, function0, bottomSheet, getBinding().listContent, getBinding().shadow);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController.setupIfNeeded.2
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet2, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View bottomSheet2, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                Function1 function1 = InputSelectBottomSheetController.this.bottomSheetStateChangeListener;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(newState));
                }
            }
        });
    }
}
