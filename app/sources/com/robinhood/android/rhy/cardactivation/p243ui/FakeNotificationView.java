package com.robinhood.android.rhy.cardactivation.p243ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.rhy.cardactivation.C27358R;
import com.robinhood.utils.extensions.KProperties2;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: FakeNotificationView.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\r\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/FakeNotificationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "titleTxt", "Landroid/widget/TextView;", "messageTxt", "<set-?>", "", "title", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title$delegate", "Lkotlin/reflect/KMutableProperty0;", "message", "getMessage", "setMessage", "message$delegate", "Companion", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class FakeNotificationView extends ConstraintLayout {

    /* renamed from: message$delegate, reason: from kotlin metadata */
    private final KProperty3 message;
    private final TextView messageTxt;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final KProperty3 title;
    private final TextView titleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FakeNotificationView.class, "title", "getTitle()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FakeNotificationView.class, "message", "getMessage()Ljava/lang/CharSequence;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FakeNotificationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setTransitionGroup(true);
        setBackground(ViewsKt.getDrawable(this, C27358R.drawable.fake_notification_background));
        ViewGroups.inflate(this, C27358R.layout.merge_fake_notification, true);
        View viewFindViewById = findViewById(C27358R.id.fake_notification_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById;
        this.titleTxt = textView;
        View viewFindViewById2 = findViewById(C27358R.id.fake_notification_message_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final TextView textView2 = (TextView) viewFindViewById2;
        this.messageTxt = textView2;
        this.title = new MutablePropertyReference0Impl(textView) { // from class: com.robinhood.android.rhy.cardactivation.ui.FakeNotificationView$title$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return TextViewsKt.getVisibilityText((TextView) this.receiver);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                TextViewsKt.setVisibilityText((TextView) this.receiver, (CharSequence) obj);
            }
        };
        this.message = new MutablePropertyReference0Impl(textView2) { // from class: com.robinhood.android.rhy.cardactivation.ui.FakeNotificationView$message$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return TextViewsKt.getVisibilityText((TextView) this.receiver);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                TextViewsKt.setVisibilityText((TextView) this.receiver, (CharSequence) obj);
            }
        };
        int[] FakeNotificationView = C27358R.styleable.FakeNotificationView;
        Intrinsics.checkNotNullExpressionValue(FakeNotificationView, "FakeNotificationView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FakeNotificationView, 0, 0);
        setTitle(typedArrayObtainStyledAttributes.getText(C27358R.styleable.FakeNotificationView_titleText));
        setMessage(typedArrayObtainStyledAttributes.getText(C27358R.styleable.FakeNotificationView_messageText));
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ FakeNotificationView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final CharSequence getTitle() {
        return (CharSequence) KProperties2.getValue(this.title, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    public final void setTitle(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.title, this, (KProperty<?>) $$delegatedProperties[0], charSequence);
    }

    public final CharSequence getMessage() {
        return (CharSequence) KProperties2.getValue(this.message, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    public final void setMessage(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.message, this, (KProperty<?>) $$delegatedProperties[1], charSequence);
    }

    /* compiled from: FakeNotificationView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/FakeNotificationView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/rhy/cardactivation/ui/FakeNotificationView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<FakeNotificationView> {
        private final /* synthetic */ Inflater<FakeNotificationView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public FakeNotificationView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (FakeNotificationView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27358R.layout.include_fake_notification_view);
        }
    }
}
