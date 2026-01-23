package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.D4 */
/* loaded from: classes16.dex */
public final class C5824D4 {

    /* renamed from: com.plaid.internal.D4$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1321a;

        static {
            int[] iArr = new int[Pane$PaneRendering.EnumC6734b.values().length];
            try {
                iArr[Pane$PaneRendering.EnumC6734b.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.CREDENTIALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.BUTTON_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.BUTTON_WITH_ACCORDION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.BUTTON_WITH_CARDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.BUTTON_WITH_TABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.BUTTON_WITH_WEBVIEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.GRID_SELECTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.SEARCH_AND_SELECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.USER_INPUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.USER_SELECTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.OAUTH.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.ORDERED_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.HEADLESS_O_AUTH.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.QR_CODE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.CONSENT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.CHALLENGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.RENDERING_NOT_SET.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.LOADING.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.FLEXIBLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.SESSION_HANDOFF.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.VARIABLE_HEIGHT_BUTTON.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.VARIABLE_HEIGHT_VERIFICATION_CODE_INPUT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.IDENTITY_DATA_SHARING.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.CLIENT_SUBMISSION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.PROFILE_AUTHENTICATION.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            f1321a = iArr;
        }
    }

    /* renamed from: a */
    public static final Pane$PaneOutput.C6730a m1174a(Pane$PaneRendering pane$PaneRendering) {
        Intrinsics.checkNotNullParameter(pane$PaneRendering, "<this>");
        Pane$PaneOutput.C6730a c6730aM1445b = Pane$PaneOutput.newBuilder().m1444a(pane$PaneRendering.getPaneNodeId()).m1445b(pane$PaneRendering.getId());
        Pane$PaneRendering.EnumC6734b renderingCase = pane$PaneRendering.getRenderingCase();
        switch (renderingCase == null ? -1 : a.f1321a[renderingCase.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
                return c6730aM1445b.m1440a(ButtonPaneOuterClass$ButtonPane.Actions.newBuilder().m1435a(ButtonPaneOuterClass$ButtonPane.Actions.ExitAction.getDefaultInstance()));
            case 8:
                return c6730aM1445b.m1441a(ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.newBuilder().m1436a(ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.ExitAction.getDefaultInstance()));
            case 11:
                return c6730aM1445b.m1443a(SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.newBuilder().m1446a(SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.ExitAction.getDefaultInstance()));
        }
    }
}
