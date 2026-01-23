package com.robinhood.scarlet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextSwitcher;
import android.widget.VideoView;
import android.widget.ViewAnimator;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnqualifiedClassTag.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00017B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR6\u0010/\u001a*\u0012\u000e\b\u0001\u0012\n 1*\u0004\u0018\u00010\u00060\u0006 1*\u0014\u0012\u000e\b\u0001\u0012\n 1*\u0004\u0018\u00010\u00060\u0006\u0018\u00010000X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.¨\u00068"}, m3636d2 = {"Lcom/robinhood/scarlet/view/UnqualifiedClassTag;", "", "viewName", "", "implementationClass", "Ljava/lang/Class;", "Landroid/view/View;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", "getViewName", "()Ljava/lang/String;", "getImplementationClass", "()Ljava/lang/Class;", "CALENDAR_VIEW", "DATE_PICKER", "FRAME_LAYOUT", "GRID_LAYOUT", "GRID_VIEW", "HORIZONTAL_SCROLL_VIEW", "LINEAR_LAYOUT", "LIST_VIEW", "NUMBER_PICKER", "PROGRESS_BAR", "RADIO_GROUP", "RELATIVE_LAYOUT", "SCROLL_VIEW", "SPACE", "TEXT_SWITCHER", "VIDEO_VIEW", "VIEW", "VIEW_ANIMATOR", "VIEW_STUB", "WEB_VIEW", "AUTO_COMPLETE_TEXT_VIEW", "BUTTON", "CHECK_BOX", "CHECKED_TEXT_VIEW", "EDIT_TEXT", "IMAGE_BUTTON", "IMAGE_VIEW", "MULTI_AUTO_COMPLETE_TEXT_VIEW", "RADIO_BUTTON", "RATING_BAR", "SEEK_BAR", "SPINNER", "TEXT_VIEW", "TOGGLE_BUTTON", "constructor", "Ljava/lang/reflect/Constructor;", "kotlin.jvm.PlatformType", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class UnqualifiedClassTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UnqualifiedClassTag[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<String, UnqualifiedClassTag> mapping;
    private final Constructor<? extends View> constructor;
    private final Class<? extends View> implementationClass;
    private final String viewName;
    public static final UnqualifiedClassTag CALENDAR_VIEW = new UnqualifiedClassTag("CALENDAR_VIEW", 0, "CalendarView", CalendarView.class);
    public static final UnqualifiedClassTag DATE_PICKER = new UnqualifiedClassTag("DATE_PICKER", 1, "DatePicker", DatePicker.class);
    public static final UnqualifiedClassTag FRAME_LAYOUT = new UnqualifiedClassTag("FRAME_LAYOUT", 2, "FrameLayout", FrameLayout.class);
    public static final UnqualifiedClassTag GRID_LAYOUT = new UnqualifiedClassTag("GRID_LAYOUT", 3, "GridLayout", GridLayout.class);
    public static final UnqualifiedClassTag GRID_VIEW = new UnqualifiedClassTag("GRID_VIEW", 4, "GridView", GridView.class);
    public static final UnqualifiedClassTag HORIZONTAL_SCROLL_VIEW = new UnqualifiedClassTag("HORIZONTAL_SCROLL_VIEW", 5, "HorizontalScrollView", HorizontalScrollView.class);
    public static final UnqualifiedClassTag LINEAR_LAYOUT = new UnqualifiedClassTag("LINEAR_LAYOUT", 6, "LinearLayout", LinearLayout.class);
    public static final UnqualifiedClassTag LIST_VIEW = new UnqualifiedClassTag("LIST_VIEW", 7, "ListView", ListView.class);
    public static final UnqualifiedClassTag NUMBER_PICKER = new UnqualifiedClassTag("NUMBER_PICKER", 8, "NumberPicker", NumberPicker.class);
    public static final UnqualifiedClassTag PROGRESS_BAR = new UnqualifiedClassTag("PROGRESS_BAR", 9, "ProgressBar", ProgressBar.class);
    public static final UnqualifiedClassTag RADIO_GROUP = new UnqualifiedClassTag("RADIO_GROUP", 10, "RadioGroup", RadioGroup.class);
    public static final UnqualifiedClassTag RELATIVE_LAYOUT = new UnqualifiedClassTag("RELATIVE_LAYOUT", 11, "RelativeLayout", RelativeLayout.class);
    public static final UnqualifiedClassTag SCROLL_VIEW = new UnqualifiedClassTag("SCROLL_VIEW", 12, "ScrollView", ScrollView.class);
    public static final UnqualifiedClassTag SPACE = new UnqualifiedClassTag("SPACE", 13, "Space", Space.class);
    public static final UnqualifiedClassTag TEXT_SWITCHER = new UnqualifiedClassTag("TEXT_SWITCHER", 14, "TextSwitcher", TextSwitcher.class);
    public static final UnqualifiedClassTag VIDEO_VIEW = new UnqualifiedClassTag("VIDEO_VIEW", 15, "VideoView", VideoView.class);
    public static final UnqualifiedClassTag VIEW = new UnqualifiedClassTag("VIEW", 16, "View", View.class);
    public static final UnqualifiedClassTag VIEW_ANIMATOR = new UnqualifiedClassTag("VIEW_ANIMATOR", 17, "ViewAnimator", ViewAnimator.class);
    public static final UnqualifiedClassTag VIEW_STUB = new UnqualifiedClassTag("VIEW_STUB", 18, "ViewStub", ViewStub.class);
    public static final UnqualifiedClassTag WEB_VIEW = new UnqualifiedClassTag("WEB_VIEW", 19, "WebView", WebView.class);
    public static final UnqualifiedClassTag AUTO_COMPLETE_TEXT_VIEW = new UnqualifiedClassTag("AUTO_COMPLETE_TEXT_VIEW", 20, "AutoCompleteTextView", AppCompatAutoCompleteTextView.class);
    public static final UnqualifiedClassTag BUTTON = new UnqualifiedClassTag("BUTTON", 21, "Button", AppCompatButton.class);
    public static final UnqualifiedClassTag CHECK_BOX = new UnqualifiedClassTag("CHECK_BOX", 22, "CheckBox", AppCompatCheckBox.class);
    public static final UnqualifiedClassTag CHECKED_TEXT_VIEW = new UnqualifiedClassTag("CHECKED_TEXT_VIEW", 23, "CheckedTextView", AppCompatCheckedTextView.class);
    public static final UnqualifiedClassTag EDIT_TEXT = new UnqualifiedClassTag("EDIT_TEXT", 24, "EditText", AppCompatEditText.class);
    public static final UnqualifiedClassTag IMAGE_BUTTON = new UnqualifiedClassTag("IMAGE_BUTTON", 25, "ImageButton", AppCompatImageButton.class);
    public static final UnqualifiedClassTag IMAGE_VIEW = new UnqualifiedClassTag("IMAGE_VIEW", 26, "ImageView", AppCompatImageView.class);
    public static final UnqualifiedClassTag MULTI_AUTO_COMPLETE_TEXT_VIEW = new UnqualifiedClassTag("MULTI_AUTO_COMPLETE_TEXT_VIEW", 27, "MultiAutoCompleteTextView", AppCompatMultiAutoCompleteTextView.class);
    public static final UnqualifiedClassTag RADIO_BUTTON = new UnqualifiedClassTag("RADIO_BUTTON", 28, "RadioButton", AppCompatRadioButton.class);
    public static final UnqualifiedClassTag RATING_BAR = new UnqualifiedClassTag("RATING_BAR", 29, "RatingBar", AppCompatRatingBar.class);
    public static final UnqualifiedClassTag SEEK_BAR = new UnqualifiedClassTag("SEEK_BAR", 30, "SeekBar", AppCompatSeekBar.class);
    public static final UnqualifiedClassTag SPINNER = new UnqualifiedClassTag("SPINNER", 31, "Spinner", AppCompatSpinner.class);
    public static final UnqualifiedClassTag TEXT_VIEW = new UnqualifiedClassTag("TEXT_VIEW", 32, "TextView", AppCompatTextView.class);
    public static final UnqualifiedClassTag TOGGLE_BUTTON = new UnqualifiedClassTag("TOGGLE_BUTTON", 33, "ToggleButton", AppCompatToggleButton.class);

    private static final /* synthetic */ UnqualifiedClassTag[] $values() {
        return new UnqualifiedClassTag[]{CALENDAR_VIEW, DATE_PICKER, FRAME_LAYOUT, GRID_LAYOUT, GRID_VIEW, HORIZONTAL_SCROLL_VIEW, LINEAR_LAYOUT, LIST_VIEW, NUMBER_PICKER, PROGRESS_BAR, RADIO_GROUP, RELATIVE_LAYOUT, SCROLL_VIEW, SPACE, TEXT_SWITCHER, VIDEO_VIEW, VIEW, VIEW_ANIMATOR, VIEW_STUB, WEB_VIEW, AUTO_COMPLETE_TEXT_VIEW, BUTTON, CHECK_BOX, CHECKED_TEXT_VIEW, EDIT_TEXT, IMAGE_BUTTON, IMAGE_VIEW, MULTI_AUTO_COMPLETE_TEXT_VIEW, RADIO_BUTTON, RATING_BAR, SEEK_BAR, SPINNER, TEXT_VIEW, TOGGLE_BUTTON};
    }

    public static EnumEntries<UnqualifiedClassTag> getEntries() {
        return $ENTRIES;
    }

    private UnqualifiedClassTag(String str, int i, String str2, Class cls) {
        this.viewName = str2;
        this.implementationClass = cls;
        if (!UnqualifiedClassTag2.isUnqualifiedClassTag(str2)) {
            throw new IllegalArgumentException(("Tag name must be an unqualified class name: " + str2).toString());
        }
        String name = cls.getName();
        Intrinsics.checkNotNull(name);
        if (!StringsKt.startsWith$default(name, "android.", false, 2, (Object) null) && !StringsKt.startsWith$default(name, "androidx.appcompat.", false, 2, (Object) null)) {
            throw new IllegalArgumentException(("Class must be located either in the framework or AppCompat: " + name).toString());
        }
        this.constructor = cls.getDeclaredConstructor(Context.class, AttributeSet.class);
    }

    public final String getViewName() {
        return this.viewName;
    }

    public final Class<? extends View> getImplementationClass() {
        return this.implementationClass;
    }

    static {
        UnqualifiedClassTag[] unqualifiedClassTagArr$values = $values();
        $VALUES = unqualifiedClassTagArr$values;
        $ENTRIES = EnumEntries2.enumEntries(unqualifiedClassTagArr$values);
        INSTANCE = new Companion(null);
        UnqualifiedClassTag[] unqualifiedClassTagArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(unqualifiedClassTagArrValues.length), 16));
        for (UnqualifiedClassTag unqualifiedClassTag : unqualifiedClassTagArrValues) {
            linkedHashMap.put(unqualifiedClassTag.viewName, unqualifiedClassTag);
        }
        mapping = linkedHashMap;
    }

    public final View create(Context context, AttributeSet attrs) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewNewInstance = this.constructor.newInstance(context, attrs);
        Intrinsics.checkNotNullExpressionValue(viewNewInstance, "newInstance(...)");
        return viewNewInstance;
    }

    /* compiled from: UnqualifiedClassTag.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/scarlet/view/UnqualifiedClassTag$Companion;", "", "<init>", "()V", "mapping", "", "", "Lcom/robinhood/scarlet/view/UnqualifiedClassTag;", "from", "tagName", "attrs", "Landroid/util/AttributeSet;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UnqualifiedClassTag from(String tagName, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(tagName, "tagName");
            String viewName = LayoutTags.INSTANCE.getViewName(tagName, attrs);
            if (viewName == null) {
                return null;
            }
            return (UnqualifiedClassTag) UnqualifiedClassTag.mapping.get(viewName);
        }
    }

    public static UnqualifiedClassTag valueOf(String str) {
        return (UnqualifiedClassTag) Enum.valueOf(UnqualifiedClassTag.class, str);
    }

    public static UnqualifiedClassTag[] values() {
        return (UnqualifiedClassTag[]) $VALUES.clone();
    }
}
