package io.bitdrift.capture.replay.internal.mappers;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import io.bitdrift.capture.replay.ReplayType;
import io.bitdrift.capture.replay.internal.ReplayRect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TextMapper.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J,\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J4\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0003J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/mappers/TextMapper;", "Lio/bitdrift/capture/replay/internal/mappers/Mapper;", "textMapperConfig", "Lio/bitdrift/capture/replay/internal/mappers/TextMapperConfig;", "(Lio/bitdrift/capture/replay/internal/mappers/TextMapperConfig;)V", "addDrawables", "", "view", "Landroid/widget/TextView;", "list", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "alignHorizontal", "alignment", "", "gravity", "bounds", "Landroid/graphics/Rect;", "alignVertical", "totalLinesHeight", "map", "Landroid/view/View;", "retrieveLine", "", "line", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class TextMapper extends Mapper {
    private final TextMapperConfig textMapperConfig;

    public /* synthetic */ TextMapper(TextMapperConfig textMapperConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TextMapperConfig(false, 4) : textMapperConfig);
    }

    public TextMapper(TextMapperConfig textMapperConfig) {
        Intrinsics.checkNotNullParameter(textMapperConfig, "textMapperConfig");
        this.textMapperConfig = textMapperConfig;
    }

    @Override // io.bitdrift.capture.replay.internal.mappers.Mapper
    public List<ReplayRect> map(View view) {
        Rect rect;
        float fHeight;
        TextMapper textMapper = this;
        Intrinsics.checkNotNullParameter(view, "view");
        List<ReplayRect> map = super.map(view);
        if (!(view instanceof TextView)) {
            return map;
        }
        Rect rect2 = new Rect();
        if (textMapper.textMapperConfig.getShowViewOutline()) {
            Mapper.addView$default(textMapper, null, view, map, 1, null);
        }
        TextView textView = (TextView) view;
        if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            return map;
        }
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() <= 0 || textView.getLayout() == null) {
            return map;
        }
        textView.getPaint().getTextBounds(textView.getText().toString(), 0, textView.getText().length(), rect2);
        float fHeight2 = rect2.height();
        float lineSpacingExtra = (textView.getLineSpacingExtra() + textMapper.textMapperConfig.getInterlinePadding() + fHeight2) * textView.getLayout().getLineCount();
        int lineCount = textView.getLayout().getLineCount();
        float lineSpacingExtra2 = 0.0f;
        int i = 0;
        while (i < lineCount) {
            String strRetrieveLine = textMapper.retrieveLine(textView, i);
            textView.getPaint().getTextBounds(strRetrieveLine, 0, strRetrieveLine.length(), rect2);
            if (StringsKt.trim(strRetrieveLine).toString().length() > 0) {
                fHeight = lineSpacingExtra2 + rect2.height();
                rect = rect2;
                alignHorizontal$default(textMapper, textView, 0, 0, rect, 6, null);
                textMapper = this;
                alignVertical$default(textMapper, textView, 0, 0, rect, (int) lineSpacingExtra, 6, null);
                textMapper.alignInScreen(rect);
                map.add(new ReplayRect(ReplayType.Label.INSTANCE, rect.left, rect.top + ((int) fHeight), rect.width(), rect.height()));
            } else {
                rect = rect2;
                fHeight = lineSpacingExtra2 + fHeight2;
            }
            lineSpacingExtra2 = textView.getLineSpacingExtra() + textMapper.textMapperConfig.getInterlinePadding() + fHeight;
            i++;
            rect2 = rect;
        }
        textMapper.addDrawables(textView, map);
        return map;
    }

    private final void addDrawables(TextView view, List<ReplayRect> list) {
        Drawable drawable = view.getCompoundDrawables()[0];
        if (drawable != null) {
            Rect rect = new Rect(drawable.getBounds());
            if (!rect.isEmpty()) {
                rect.offset(view.getPaddingStart(), (view.getHeight() - rect.height()) / 2);
                alignInScreen(rect);
                list.add(new ReplayRect(ReplayType.Image.INSTANCE, rect.left, rect.top, rect.width(), rect.height()));
            }
        }
        Drawable drawable2 = view.getCompoundDrawables()[1];
        if (drawable2 != null) {
            Rect rect2 = new Rect(drawable2.getBounds());
            if (!rect2.isEmpty()) {
                rect2.offset((view.getWidth() - rect2.width()) / 2, view.getPaddingTop());
                alignInScreen(rect2);
                list.add(new ReplayRect(ReplayType.Image.INSTANCE, rect2.left, rect2.top, rect2.width(), rect2.height()));
            }
        }
        Drawable drawable3 = view.getCompoundDrawables()[2];
        if (drawable3 != null) {
            Rect rect3 = new Rect(drawable3.getBounds());
            if (!rect3.isEmpty()) {
                rect3.offset((view.getWidth() - view.getPaddingEnd()) - rect3.width(), (view.getHeight() - rect3.height()) / 2);
                alignInScreen(rect3);
                list.add(new ReplayRect(ReplayType.Image.INSTANCE, rect3.left, rect3.top, rect3.width(), rect3.height()));
            }
        }
        Drawable drawable4 = view.getCompoundDrawables()[3];
        if (drawable4 != null) {
            Rect rect4 = new Rect(drawable4.getBounds());
            if (rect4.isEmpty()) {
                return;
            }
            rect4.offset((view.getWidth() - rect4.width()) / 2, (view.getHeight() - view.getPaddingBottom()) - rect4.height());
            alignInScreen(rect4);
            list.add(new ReplayRect(ReplayType.Image.INSTANCE, rect4.left, rect4.top, rect4.width(), rect4.height()));
        }
    }

    private final String retrieveLine(TextView view, int line) {
        int lineStart = view.getLayout().getLineStart(line);
        int lineEnd = view.getLayout().getLineEnd(line);
        CharSequence text = view.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text.subSequence(lineStart, lineEnd).toString();
    }

    static /* synthetic */ void alignHorizontal$default(TextMapper textMapper, TextView textView, int i, int i2, Rect rect, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = textView.getTextAlignment();
        }
        if ((i3 & 4) != 0) {
            i2 = textView.getGravity();
        }
        textMapper.alignHorizontal(textView, i, i2, rect);
    }

    @SuppressLint({"SwitchIntDef", "RtlHardcoded"})
    private final void alignHorizontal(TextView view, int alignment, int gravity, Rect bounds) {
        switch (alignment) {
            case 1:
                int i = gravity & 7;
                if (i == 1) {
                    bounds.offset((((view.getWidth() + view.getCompoundPaddingStart()) - view.getCompoundPaddingEnd()) - bounds.width()) / 2, 0);
                    break;
                } else if (i == 3) {
                    bounds.offset(view.getCompoundPaddingStart(), 0);
                    break;
                } else if (i == 5) {
                    bounds.offset(view.getWidth() - bounds.width(), 0);
                    break;
                }
                break;
            case 2:
            case 5:
                bounds.offset(view.getCompoundPaddingStart(), 0);
                break;
            case 3:
            case 6:
                bounds.offset(view.getWidth() - bounds.width(), 0);
                break;
            case 4:
                bounds.offset((view.getWidth() - bounds.width()) / 2, 0);
                break;
        }
    }

    static /* synthetic */ void alignVertical$default(TextMapper textMapper, TextView textView, int i, int i2, Rect rect, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = textView.getTextAlignment();
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = textView.getGravity();
        }
        textMapper.alignVertical(textView, i5, i2, rect, i3);
    }

    @SuppressLint({"SwitchIntDef"})
    private final void alignVertical(TextView view, int alignment, int gravity, Rect bounds, int totalLinesHeight) {
        if (alignment != 1) {
            if (alignment != 4) {
                return;
            }
            bounds.offset(0, (view.getHeight() - totalLinesHeight) / 2);
            return;
        }
        int i = gravity & 112;
        if (i == 16) {
            bounds.offset(0, (((view.getHeight() + view.getCompoundPaddingTop()) - view.getCompoundPaddingBottom()) - totalLinesHeight) / 2);
        } else if (i == 48) {
            bounds.offset(0, view.getCompoundPaddingTop());
        } else {
            if (i != 80) {
                return;
            }
            bounds.offset(0, view.getHeight() - totalLinesHeight);
        }
    }
}
