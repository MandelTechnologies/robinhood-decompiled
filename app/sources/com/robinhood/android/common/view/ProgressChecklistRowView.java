package com.robinhood.android.common.view;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.KProperties2;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: ProgressChecklistRowView.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001LB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010F\u001a\u00020G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0IJ\u0014\u0010J\u001a\u00020G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0IJ\b\u0010K\u001a\u00020GH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u0019R$\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 @FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R/\u0010.\u001a\u0004\u0018\u00010-2\b\u0010,\u001a\u0004\u0018\u00010-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102R/\u00105\u001a\u0004\u0018\u00010-2\b\u0010,\u001a\u0004\u0018\u00010-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00104\u001a\u0004\b6\u00100\"\u0004\b7\u00102R/\u00109\u001a\u0004\u0018\u00010-2\b\u0010,\u001a\u0004\u0018\u00010-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00104\u001a\u0004\b:\u00100\"\u0004\b;\u00102R(\u0010>\u001a\u0004\u0018\u00010=2\b\u0010\u001f\u001a\u0004\u0018\u00010=@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010C\u001a\u0004\u0018\u00010=2\b\u0010\u001f\u001a\u0004\u0018\u00010=@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010@\"\u0004\bE\u0010B¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/common/view/ProgressChecklistRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "titleTxt", "Landroid/widget/TextView;", "image", "Landroid/widget/ImageView;", "progressBar", "Landroid/widget/ProgressBar;", "messageTxt", "positiveBtn", "Landroid/widget/Button;", "btnNegative", "checkIcon", "Landroid/graphics/drawable/Drawable;", "errorIcon", "alertIcon", "regularTypeface", "Landroid/graphics/Typeface;", "getRegularTypeface", "()Landroid/graphics/Typeface;", "regularTypeface$delegate", "Lkotlin/Lazy;", "boldTypeface", "getBoldTypeface", "boldTypeface$delegate", "value", "Lcom/robinhood/android/common/view/ProgressChecklistRowView$State;", "state", "getState", "()Lcom/robinhood/android/common/view/ProgressChecklistRowView$State;", "setState", "(Lcom/robinhood/android/common/view/ProgressChecklistRowView$State;)V", "", "stageTitle", "getStageTitle", "()Ljava/lang/String;", "setStageTitle", "(Ljava/lang/String;)V", "<set-?>", "", "message", "getMessage", "()Ljava/lang/CharSequence;", "setMessage", "(Ljava/lang/CharSequence;)V", "message$delegate", "Lkotlin/reflect/KMutableProperty0;", "positiveButtonText", "getPositiveButtonText", "setPositiveButtonText", "positiveButtonText$delegate", "negativeButtonText", "getNegativeButtonText", "setNegativeButtonText", "negativeButtonText$delegate", "Landroid/content/res/ColorStateList;", "checkIconTint", "getCheckIconTint", "()Landroid/content/res/ColorStateList;", "setCheckIconTint", "(Landroid/content/res/ColorStateList;)V", "defaultIconTint", "getDefaultIconTint", "setDefaultIconTint", "onPositiveButtonClicked", "", "action", "Lkotlin/Function0;", "onNegativeButtonClicked", "refreshState", "State", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class ProgressChecklistRowView extends ConstraintLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ProgressChecklistRowView.class, "regularTypeface", "getRegularTypeface()Landroid/graphics/Typeface;", 0)), Reflection.property1(new PropertyReference1Impl(ProgressChecklistRowView.class, "boldTypeface", "getBoldTypeface()Landroid/graphics/Typeface;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ProgressChecklistRowView.class, "message", "getMessage()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ProgressChecklistRowView.class, "positiveButtonText", "getPositiveButtonText()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ProgressChecklistRowView.class, "negativeButtonText", "getNegativeButtonText()Ljava/lang/CharSequence;", 0))};
    public static final int $stable = 8;
    private final Drawable alertIcon;

    /* renamed from: boldTypeface$delegate, reason: from kotlin metadata */
    private final Lazy boldTypeface;
    private final Button btnNegative;
    private final Drawable checkIcon;
    private ColorStateList checkIconTint;
    private ColorStateList defaultIconTint;
    private final Drawable errorIcon;
    private final ImageView image;

    /* renamed from: message$delegate, reason: from kotlin metadata */
    private final KProperty3 message;
    private final TextView messageTxt;

    /* renamed from: negativeButtonText$delegate, reason: from kotlin metadata */
    private final KProperty3 negativeButtonText;
    private final Button positiveBtn;

    /* renamed from: positiveButtonText$delegate, reason: from kotlin metadata */
    private final KProperty3 positiveButtonText;
    private final ProgressBar progressBar;

    /* renamed from: regularTypeface$delegate, reason: from kotlin metadata */
    private final Lazy regularTypeface;
    private State state;
    private final TextView titleTxt;

    /* compiled from: ProgressChecklistRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.QUESTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ProgressChecklistRowView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ProgressChecklistRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressChecklistRowView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] ProgressChecklistRowView = C11048R.styleable.ProgressChecklistRowView;
        Intrinsics.checkNotNullExpressionValue(ProgressChecklistRowView, "ProgressChecklistRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ProgressChecklistRowView, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C11048R.styleable.ProgressChecklistRowView_mergeLayoutId, C11048R.layout.merge_progress_checklist_row);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, resourceId, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_default);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        View viewFindViewById = findViewById(C11048R.id.progress_checklist_row_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C11048R.id.progress_checklist_row_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.image = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C11048R.id.progress_checklist_row_progress_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.progressBar = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = findViewById(C11048R.id.progress_checklist_row_message_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById4;
        this.messageTxt = textView;
        View viewFindViewById5 = findViewById(C11048R.id.progress_checklist_row_button_positive);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        final Button button = (Button) viewFindViewById5;
        this.positiveBtn = button;
        View viewFindViewById6 = findViewById(C11048R.id.progress_checklist_row_button_negative);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        final Button button2 = (Button) viewFindViewById6;
        this.btnNegative = button2;
        this.checkIcon = ViewsKt.getDrawable(this, C20690R.drawable.ic_rds_bubble_checked_24dp);
        this.errorIcon = ViewsKt.getDrawable(this, C11048R.drawable.ic_checklist_error);
        this.alertIcon = ViewsKt.getDrawable(this, C20690R.drawable.ic_rds_alert_24dp);
        RhTypeface rhTypeface = RhTypeface.REGULAR;
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.regularTypeface = rhTypeface.provideDelegate(this, kPropertyArr[0]);
        this.boldTypeface = RhTypeface.BOLD.provideDelegate(this, kPropertyArr[1]);
        this.state = State.IN_PROGRESS;
        this.message = new MutablePropertyReference0Impl(textView) { // from class: com.robinhood.android.common.view.ProgressChecklistRowView$message$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return TextViewsKt.getVisibilityText((TextView) this.receiver);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                TextViewsKt.setVisibilityText((TextView) this.receiver, (CharSequence) obj);
            }
        };
        this.positiveButtonText = new MutablePropertyReference0Impl(button) { // from class: com.robinhood.android.common.view.ProgressChecklistRowView$positiveButtonText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return TextViewsKt.getVisibilityText((TextView) this.receiver);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                TextViewsKt.setVisibilityText((TextView) this.receiver, (CharSequence) obj);
            }
        };
        this.negativeButtonText = new MutablePropertyReference0Impl(button2) { // from class: com.robinhood.android.common.view.ProgressChecklistRowView$negativeButtonText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return TextViewsKt.getVisibilityText((TextView) this.receiver);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                TextViewsKt.setVisibilityText((TextView) this.receiver, (CharSequence) obj);
            }
        };
        int[] ProgressChecklistRowView2 = C11048R.styleable.ProgressChecklistRowView;
        Intrinsics.checkNotNullExpressionValue(ProgressChecklistRowView2, "ProgressChecklistRowView");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ProgressChecklistRowView2, 0, 0);
        setCheckIconTint(typedArrayObtainStyledAttributes2.getColorStateList(C11048R.styleable.ProgressChecklistRowView_checkIconTint));
        setDefaultIconTint(typedArrayObtainStyledAttributes2.getColorStateList(C11048R.styleable.ProgressChecklistRowView_defaultIconTint));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final Typeface getRegularTypeface() {
        return (Typeface) this.regularTypeface.getValue();
    }

    private final Typeface getBoldTypeface() {
        return (Typeface) this.boldTypeface.getValue();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProgressChecklistRowView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/view/ProgressChecklistRowView$State;", "", "<init>", "(Ljava/lang/String;I)V", "IN_PROGRESS", "COMPLETED", "QUESTION", "ERROR", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IN_PROGRESS = new State("IN_PROGRESS", 0);
        public static final State COMPLETED = new State("COMPLETED", 1);
        public static final State QUESTION = new State("QUESTION", 2);
        public static final State ERROR = new State("ERROR", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{IN_PROGRESS, COMPLETED, QUESTION, ERROR};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public final State getState() {
        return this.state;
    }

    public final void setState(State value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.state != value) {
            this.state = value;
            refreshState();
        }
    }

    public final String getStageTitle() {
        return this.titleTxt.getText().toString();
    }

    public final void setStageTitle(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.titleTxt.setText(value);
    }

    public final CharSequence getMessage() {
        return (CharSequence) KProperties2.getValue(this.message, this, (KProperty<?>) $$delegatedProperties[2]);
    }

    public final void setMessage(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.message, this, (KProperty<?>) $$delegatedProperties[2], charSequence);
    }

    public final CharSequence getPositiveButtonText() {
        return (CharSequence) KProperties2.getValue(this.positiveButtonText, this, (KProperty<?>) $$delegatedProperties[3]);
    }

    public final void setPositiveButtonText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.positiveButtonText, this, (KProperty<?>) $$delegatedProperties[3], charSequence);
    }

    public final CharSequence getNegativeButtonText() {
        return (CharSequence) KProperties2.getValue(this.negativeButtonText, this, (KProperty<?>) $$delegatedProperties[4]);
    }

    public final void setNegativeButtonText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.negativeButtonText, this, (KProperty<?>) $$delegatedProperties[4], charSequence);
    }

    public final ColorStateList getCheckIconTint() {
        return this.checkIconTint;
    }

    public final void setCheckIconTint(ColorStateList colorStateList) {
        if (Intrinsics.areEqual(this.checkIconTint, colorStateList)) {
            return;
        }
        this.checkIconTint = colorStateList;
        refreshState();
    }

    public final ColorStateList getDefaultIconTint() {
        return this.defaultIconTint;
    }

    public final void setDefaultIconTint(ColorStateList colorStateList) {
        if (Intrinsics.areEqual(this.defaultIconTint, colorStateList)) {
            return;
        }
        this.defaultIconTint = colorStateList;
        refreshState();
    }

    public final void onPositiveButtonClicked(final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.positiveBtn.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.common.view.ProgressChecklistRowView.onPositiveButtonClicked.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                action.invoke();
            }
        });
    }

    public final void onNegativeButtonClicked(final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.btnNegative.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.common.view.ProgressChecklistRowView.onNegativeButtonClicked.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                action.invoke();
            }
        });
    }

    private final void refreshState() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            this.progressBar.setVisibility(0);
            this.image.setVisibility(4);
            TextView textView = this.titleTxt;
            textView.setTypeface(getBoldTypeface());
            ScarletManager2.overrideAttribute(textView, R.attr.textColor, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorForeground1));
            return;
        }
        if (i == 2) {
            this.progressBar.setVisibility(4);
            ImageView imageView = this.image;
            imageView.setImageDrawable(this.checkIcon);
            imageView.setVisibility(0);
            imageView.setImageTintList(this.checkIconTint);
            imageView.setAlpha(0.4f);
            TextView textView2 = this.titleTxt;
            textView2.setTypeface(getRegularTypeface());
            ScarletManager2.overrideAttribute(textView2, R.attr.textColor, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorForeground3));
            return;
        }
        if (i == 3) {
            this.progressBar.setVisibility(4);
            ImageView imageView2 = this.image;
            imageView2.setImageDrawable(this.alertIcon);
            imageView2.setVisibility(0);
            imageView2.setImageTintList(this.defaultIconTint);
            imageView2.setAlpha(1.0f);
            TextView textView3 = this.titleTxt;
            textView3.setTypeface(getBoldTypeface());
            ScarletManager2.overrideAttribute(textView3, R.attr.textColor, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorForeground1));
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this.progressBar.setVisibility(4);
        ImageView imageView3 = this.image;
        imageView3.setImageDrawable(this.errorIcon);
        imageView3.setVisibility(0);
        imageView3.setImageTintList(this.defaultIconTint);
        imageView3.setAlpha(1.0f);
        TextView textView4 = this.titleTxt;
        textView4.setTypeface(getBoldTypeface());
        ScarletManager2.overrideAttribute(textView4, R.attr.textColor, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorForeground1));
    }
}
