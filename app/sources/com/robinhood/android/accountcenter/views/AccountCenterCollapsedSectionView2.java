package com.robinhood.android.accountcenter.views;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.accountcenter.AccountCenterAdapter;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountCenterCollapsedSectionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.accountcenter.views.AccountCenterCollapsedSectionView$Content$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountCenterCollapsedSectionView2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UiTypedAccountCenterItem.CollapsedSectionItem $section;
    final /* synthetic */ AccountCenterCollapsedSectionView this$0;

    AccountCenterCollapsedSectionView2(UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem, AccountCenterCollapsedSectionView accountCenterCollapsedSectionView) {
        this.$section = collapsedSectionItem;
        this.this$0 = accountCenterCollapsedSectionView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(Composer composer, int i) {
        int i2 = 2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611612234, i, -1, "com.robinhood.android.accountcenter.views.AccountCenterCollapsedSectionView.Content.<anonymous>.<anonymous> (AccountCenterCollapsedSectionView.kt:43)");
        }
        UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem = this.$section;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
        try {
            builder.append(collapsedSectionItem.getTitle());
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            AnnotatedString annotatedString = builder.toAnnotatedString();
            String subtitle = this.$section.getSubtitle();
            AnnotatedString annotatedString2 = subtitle != null ? new AnnotatedString(subtitle, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0) : null;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$section);
            final AccountCenterCollapsedSectionView accountCenterCollapsedSectionView = this.this$0;
            final UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem2 = this.$section;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterCollapsedSectionView$Content$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountCenterCollapsedSectionView2.invoke$lambda$4$lambda$3(accountCenterCollapsedSectionView, collapsedSectionItem2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString, annotatedString2, null, null, null, false, false, false, false, false, 0L, (Function0) objRememberedValue, composer, 0, 0, 8179);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(AccountCenterCollapsedSectionView accountCenterCollapsedSectionView, UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem) {
        AccountCenterAdapter.Callbacks callbacks = accountCenterCollapsedSectionView.getCallbacks();
        if (callbacks != null) {
            callbacks.onCollapsedSectionClicked(collapsedSectionItem);
        }
        return Unit.INSTANCE;
    }
}
