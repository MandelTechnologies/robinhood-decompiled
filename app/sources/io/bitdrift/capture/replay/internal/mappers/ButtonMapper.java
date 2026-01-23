package io.bitdrift.capture.replay.internal.mappers;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.CompoundButtonCompat;
import io.bitdrift.capture.replay.ReplayType;
import io.bitdrift.capture.replay.internal.ReplayRect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ButtonMapper.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J>\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/mappers/ButtonMapper;", "Lio/bitdrift/capture/replay/internal/mappers/Mapper;", "buttonMapperConfig", "Lio/bitdrift/capture/replay/internal/mappers/ButtonMapperConfig;", "switchConfig", "Lio/bitdrift/capture/replay/internal/mappers/SwitchConfig;", "(Lio/bitdrift/capture/replay/internal/mappers/ButtonMapperConfig;Lio/bitdrift/capture/replay/internal/mappers/SwitchConfig;)V", "addButton", "", "type", "Lio/bitdrift/capture/replay/ReplayType;", "left", "", "top", "width", "height", "list", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "map", "view", "Landroid/view/View;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ButtonMapper extends Mapper {
    private final ButtonMapperConfig buttonMapperConfig;
    private final SwitchConfig switchConfig;

    public /* synthetic */ ButtonMapper(ButtonMapperConfig buttonMapperConfig, SwitchConfig switchConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ButtonMapperConfig(8, 8, 8, 8) : buttonMapperConfig, (i & 2) != 0 ? new SwitchConfig(5, 2, 1) : switchConfig);
    }

    public ButtonMapper(ButtonMapperConfig buttonMapperConfig, SwitchConfig switchConfig) {
        Intrinsics.checkNotNullParameter(buttonMapperConfig, "buttonMapperConfig");
        Intrinsics.checkNotNullParameter(switchConfig, "switchConfig");
        this.buttonMapperConfig = buttonMapperConfig;
        this.switchConfig = switchConfig;
    }

    @Override // io.bitdrift.capture.replay.internal.mappers.Mapper
    public List<ReplayRect> map(View view) {
        Rect bounds;
        ReplayType replayType;
        Rect bounds2;
        Rect bounds3;
        Intrinsics.checkNotNullParameter(view, "view");
        List<ReplayRect> map = super.map(view);
        if (view instanceof SwitchCompat) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            Drawable thumbDrawable = switchCompat.getThumbDrawable();
            if (thumbDrawable != null && (bounds3 = thumbDrawable.getBounds()) != null) {
                int iWidth = bounds3.width() * this.switchConfig.getWidthRatio();
                int iHeight = bounds3.height() * this.switchConfig.getHeightRatio();
                if (switchCompat.isChecked()) {
                    addButton(ReplayType.SwitchOn.INSTANCE, getViewOriginX() + ((bounds3.left - bounds3.width()) - switchCompat.getSwitchPadding()) + this.switchConfig.getPaddingStart(), getViewOriginY() + bounds3.top, iWidth, iHeight, map);
                    return map;
                }
                addButton(ReplayType.SwitchOff.INSTANCE, getViewOriginX() + ((bounds3.left + switchCompat.getSwitchPadding()) - this.switchConfig.getPaddingStart()), getViewOriginY() + bounds3.top, iWidth, iHeight, map);
                return map;
            }
        } else {
            ButtonMapper buttonMapper = this;
            if (view instanceof ImageButton) {
                addView(ReplayType.Image.INSTANCE, view, map);
                return map;
            }
            if (view instanceof CompoundButton) {
                CompoundButton compoundButton = (CompoundButton) view;
                Drawable[] compoundDrawables = compoundButton.getCompoundDrawables();
                Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
                int length = compoundDrawables.length;
                int i = 0;
                while (i < length) {
                    Drawable drawable = compoundDrawables[i];
                    if (drawable != null && (bounds2 = drawable.getBounds()) != null) {
                        buttonMapper.addButton(ReplayType.Image.INSTANCE, getViewOriginX() + bounds2.left, getViewOriginY() + bounds2.top, bounds2.width(), bounds2.height(), map);
                    }
                    i++;
                    buttonMapper = this;
                }
                Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(compoundButton);
                if (buttonDrawable != null && (bounds = buttonDrawable.getBounds()) != null) {
                    if (compoundButton.isChecked()) {
                        replayType = ReplayType.Button.INSTANCE;
                    } else {
                        replayType = ReplayType.View.INSTANCE;
                    }
                    addButton(replayType, getViewOriginX() + bounds.left, getViewOriginY() + bounds.top, bounds.width(), bounds.height(), map);
                    return map;
                }
            } else if (view instanceof Button) {
                Button button = (Button) view;
                addButton(ReplayType.Button.INSTANCE, getViewOriginX(), getViewOriginY(), button.getWidth(), button.getHeight(), map);
            }
        }
        return map;
    }

    private final void addButton(ReplayType type2, int left, int top, int width, int height, List<ReplayRect> list) {
        list.add(new ReplayRect(type2, left + this.buttonMapperConfig.getPaddingStart(), top + this.buttonMapperConfig.getPaddingTop(), (width - this.buttonMapperConfig.getPaddingStart()) - this.buttonMapperConfig.getPaddingEnd(), (height - this.buttonMapperConfig.getPaddingTop()) - this.buttonMapperConfig.getPaddingBottom()));
    }
}
